// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package com.univer.base.grpc.message;

public final class Message {
  private Message() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_message_MessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_message_MessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_message_MessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_message_MessageResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmessage.proto\022\007message\"\"\n\016MessageReque" +
      "st\022\020\n\010jsonData\030\001 \001(\t\"#\n\017MessageResponse\022" +
      "\020\n\010jsonData\030\001 \001(\t2P\n\016MessageService\022>\n\007c" +
      "aptcha\022\027.message.MessageRequest\032\030.messag" +
      "e.MessageResponse\"\000B)\n\034com.univer.base.g" +
      "rpc.messageB\007MessageP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_message_MessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_message_MessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_message_MessageRequest_descriptor,
        new java.lang.String[] { "JsonData", });
    internal_static_message_MessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_message_MessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_message_MessageResponse_descriptor,
        new java.lang.String[] { "JsonData", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
