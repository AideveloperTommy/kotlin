/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.backend.common.serialization.signature

import org.jetbrains.kotlin.backend.common.serialization.mangle.MangleConstant
import org.jetbrains.kotlin.descriptors.ClassKind
import org.jetbrains.kotlin.descriptors.DescriptorVisibilities
import org.jetbrains.kotlin.ir.IrElement
import org.jetbrains.kotlin.ir.declarations.*
import org.jetbrains.kotlin.ir.symbols.IrFileSymbol
import org.jetbrains.kotlin.ir.symbols.IrPropertySymbol
import org.jetbrains.kotlin.ir.util.*
import org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid
import org.jetbrains.kotlin.ir.visitors.acceptVoid

class PublicIdSignatureComputer(val mangler: KotlinMangler.IrMangler) : IdSignatureComputer {

    private val publicSignatureBuilder = PublicIdSigBuilder()

    override fun computeSignature(declaration: IrDeclaration): IdSignature {
        return publicSignatureBuilder.buildSignature(declaration)
    }

    fun composePublicIdSignature(declaration: IrDeclaration, compatibleMode: Boolean): IdSignature {
        assert(mangler.run { declaration.isExported(compatibleMode) }) {
            "${declaration.render()} expected to be exported"
        }

        return publicSignatureBuilder.buildSignature(declaration)
    }

    private var currentFileSignatureX: IdSignature.FileSignature? = null

    override fun <R> inFile(file: IrFileSymbol?, block: () -> R): R {
        currentFileSignatureX = file?.let { IdSignature.FileSignature(it) }
        try {
            return block()
        } finally {
            currentFileSignatureX = null
        }
    }

    private fun IrDeclaration.checkIfPlatformSpecificExport(): Boolean = mangler.run { isPlatformSpecificExport() }

    private var localCounter: Long = 0
    private var scopeCounter: Int = 0

    fun reset() {
        localCounter = 0
        scopeCounter = 0
    }

    private inner class PublicIdSigBuilder : IdSignatureBuilder<IrDeclaration, KotlinMangler.IrMangler>(),
        IrElementVisitorVoid {

        override val mangler: KotlinMangler.IrMangler
            get() = this@PublicIdSignatureComputer.mangler

        override val currentFileSignature: IdSignature.FileSignature?
            get() = currentFileSignatureX

        override fun accept(d: IrDeclaration) {
            d.acceptVoid(this)
        }

        private fun collectParents(declaration: IrDeclarationWithName) {
            declaration.parent.acceptVoid(this)
            if (declaration !is IrClass || !declaration.isFacadeClass) {
                classFqnSegments.add(declaration.name.asString())
            }
        }

        override fun renderDeclarationForDescription(declaration: IrDeclaration): String = declaration.render()

        override fun visitElement(element: IrElement) =
            error("Unexpected element ${element.render()}")

        override fun visitErrorDeclaration(declaration: IrErrorDeclaration) {
            description = renderDeclarationForDescription(declaration)
        }

        override fun visitPackageFragment(declaration: IrPackageFragment) {
            packageFqn = declaration.packageFqName
        }

        private val IrDeclarationWithVisibility.isTopLevelPrivate: Boolean
            get() = visibility == DescriptorVisibilities.PRIVATE && !checkIfPlatformSpecificExport() &&
                    (parent is IrPackageFragment || parent.isFacadeClass)

        override fun visitClass(declaration: IrClass) {
            collectParents(declaration)
            isTopLevelPrivate = isTopLevelPrivate || declaration.isTopLevelPrivate
            if (declaration.kind == ClassKind.ENUM_ENTRY) {
                classFqnSegments.add(MangleConstant.ENUM_ENTRY_CLASS_NAME)
            }
            setDescriptionIfLocalDeclaration(declaration)
            setExpected(declaration.isExpect)
        }

        override fun visitSimpleFunction(declaration: IrSimpleFunction) {
            val property = declaration.correspondingPropertySymbol
            if (property != null) {
                property.owner.acceptVoid(this)
                if (container != null) {
                    createContainer()
                }
                setHashIdAndDescriptionFor(declaration, isPropertyAccessor = container == null)
                classFqnSegments.add(declaration.name.asString())
            } else {
                collectParents(declaration)
                isTopLevelPrivate = isTopLevelPrivate || declaration.isTopLevelPrivate
                setHashIdAndDescriptionFor(declaration, isPropertyAccessor = false)

                // If this is a local function, overwrite `description` with the IR function's rendered form.
                setDescriptionIfLocalDeclaration(declaration)
            }
            setExpected(declaration.isExpect)
        }

        override fun visitConstructor(declaration: IrConstructor) {
            collectParents(declaration)
            setHashIdAndDescriptionFor(declaration, isPropertyAccessor = false)
            setExpected(declaration.isExpect)
        }

        override fun visitScript(declaration: IrScript) {
            collectParents(declaration)
        }

        override fun visitProperty(declaration: IrProperty) {
            collectParents(declaration)
            isTopLevelPrivate = isTopLevelPrivate || declaration.isTopLevelPrivate
            setHashIdAndDescriptionFor(declaration, isPropertyAccessor = false)
            setExpected(declaration.isExpect)
        }

        override fun visitTypeAlias(declaration: IrTypeAlias) {
            collectParents(declaration)
            isTopLevelPrivate = isTopLevelPrivate || declaration.isTopLevelPrivate
        }

        override fun visitEnumEntry(declaration: IrEnumEntry) {
            collectParents(declaration)
        }

        override fun visitTypeParameter(declaration: IrTypeParameter) {
            val rawParent = declaration.parent

            val parent = if (rawParent is IrSimpleFunction) {
                rawParent.correspondingPropertySymbol?.owner ?: rawParent
            } else rawParent

            parent.accept(this, null)
            createContainer()

            if (parent is IrProperty && parent.setter == rawParent) {
                classFqnSegments.add(MangleConstant.TYPE_PARAMETER_MARKER_NAME_SETTER)
            } else {
                classFqnSegments.add(MangleConstant.TYPE_PARAMETER_MARKER_NAME)
            }
            setHashIdAndDescription(declaration.index.toLong(), renderDeclarationForDescription(declaration), isPropertyAccessor = false)
        }

        override fun visitField(declaration: IrField) {
            val prop = declaration.correspondingPropertySymbol?.owner

            if (prop != null) {
                // backing field
                prop.acceptVoid(this)
                createContainer()
                classFqnSegments.add(MangleConstant.BACKING_FIELD_NAME)
                setDescriptionIfLocalDeclaration(declaration)
            } else {
                collectParents(declaration)
                setHashIdAndDescriptionFor(declaration, isPropertyAccessor = false)
            }
        }
    }
}

