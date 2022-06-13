// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

interface IdeaKpmFragmentProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
   * @return Whether the extras field is set.
   */
  boolean hasExtras();
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
   * @return The extras.
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto getExtras();
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto extras = 1;</code>
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProtoOrBuilder getExtrasOrBuilder();

  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentCoordinatesProto coordinates = 2;</code>
   * @return Whether the coordinates field is set.
   */
  boolean hasCoordinates();
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentCoordinatesProto coordinates = 2;</code>
   * @return The coordinates.
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentCoordinatesProto getCoordinates();
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentCoordinatesProto coordinates = 2;</code>
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmFragmentCoordinatesProtoOrBuilder getCoordinatesOrBuilder();

  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto platforms = 3;</code>
   */
  java.util.List<org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto> 
      getPlatformsList();
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto platforms = 3;</code>
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto getPlatforms(int index);
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto platforms = 3;</code>
   */
  int getPlatformsCount();
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto platforms = 3;</code>
   */
  java.util.List<? extends org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProtoOrBuilder> 
      getPlatformsOrBuilderList();
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProto platforms = 3;</code>
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmPlatformProtoOrBuilder getPlatformsOrBuilder(
      int index);

  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmLanguageSettingsProto language_settings = 4;</code>
   * @return Whether the languageSettings field is set.
   */
  boolean hasLanguageSettings();
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmLanguageSettingsProto language_settings = 4;</code>
   * @return The languageSettings.
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmLanguageSettingsProto getLanguageSettings();
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmLanguageSettingsProto language_settings = 4;</code>
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmLanguageSettingsProtoOrBuilder getLanguageSettingsOrBuilder();

  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmDependencyProto dependencies = 5;</code>
   */
  java.util.List<org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmDependencyProto> 
      getDependenciesList();
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmDependencyProto dependencies = 5;</code>
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmDependencyProto getDependencies(int index);
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmDependencyProto dependencies = 5;</code>
   */
  int getDependenciesCount();
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmDependencyProto dependencies = 5;</code>
   */
  java.util.List<? extends org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmDependencyProtoOrBuilder> 
      getDependenciesOrBuilderList();
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmDependencyProto dependencies = 5;</code>
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmDependencyProtoOrBuilder getDependenciesOrBuilder(
      int index);

  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSourceDirectoryProto source_directories = 6;</code>
   */
  java.util.List<org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSourceDirectoryProto> 
      getSourceDirectoriesList();
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSourceDirectoryProto source_directories = 6;</code>
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSourceDirectoryProto getSourceDirectories(int index);
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSourceDirectoryProto source_directories = 6;</code>
   */
  int getSourceDirectoriesCount();
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSourceDirectoryProto source_directories = 6;</code>
   */
  java.util.List<? extends org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSourceDirectoryProtoOrBuilder> 
      getSourceDirectoriesOrBuilderList();
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSourceDirectoryProto source_directories = 6;</code>
   */
  org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmSourceDirectoryProtoOrBuilder getSourceDirectoriesOrBuilder(
      int index);
}
