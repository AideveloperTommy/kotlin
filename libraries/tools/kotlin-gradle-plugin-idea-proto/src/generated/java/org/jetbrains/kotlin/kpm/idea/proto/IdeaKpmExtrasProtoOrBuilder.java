// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_idea_kpm_extras.proto

package org.jetbrains.kotlin.kpm.idea.proto;

interface IdeaKpmExtrasProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.kpm.idea.proto.IdeaKpmExtrasProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, bytes&gt; values = 1;</code>
   */
  int getValuesCount();
  /**
   * <code>map&lt;string, bytes&gt; values = 1;</code>
   */
  boolean containsValues(
      java.lang.String key);
  /**
   * Use {@link #getValuesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.ByteString>
  getValues();
  /**
   * <code>map&lt;string, bytes&gt; values = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.ByteString>
  getValuesMap();
  /**
   * <code>map&lt;string, bytes&gt; values = 1;</code>
   */

  com.google.protobuf.ByteString getValuesOrDefault(
      java.lang.String key,
      com.google.protobuf.ByteString defaultValue);
  /**
   * <code>map&lt;string, bytes&gt; values = 1;</code>
   */

  com.google.protobuf.ByteString getValuesOrThrow(
      java.lang.String key);
}
