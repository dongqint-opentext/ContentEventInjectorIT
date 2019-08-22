/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.opentext.bn.converters.avro.entity;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class NewTransactionInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -433489106041512636L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NewTransactionInfo\",\"namespace\":\"com.opentext.bn.converters.avro.entity\",\"fields\":[{\"name\":\"parentTransactionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"payloadRef\",\"type\":{\"type\":\"record\",\"name\":\"PayloadRef\",\"fields\":[{\"name\":\"payloadId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"payloadType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<NewTransactionInfo> ENCODER =
      new BinaryMessageEncoder<NewTransactionInfo>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<NewTransactionInfo> DECODER =
      new BinaryMessageDecoder<NewTransactionInfo>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<NewTransactionInfo> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<NewTransactionInfo> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<NewTransactionInfo>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this NewTransactionInfo to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a NewTransactionInfo from a ByteBuffer. */
  public static NewTransactionInfo fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String parentTransactionId;
   private com.opentext.bn.converters.avro.entity.PayloadRef payloadRef;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public NewTransactionInfo() {}

  /**
   * All-args constructor.
   * @param parentTransactionId The new value for parentTransactionId
   * @param payloadRef The new value for payloadRef
   */
  public NewTransactionInfo(java.lang.String parentTransactionId, com.opentext.bn.converters.avro.entity.PayloadRef payloadRef) {
    this.parentTransactionId = parentTransactionId;
    this.payloadRef = payloadRef;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return parentTransactionId;
    case 1: return payloadRef;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: parentTransactionId = (java.lang.String)value$; break;
    case 1: payloadRef = (com.opentext.bn.converters.avro.entity.PayloadRef)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'parentTransactionId' field.
   * @return The value of the 'parentTransactionId' field.
   */
  public java.lang.String getParentTransactionId() {
    return parentTransactionId;
  }


  /**
   * Gets the value of the 'payloadRef' field.
   * @return The value of the 'payloadRef' field.
   */
  public com.opentext.bn.converters.avro.entity.PayloadRef getPayloadRef() {
    return payloadRef;
  }


  /**
   * Creates a new NewTransactionInfo RecordBuilder.
   * @return A new NewTransactionInfo RecordBuilder
   */
  public static com.opentext.bn.converters.avro.entity.NewTransactionInfo.Builder newBuilder() {
    return new com.opentext.bn.converters.avro.entity.NewTransactionInfo.Builder();
  }

  /**
   * Creates a new NewTransactionInfo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new NewTransactionInfo RecordBuilder
   */
  public static com.opentext.bn.converters.avro.entity.NewTransactionInfo.Builder newBuilder(com.opentext.bn.converters.avro.entity.NewTransactionInfo.Builder other) {
    return new com.opentext.bn.converters.avro.entity.NewTransactionInfo.Builder(other);
  }

  /**
   * Creates a new NewTransactionInfo RecordBuilder by copying an existing NewTransactionInfo instance.
   * @param other The existing instance to copy.
   * @return A new NewTransactionInfo RecordBuilder
   */
  public static com.opentext.bn.converters.avro.entity.NewTransactionInfo.Builder newBuilder(com.opentext.bn.converters.avro.entity.NewTransactionInfo other) {
    return new com.opentext.bn.converters.avro.entity.NewTransactionInfo.Builder(other);
  }

  /**
   * RecordBuilder for NewTransactionInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NewTransactionInfo>
    implements org.apache.avro.data.RecordBuilder<NewTransactionInfo> {

    private java.lang.String parentTransactionId;
    private com.opentext.bn.converters.avro.entity.PayloadRef payloadRef;
    private com.opentext.bn.converters.avro.entity.PayloadRef.Builder payloadRefBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.opentext.bn.converters.avro.entity.NewTransactionInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.parentTransactionId)) {
        this.parentTransactionId = data().deepCopy(fields()[0].schema(), other.parentTransactionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.payloadRef)) {
        this.payloadRef = data().deepCopy(fields()[1].schema(), other.payloadRef);
        fieldSetFlags()[1] = true;
      }
      if (other.hasPayloadRefBuilder()) {
        this.payloadRefBuilder = com.opentext.bn.converters.avro.entity.PayloadRef.newBuilder(other.getPayloadRefBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing NewTransactionInfo instance
     * @param other The existing instance to copy.
     */
    private Builder(com.opentext.bn.converters.avro.entity.NewTransactionInfo other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.parentTransactionId)) {
        this.parentTransactionId = data().deepCopy(fields()[0].schema(), other.parentTransactionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.payloadRef)) {
        this.payloadRef = data().deepCopy(fields()[1].schema(), other.payloadRef);
        fieldSetFlags()[1] = true;
      }
      this.payloadRefBuilder = null;
    }

    /**
      * Gets the value of the 'parentTransactionId' field.
      * @return The value.
      */
    public java.lang.String getParentTransactionId() {
      return parentTransactionId;
    }

    /**
      * Sets the value of the 'parentTransactionId' field.
      * @param value The value of 'parentTransactionId'.
      * @return This builder.
      */
    public com.opentext.bn.converters.avro.entity.NewTransactionInfo.Builder setParentTransactionId(java.lang.String value) {
      validate(fields()[0], value);
      this.parentTransactionId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'parentTransactionId' field has been set.
      * @return True if the 'parentTransactionId' field has been set, false otherwise.
      */
    public boolean hasParentTransactionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'parentTransactionId' field.
      * @return This builder.
      */
    public com.opentext.bn.converters.avro.entity.NewTransactionInfo.Builder clearParentTransactionId() {
      parentTransactionId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'payloadRef' field.
      * @return The value.
      */
    public com.opentext.bn.converters.avro.entity.PayloadRef getPayloadRef() {
      return payloadRef;
    }

    /**
      * Sets the value of the 'payloadRef' field.
      * @param value The value of 'payloadRef'.
      * @return This builder.
      */
    public com.opentext.bn.converters.avro.entity.NewTransactionInfo.Builder setPayloadRef(com.opentext.bn.converters.avro.entity.PayloadRef value) {
      validate(fields()[1], value);
      this.payloadRefBuilder = null;
      this.payloadRef = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'payloadRef' field has been set.
      * @return True if the 'payloadRef' field has been set, false otherwise.
      */
    public boolean hasPayloadRef() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'payloadRef' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.opentext.bn.converters.avro.entity.PayloadRef.Builder getPayloadRefBuilder() {
      if (payloadRefBuilder == null) {
        if (hasPayloadRef()) {
          setPayloadRefBuilder(com.opentext.bn.converters.avro.entity.PayloadRef.newBuilder(payloadRef));
        } else {
          setPayloadRefBuilder(com.opentext.bn.converters.avro.entity.PayloadRef.newBuilder());
        }
      }
      return payloadRefBuilder;
    }

    /**
     * Sets the Builder instance for the 'payloadRef' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.opentext.bn.converters.avro.entity.NewTransactionInfo.Builder setPayloadRefBuilder(com.opentext.bn.converters.avro.entity.PayloadRef.Builder value) {
      clearPayloadRef();
      payloadRefBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'payloadRef' field has an active Builder instance
     * @return True if the 'payloadRef' field has an active Builder instance
     */
    public boolean hasPayloadRefBuilder() {
      return payloadRefBuilder != null;
    }

    /**
      * Clears the value of the 'payloadRef' field.
      * @return This builder.
      */
    public com.opentext.bn.converters.avro.entity.NewTransactionInfo.Builder clearPayloadRef() {
      payloadRef = null;
      payloadRefBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public NewTransactionInfo build() {
      try {
        NewTransactionInfo record = new NewTransactionInfo();
        record.parentTransactionId = fieldSetFlags()[0] ? this.parentTransactionId : (java.lang.String) defaultValue(fields()[0]);
        if (payloadRefBuilder != null) {
          record.payloadRef = this.payloadRefBuilder.build();
        } else {
          record.payloadRef = fieldSetFlags()[1] ? this.payloadRef : (com.opentext.bn.converters.avro.entity.PayloadRef) defaultValue(fields()[1]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<NewTransactionInfo>
    WRITER$ = (org.apache.avro.io.DatumWriter<NewTransactionInfo>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<NewTransactionInfo>
    READER$ = (org.apache.avro.io.DatumReader<NewTransactionInfo>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}