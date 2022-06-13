// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto}
 */
final class IdeaKpmSchemaInfoProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto)
    IdeaKpmSchemaInfoProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IdeaKpmSchemaInfoProto.newBuilder() to construct.
  private IdeaKpmSchemaInfoProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IdeaKpmSchemaInfoProto() {
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IdeaKpmSchemaInfoProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IdeaKpmSchemaInfoProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            bitField0_ |= 0x00000001;
            sinceSchemaVersionMajor_ = input.readUInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            sinceSchemaVersionMinor_ = input.readUInt32();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            sinceSchemaVersionPatch_ = input.readUInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000008;
            message_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmSchemaInfoProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmSchemaInfoProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto.class, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto.Builder.class);
  }

  private int bitField0_;
  public static final int SINCE_SCHEMA_VERSION_MAJOR_FIELD_NUMBER = 1;
  private int sinceSchemaVersionMajor_;
  /**
   * <code>optional uint32 since_schema_version_major = 1;</code>
   * @return Whether the sinceSchemaVersionMajor field is set.
   */
  @java.lang.Override
  public boolean hasSinceSchemaVersionMajor() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional uint32 since_schema_version_major = 1;</code>
   * @return The sinceSchemaVersionMajor.
   */
  @java.lang.Override
  public int getSinceSchemaVersionMajor() {
    return sinceSchemaVersionMajor_;
  }

  public static final int SINCE_SCHEMA_VERSION_MINOR_FIELD_NUMBER = 2;
  private int sinceSchemaVersionMinor_;
  /**
   * <code>optional uint32 since_schema_version_minor = 2;</code>
   * @return Whether the sinceSchemaVersionMinor field is set.
   */
  @java.lang.Override
  public boolean hasSinceSchemaVersionMinor() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional uint32 since_schema_version_minor = 2;</code>
   * @return The sinceSchemaVersionMinor.
   */
  @java.lang.Override
  public int getSinceSchemaVersionMinor() {
    return sinceSchemaVersionMinor_;
  }

  public static final int SINCE_SCHEMA_VERSION_PATCH_FIELD_NUMBER = 3;
  private int sinceSchemaVersionPatch_;
  /**
   * <code>optional uint32 since_schema_version_patch = 3;</code>
   * @return Whether the sinceSchemaVersionPatch field is set.
   */
  @java.lang.Override
  public boolean hasSinceSchemaVersionPatch() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional uint32 since_schema_version_patch = 3;</code>
   * @return The sinceSchemaVersionPatch.
   */
  @java.lang.Override
  public int getSinceSchemaVersionPatch() {
    return sinceSchemaVersionPatch_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 4;
  private volatile java.lang.Object message_;
  /**
   * <code>optional string message = 4;</code>
   * @return Whether the message field is set.
   */
  @java.lang.Override
  public boolean hasMessage() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional string message = 4;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>optional string message = 4;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeUInt32(1, sinceSchemaVersionMajor_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(2, sinceSchemaVersionMinor_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt32(3, sinceSchemaVersionPatch_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, message_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, sinceSchemaVersionMajor_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, sinceSchemaVersionMinor_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, sinceSchemaVersionPatch_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, message_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto)) {
      return super.equals(obj);
    }
    org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto other = (org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto) obj;

    if (hasSinceSchemaVersionMajor() != other.hasSinceSchemaVersionMajor()) return false;
    if (hasSinceSchemaVersionMajor()) {
      if (getSinceSchemaVersionMajor()
          != other.getSinceSchemaVersionMajor()) return false;
    }
    if (hasSinceSchemaVersionMinor() != other.hasSinceSchemaVersionMinor()) return false;
    if (hasSinceSchemaVersionMinor()) {
      if (getSinceSchemaVersionMinor()
          != other.getSinceSchemaVersionMinor()) return false;
    }
    if (hasSinceSchemaVersionPatch() != other.hasSinceSchemaVersionPatch()) return false;
    if (hasSinceSchemaVersionPatch()) {
      if (getSinceSchemaVersionPatch()
          != other.getSinceSchemaVersionPatch()) return false;
    }
    if (hasMessage() != other.hasMessage()) return false;
    if (hasMessage()) {
      if (!getMessage()
          .equals(other.getMessage())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasSinceSchemaVersionMajor()) {
      hash = (37 * hash) + SINCE_SCHEMA_VERSION_MAJOR_FIELD_NUMBER;
      hash = (53 * hash) + getSinceSchemaVersionMajor();
    }
    if (hasSinceSchemaVersionMinor()) {
      hash = (37 * hash) + SINCE_SCHEMA_VERSION_MINOR_FIELD_NUMBER;
      hash = (53 * hash) + getSinceSchemaVersionMinor();
    }
    if (hasSinceSchemaVersionPatch()) {
      hash = (37 * hash) + SINCE_SCHEMA_VERSION_PATCH_FIELD_NUMBER;
      hash = (53 * hash) + getSinceSchemaVersionPatch();
    }
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto)
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmSchemaInfoProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmSchemaInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto.class, org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto.Builder.class);
    }

    // Construct using org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sinceSchemaVersionMajor_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      sinceSchemaVersionMinor_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      sinceSchemaVersionPatch_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      message_ = "";
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpm.internal_static_org_jetbrains_kotlin_kpm_idea_proto_IdeaKpmSchemaInfoProto_descriptor;
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto getDefaultInstanceForType() {
      return org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto build() {
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto buildPartial() {
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto result = new org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sinceSchemaVersionMajor_ = sinceSchemaVersionMajor_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sinceSchemaVersionMinor_ = sinceSchemaVersionMinor_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sinceSchemaVersionPatch_ = sinceSchemaVersionPatch_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        to_bitField0_ |= 0x00000008;
      }
      result.message_ = message_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto) {
        return mergeFrom((org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto other) {
      if (other == org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto.getDefaultInstance()) return this;
      if (other.hasSinceSchemaVersionMajor()) {
        setSinceSchemaVersionMajor(other.getSinceSchemaVersionMajor());
      }
      if (other.hasSinceSchemaVersionMinor()) {
        setSinceSchemaVersionMinor(other.getSinceSchemaVersionMinor());
      }
      if (other.hasSinceSchemaVersionPatch()) {
        setSinceSchemaVersionPatch(other.getSinceSchemaVersionPatch());
      }
      if (other.hasMessage()) {
        bitField0_ |= 0x00000008;
        message_ = other.message_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int sinceSchemaVersionMajor_ ;
    /**
     * <code>optional uint32 since_schema_version_major = 1;</code>
     * @return Whether the sinceSchemaVersionMajor field is set.
     */
    @java.lang.Override
    public boolean hasSinceSchemaVersionMajor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional uint32 since_schema_version_major = 1;</code>
     * @return The sinceSchemaVersionMajor.
     */
    @java.lang.Override
    public int getSinceSchemaVersionMajor() {
      return sinceSchemaVersionMajor_;
    }
    /**
     * <code>optional uint32 since_schema_version_major = 1;</code>
     * @param value The sinceSchemaVersionMajor to set.
     * @return This builder for chaining.
     */
    public Builder setSinceSchemaVersionMajor(int value) {
      bitField0_ |= 0x00000001;
      sinceSchemaVersionMajor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 since_schema_version_major = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSinceSchemaVersionMajor() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sinceSchemaVersionMajor_ = 0;
      onChanged();
      return this;
    }

    private int sinceSchemaVersionMinor_ ;
    /**
     * <code>optional uint32 since_schema_version_minor = 2;</code>
     * @return Whether the sinceSchemaVersionMinor field is set.
     */
    @java.lang.Override
    public boolean hasSinceSchemaVersionMinor() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional uint32 since_schema_version_minor = 2;</code>
     * @return The sinceSchemaVersionMinor.
     */
    @java.lang.Override
    public int getSinceSchemaVersionMinor() {
      return sinceSchemaVersionMinor_;
    }
    /**
     * <code>optional uint32 since_schema_version_minor = 2;</code>
     * @param value The sinceSchemaVersionMinor to set.
     * @return This builder for chaining.
     */
    public Builder setSinceSchemaVersionMinor(int value) {
      bitField0_ |= 0x00000002;
      sinceSchemaVersionMinor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 since_schema_version_minor = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSinceSchemaVersionMinor() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sinceSchemaVersionMinor_ = 0;
      onChanged();
      return this;
    }

    private int sinceSchemaVersionPatch_ ;
    /**
     * <code>optional uint32 since_schema_version_patch = 3;</code>
     * @return Whether the sinceSchemaVersionPatch field is set.
     */
    @java.lang.Override
    public boolean hasSinceSchemaVersionPatch() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional uint32 since_schema_version_patch = 3;</code>
     * @return The sinceSchemaVersionPatch.
     */
    @java.lang.Override
    public int getSinceSchemaVersionPatch() {
      return sinceSchemaVersionPatch_;
    }
    /**
     * <code>optional uint32 since_schema_version_patch = 3;</code>
     * @param value The sinceSchemaVersionPatch to set.
     * @return This builder for chaining.
     */
    public Builder setSinceSchemaVersionPatch(int value) {
      bitField0_ |= 0x00000004;
      sinceSchemaVersionPatch_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 since_schema_version_patch = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSinceSchemaVersionPatch() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sinceSchemaVersionPatch_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>optional string message = 4;</code>
     * @return Whether the message field is set.
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string message = 4;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string message = 4;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string message = 4;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string message = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      bitField0_ = (bitField0_ & ~0x00000008);
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>optional string message = 4;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000008;
      message_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto)
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto)
  private static final org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto();
  }

  public static org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IdeaKpmSchemaInfoProto>
      PARSER = new com.google.protobuf.AbstractParser<IdeaKpmSchemaInfoProto>() {
    @java.lang.Override
    public IdeaKpmSchemaInfoProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IdeaKpmSchemaInfoProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IdeaKpmSchemaInfoProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IdeaKpmSchemaInfoProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSchemaInfoProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