class FileLocalIdSignatureComputer(
    val mangler: KotlinMangler.IrMangler,
    private val signatureByDeclaration: (declaration: IrDeclaration, compatibleMode: Boolean) -> IdSignature,
) {
    private var localIndex: Long = START_INDEX.toLong()
    private var scopeIndex: Int = START_INDEX

    private fun computeContainerIdSignature(
        correspondingPropertySymbol: IrPropertySymbol?,
        container: IrDeclarationParent,
        compatibleMode: Boolean,
    ): IdSignature {
        if (correspondingPropertySymbol != null)
            return signatureByDeclaration(correspondingPropertySymbol.owner, compatibleMode)

        return when (container) {
            is IrPackageFragment -> IdSignature.CommonSignature(
                packageFqName = container.packageFqName.asString(),
                declarationFqName = "",
                id = null,
                mask = 0,
                description = null,
            )
            is IrDeclaration -> signatureByDeclaration(container, compatibleMode)
            else -> error("Unexpected container ${container.render()}")
        }
    }

    fun computeFileLocalIdSignature(declaration: IrDeclaration, compatibleMode: Boolean): IdSignature = when (declaration) {
        is IrValueDeclaration -> IdSignature.ScopeLocalDeclaration(scopeIndex++, declaration.name.asString())
        is IrAnonymousInitializer -> IdSignature.ScopeLocalDeclaration(scopeIndex++, "ANON INIT")
        is IrLocalDelegatedProperty -> IdSignature.ScopeLocalDeclaration(scopeIndex++, declaration.name.asString())

        is IrField -> IdSignature.FileLocalSignature(
            container = computeContainerIdSignature(
                correspondingPropertySymbol = declaration.correspondingPropertySymbol,
                container = declaration.parent,
                compatibleMode = compatibleMode
            ),
            id = ++localIndex,
            description = null
        )

        is IrSimpleFunction -> IdSignature.FileLocalSignature(
            container = computeContainerIdSignature(
                correspondingPropertySymbol = declaration.correspondingPropertySymbol,
                container = declaration.parent,
                compatibleMode = compatibleMode
            ),
            id = if (declaration.isOverridableFunction()) {
                declaration.stableIndexForOverridableDeclaration(compatibleMode)
            } else {
                ++localIndex
            },
            description = declaration.render()
        )

        is IrProperty -> IdSignature.FileLocalSignature(
            container = computeContainerIdSignature(
                correspondingPropertySymbol = null,
                container = declaration.parent,
                compatibleMode = compatibleMode
            ),
            id = if (declaration.isOverridableProperty()) {
                declaration.stableIndexForOverridableDeclaration(compatibleMode)
            } else {
                ++localIndex
            },
            description = declaration.render()
        )

        else -> IdSignature.FileLocalSignature(
            container = computeContainerIdSignature(
                correspondingPropertySymbol = null,
                container = declaration.parent,
                compatibleMode = compatibleMode
            ),
            id = ++localIndex,
            description = declaration.render()
        )
    }

    private fun IrSimpleFunction.isOverridableFunction(): Boolean =
        !DescriptorVisibilities.isPrivate(visibility) && hasDispatchReceiver

    private fun IrProperty.isOverridableProperty(): Boolean =
        !DescriptorVisibilities.isPrivate(visibility) && (getter.hasDispatchReceiver || setter.hasDispatchReceiver)

    private val IrSimpleFunction?.hasDispatchReceiver: Boolean
        get() = this?.dispatchReceiverParameter != null

    /**
     * We shall have stable indices for overridable functions/properties in private containers to
     * always be able to match the deserialized function/property with the fake override (and substitute
     * the fake override with the real declaration) -- independently of the order in which other
     * private declarations are serialized (and in which their signatures are computed).
     */
    private fun IrOverridableDeclaration<*>.stableIndexForOverridableDeclaration(compatibleMode: Boolean): Long =
        mangler.run { this@stableIndexForOverridableDeclaration.signatureMangle(compatibleMode) }

    companion object {
        private const val START_INDEX = 0
    }
}
