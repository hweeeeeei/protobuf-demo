package com.example.protobufdemo.model;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: static/single_text_request.proto

public final class SingleTextRequestModel {
  private SingleTextRequestModel() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SingleTextRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SingleTextRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string receiver = 1;</code>
     * @return The receiver.
     */
    String getReceiver();
    /**
     * <code>string receiver = 1;</code>
     * @return The bytes for receiver.
     */
    com.google.protobuf.ByteString
        getReceiverBytes();

    /**
     * <code>string roomId = 2;</code>
     * @return The roomId.
     */
    String getRoomId();
    /**
     * <code>string roomId = 2;</code>
     * @return The bytes for roomId.
     */
    com.google.protobuf.ByteString
        getRoomIdBytes();

    /**
     * <code>string backId = 3;</code>
     * @return The backId.
     */
    String getBackId();
    /**
     * <code>string backId = 3;</code>
     * @return The bytes for backId.
     */
    com.google.protobuf.ByteString
        getBackIdBytes();

    /**
     * <code>string content = 4;</code>
     * @return The content.
     */
    String getContent();
    /**
     * <code>string content = 4;</code>
     * @return The bytes for content.
     */
    com.google.protobuf.ByteString
        getContentBytes();
  }
  /**
   * Protobuf type {@code SingleTextRequest}
   */
  public  static final class SingleTextRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SingleTextRequest)
      SingleTextRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SingleTextRequest.newBuilder() to construct.
    private SingleTextRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SingleTextRequest() {
      receiver_ = "";
      roomId_ = "";
      backId_ = "";
      content_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new SingleTextRequest();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SingleTextRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
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
            case 10: {
              String s = input.readStringRequireUtf8();

              receiver_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              roomId_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              backId_ = s;
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();

              content_ = s;
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
      return SingleTextRequestModel.internal_static_SingleTextRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SingleTextRequestModel.internal_static_SingleTextRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SingleTextRequest.class, Builder.class);
    }

    public static final int RECEIVER_FIELD_NUMBER = 1;
    private volatile Object receiver_;
    /**
     * <code>string receiver = 1;</code>
     * @return The receiver.
     */
    public String getReceiver() {
      Object ref = receiver_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        receiver_ = s;
        return s;
      }
    }
    /**
     * <code>string receiver = 1;</code>
     * @return The bytes for receiver.
     */
    public com.google.protobuf.ByteString
        getReceiverBytes() {
      Object ref = receiver_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        receiver_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ROOMID_FIELD_NUMBER = 2;
    private volatile Object roomId_;
    /**
     * <code>string roomId = 2;</code>
     * @return The roomId.
     */
    public String getRoomId() {
      Object ref = roomId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        roomId_ = s;
        return s;
      }
    }
    /**
     * <code>string roomId = 2;</code>
     * @return The bytes for roomId.
     */
    public com.google.protobuf.ByteString
        getRoomIdBytes() {
      Object ref = roomId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        roomId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BACKID_FIELD_NUMBER = 3;
    private volatile Object backId_;
    /**
     * <code>string backId = 3;</code>
     * @return The backId.
     */
    public String getBackId() {
      Object ref = backId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        backId_ = s;
        return s;
      }
    }
    /**
     * <code>string backId = 3;</code>
     * @return The bytes for backId.
     */
    public com.google.protobuf.ByteString
        getBackIdBytes() {
      Object ref = backId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        backId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTENT_FIELD_NUMBER = 4;
    private volatile Object content_;
    /**
     * <code>string content = 4;</code>
     * @return The content.
     */
    public String getContent() {
      Object ref = content_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        content_ = s;
        return s;
      }
    }
    /**
     * <code>string content = 4;</code>
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getReceiverBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, receiver_);
      }
      if (!getRoomIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, roomId_);
      }
      if (!getBackIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, backId_);
      }
      if (!getContentBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, content_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getReceiverBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, receiver_);
      }
      if (!getRoomIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, roomId_);
      }
      if (!getBackIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, backId_);
      }
      if (!getContentBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, content_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SingleTextRequest)) {
        return super.equals(obj);
      }
      SingleTextRequest other = (SingleTextRequest) obj;

      if (!getReceiver()
          .equals(other.getReceiver())) return false;
      if (!getRoomId()
          .equals(other.getRoomId())) return false;
      if (!getBackId()
          .equals(other.getBackId())) return false;
      if (!getContent()
          .equals(other.getContent())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RECEIVER_FIELD_NUMBER;
      hash = (53 * hash) + getReceiver().hashCode();
      hash = (37 * hash) + ROOMID_FIELD_NUMBER;
      hash = (53 * hash) + getRoomId().hashCode();
      hash = (37 * hash) + BACKID_FIELD_NUMBER;
      hash = (53 * hash) + getBackId().hashCode();
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SingleTextRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SingleTextRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SingleTextRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SingleTextRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SingleTextRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SingleTextRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SingleTextRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SingleTextRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SingleTextRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SingleTextRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SingleTextRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SingleTextRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SingleTextRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code SingleTextRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SingleTextRequest)
        SingleTextRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SingleTextRequestModel.internal_static_SingleTextRequest_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SingleTextRequestModel.internal_static_SingleTextRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SingleTextRequest.class, Builder.class);
      }

      // Construct using SingleTextRequestModel.SingleTextRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        receiver_ = "";

        roomId_ = "";

        backId_ = "";

        content_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SingleTextRequestModel.internal_static_SingleTextRequest_descriptor;
      }

      @Override
      public SingleTextRequest getDefaultInstanceForType() {
        return SingleTextRequest.getDefaultInstance();
      }

      @Override
      public SingleTextRequest build() {
        SingleTextRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public SingleTextRequest buildPartial() {
        SingleTextRequest result = new SingleTextRequest(this);
        result.receiver_ = receiver_;
        result.roomId_ = roomId_;
        result.backId_ = backId_;
        result.content_ = content_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SingleTextRequest) {
          return mergeFrom((SingleTextRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SingleTextRequest other) {
        if (other == SingleTextRequest.getDefaultInstance()) return this;
        if (!other.getReceiver().isEmpty()) {
          receiver_ = other.receiver_;
          onChanged();
        }
        if (!other.getRoomId().isEmpty()) {
          roomId_ = other.roomId_;
          onChanged();
        }
        if (!other.getBackId().isEmpty()) {
          backId_ = other.backId_;
          onChanged();
        }
        if (!other.getContent().isEmpty()) {
          content_ = other.content_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        SingleTextRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SingleTextRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object receiver_ = "";
      /**
       * <code>string receiver = 1;</code>
       * @return The receiver.
       */
      public String getReceiver() {
        Object ref = receiver_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          receiver_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string receiver = 1;</code>
       * @return The bytes for receiver.
       */
      public com.google.protobuf.ByteString
          getReceiverBytes() {
        Object ref = receiver_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          receiver_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string receiver = 1;</code>
       * @param value The receiver to set.
       * @return This builder for chaining.
       */
      public Builder setReceiver(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        receiver_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string receiver = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReceiver() {
        
        receiver_ = getDefaultInstance().getReceiver();
        onChanged();
        return this;
      }
      /**
       * <code>string receiver = 1;</code>
       * @param value The bytes for receiver to set.
       * @return This builder for chaining.
       */
      public Builder setReceiverBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        receiver_ = value;
        onChanged();
        return this;
      }

      private Object roomId_ = "";
      /**
       * <code>string roomId = 2;</code>
       * @return The roomId.
       */
      public String getRoomId() {
        Object ref = roomId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          roomId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string roomId = 2;</code>
       * @return The bytes for roomId.
       */
      public com.google.protobuf.ByteString
          getRoomIdBytes() {
        Object ref = roomId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          roomId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string roomId = 2;</code>
       * @param value The roomId to set.
       * @return This builder for chaining.
       */
      public Builder setRoomId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        roomId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string roomId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoomId() {
        
        roomId_ = getDefaultInstance().getRoomId();
        onChanged();
        return this;
      }
      /**
       * <code>string roomId = 2;</code>
       * @param value The bytes for roomId to set.
       * @return This builder for chaining.
       */
      public Builder setRoomIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        roomId_ = value;
        onChanged();
        return this;
      }

      private Object backId_ = "";
      /**
       * <code>string backId = 3;</code>
       * @return The backId.
       */
      public String getBackId() {
        Object ref = backId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          backId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string backId = 3;</code>
       * @return The bytes for backId.
       */
      public com.google.protobuf.ByteString
          getBackIdBytes() {
        Object ref = backId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          backId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string backId = 3;</code>
       * @param value The backId to set.
       * @return This builder for chaining.
       */
      public Builder setBackId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        backId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string backId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBackId() {
        
        backId_ = getDefaultInstance().getBackId();
        onChanged();
        return this;
      }
      /**
       * <code>string backId = 3;</code>
       * @param value The bytes for backId to set.
       * @return This builder for chaining.
       */
      public Builder setBackIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        backId_ = value;
        onChanged();
        return this;
      }

      private Object content_ = "";
      /**
       * <code>string content = 4;</code>
       * @return The content.
       */
      public String getContent() {
        Object ref = content_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string content = 4;</code>
       * @return The bytes for content.
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string content = 4;</code>
       * @param value The content to set.
       * @return This builder for chaining.
       */
      public Builder setContent(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string content = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearContent() {
        
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>string content = 4;</code>
       * @param value The bytes for content to set.
       * @return This builder for chaining.
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        content_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SingleTextRequest)
    }

    // @@protoc_insertion_point(class_scope:SingleTextRequest)
    private static final SingleTextRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SingleTextRequest();
    }

    public static SingleTextRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SingleTextRequest>
        PARSER = new com.google.protobuf.AbstractParser<SingleTextRequest>() {
      @Override
      public SingleTextRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SingleTextRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SingleTextRequest> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<SingleTextRequest> getParserForType() {
      return PARSER;
    }

    @Override
    public SingleTextRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SingleTextRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SingleTextRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n static/single_text_request.proto\"V\n\021Si" +
      "ngleTextRequest\022\020\n\010receiver\030\001 \001(\t\022\016\n\006roo" +
      "mId\030\002 \001(\t\022\016\n\006backId\030\003 \001(\t\022\017\n\007content\030\004 \001" +
      "(\tB\030B\026SingleTextRequestModelb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SingleTextRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SingleTextRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SingleTextRequest_descriptor,
        new String[] { "Receiver", "RoomId", "BackId", "Content", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
