/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.helloWorld.avro;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CustomerV2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6831065594937074243L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CustomerV2\",\"namespace\":\"com.helloWorld.hbk\",\"fields\":[{\"name\":\"firstName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"First Name of Customer\"},{\"name\":\"lastName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Last Name of Customer\"},{\"name\":\"age\",\"type\":\"int\",\"doc\":\"Age at the time of registration\"},{\"name\":\"height\",\"type\":\"float\",\"doc\":\"Height at the time of registration in cm\"},{\"name\":\"weight\",\"type\":\"float\",\"doc\":\"Weight at the time of registration in kg\"},{\"name\":\"phoneNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"optional phone number\",\"default\":null},{\"name\":\"email\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"email address\",\"default\":\"missing@example.com\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CustomerV2> ENCODER =
      new BinaryMessageEncoder<CustomerV2>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CustomerV2> DECODER =
      new BinaryMessageDecoder<CustomerV2>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<CustomerV2> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<CustomerV2> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CustomerV2>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this CustomerV2 to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a CustomerV2 from a ByteBuffer. */
  public static CustomerV2 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** First Name of Customer */
   private String firstName;
  /** Last Name of Customer */
   private String lastName;
  /** Age at the time of registration */
   private int age;
  /** Height at the time of registration in cm */
   private float height;
  /** Weight at the time of registration in kg */
   private float weight;
  /** optional phone number */
   private String phoneNumber;
  /** email address */
   private String email;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CustomerV2() {}

  /**
   * All-args constructor.
   * @param firstName First Name of Customer
   * @param lastName Last Name of Customer
   * @param age Age at the time of registration
   * @param height Height at the time of registration in cm
   * @param weight Weight at the time of registration in kg
   * @param phoneNumber optional phone number
   * @param email email address
   */
  public CustomerV2(String firstName, String lastName, Integer age, Float height, Float weight, String phoneNumber, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return firstName;
    case 1: return lastName;
    case 2: return age;
    case 3: return height;
    case 4: return weight;
    case 5: return phoneNumber;
    case 6: return email;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: firstName = (String)value$; break;
    case 1: lastName = (String)value$; break;
    case 2: age = (Integer)value$; break;
    case 3: height = (Float)value$; break;
    case 4: weight = (Float)value$; break;
    case 5: phoneNumber = (String)value$; break;
    case 6: email = (String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return First Name of Customer
   */
  public String getFirstName() {
    return firstName;
  }


  /**
   * Gets the value of the 'lastName' field.
   * @return Last Name of Customer
   */
  public String getLastName() {
    return lastName;
  }


  /**
   * Gets the value of the 'age' field.
   * @return Age at the time of registration
   */
  public Integer getAge() {
    return age;
  }


  /**
   * Gets the value of the 'height' field.
   * @return Height at the time of registration in cm
   */
  public Float getHeight() {
    return height;
  }


  /**
   * Gets the value of the 'weight' field.
   * @return Weight at the time of registration in kg
   */
  public Float getWeight() {
    return weight;
  }


  /**
   * Gets the value of the 'phoneNumber' field.
   * @return optional phone number
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }


  /**
   * Gets the value of the 'email' field.
   * @return email address
   */
  public String getEmail() {
    return email;
  }


  /**
   * Creates a new CustomerV2 RecordBuilder.
   * @return A new CustomerV2 RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new CustomerV2 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CustomerV2 RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }

  /**
   * Creates a new CustomerV2 RecordBuilder by copying an existing CustomerV2 instance.
   * @param other The existing instance to copy.
   * @return A new CustomerV2 RecordBuilder
   */
  public static Builder newBuilder(CustomerV2 other) {
    return new Builder(other);
  }

  /**
   * RecordBuilder for CustomerV2 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CustomerV2>
    implements org.apache.avro.data.RecordBuilder<CustomerV2> {

    /** First Name of Customer */
    private String firstName;
    /** Last Name of Customer */
    private String lastName;
    /** Age at the time of registration */
    private int age;
    /** Height at the time of registration in cm */
    private float height;
    /** Weight at the time of registration in kg */
    private float weight;
    /** optional phone number */
    private String phoneNumber;
    /** email address */
    private String email;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.height)) {
        this.height = data().deepCopy(fields()[3].schema(), other.height);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.weight)) {
        this.weight = data().deepCopy(fields()[4].schema(), other.weight);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.phoneNumber)) {
        this.phoneNumber = data().deepCopy(fields()[5].schema(), other.phoneNumber);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.email)) {
        this.email = data().deepCopy(fields()[6].schema(), other.email);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing CustomerV2 instance
     * @param other The existing instance to copy.
     */
    private Builder(CustomerV2 other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.height)) {
        this.height = data().deepCopy(fields()[3].schema(), other.height);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.weight)) {
        this.weight = data().deepCopy(fields()[4].schema(), other.weight);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.phoneNumber)) {
        this.phoneNumber = data().deepCopy(fields()[5].schema(), other.phoneNumber);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.email)) {
        this.email = data().deepCopy(fields()[6].schema(), other.email);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'firstName' field.
      * First Name of Customer
      * @return The value.
      */
    public String getFirstName() {
      return firstName;
    }

    /**
      * Sets the value of the 'firstName' field.
      * First Name of Customer
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public Builder setFirstName(String value) {
      validate(fields()[0], value);
      this.firstName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * First Name of Customer
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'firstName' field.
      * First Name of Customer
      * @return This builder.
      */
    public Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * Last Name of Customer
      * @return The value.
      */
    public String getLastName() {
      return lastName;
    }

    /**
      * Sets the value of the 'lastName' field.
      * Last Name of Customer
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public Builder setLastName(String value) {
      validate(fields()[1], value);
      this.lastName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * Last Name of Customer
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lastName' field.
      * Last Name of Customer
      * @return This builder.
      */
    public Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * Age at the time of registration
      * @return The value.
      */
    public Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * Age at the time of registration
      * @param value The value of 'age'.
      * @return This builder.
      */
    public Builder setAge(int value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * Age at the time of registration
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'age' field.
      * Age at the time of registration
      * @return This builder.
      */
    public Builder clearAge() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'height' field.
      * Height at the time of registration in cm
      * @return The value.
      */
    public Float getHeight() {
      return height;
    }

    /**
      * Sets the value of the 'height' field.
      * Height at the time of registration in cm
      * @param value The value of 'height'.
      * @return This builder.
      */
    public Builder setHeight(float value) {
      validate(fields()[3], value);
      this.height = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'height' field has been set.
      * Height at the time of registration in cm
      * @return True if the 'height' field has been set, false otherwise.
      */
    public boolean hasHeight() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'height' field.
      * Height at the time of registration in cm
      * @return This builder.
      */
    public Builder clearHeight() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'weight' field.
      * Weight at the time of registration in kg
      * @return The value.
      */
    public Float getWeight() {
      return weight;
    }

    /**
      * Sets the value of the 'weight' field.
      * Weight at the time of registration in kg
      * @param value The value of 'weight'.
      * @return This builder.
      */
    public Builder setWeight(float value) {
      validate(fields()[4], value);
      this.weight = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'weight' field has been set.
      * Weight at the time of registration in kg
      * @return True if the 'weight' field has been set, false otherwise.
      */
    public boolean hasWeight() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'weight' field.
      * Weight at the time of registration in kg
      * @return This builder.
      */
    public Builder clearWeight() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'phoneNumber' field.
      * optional phone number
      * @return The value.
      */
    public String getPhoneNumber() {
      return phoneNumber;
    }

    /**
      * Sets the value of the 'phoneNumber' field.
      * optional phone number
      * @param value The value of 'phoneNumber'.
      * @return This builder.
      */
    public Builder setPhoneNumber(String value) {
      validate(fields()[5], value);
      this.phoneNumber = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'phoneNumber' field has been set.
      * optional phone number
      * @return True if the 'phoneNumber' field has been set, false otherwise.
      */
    public boolean hasPhoneNumber() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'phoneNumber' field.
      * optional phone number
      * @return This builder.
      */
    public Builder clearPhoneNumber() {
      phoneNumber = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * email address
      * @return The value.
      */
    public String getEmail() {
      return email;
    }

    /**
      * Sets the value of the 'email' field.
      * email address
      * @param value The value of 'email'.
      * @return This builder.
      */
    public Builder setEmail(String value) {
      validate(fields()[6], value);
      this.email = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * email address
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'email' field.
      * email address
      * @return This builder.
      */
    public Builder clearEmail() {
      email = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CustomerV2 build() {
      try {
        CustomerV2 record = new CustomerV2();
        record.firstName = fieldSetFlags()[0] ? this.firstName : (String) defaultValue(fields()[0]);
        record.lastName = fieldSetFlags()[1] ? this.lastName : (String) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (Integer) defaultValue(fields()[2]);
        record.height = fieldSetFlags()[3] ? this.height : (Float) defaultValue(fields()[3]);
        record.weight = fieldSetFlags()[4] ? this.weight : (Float) defaultValue(fields()[4]);
        record.phoneNumber = fieldSetFlags()[5] ? this.phoneNumber : (String) defaultValue(fields()[5]);
        record.email = fieldSetFlags()[6] ? this.email : (String) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CustomerV2>
    WRITER$ = (org.apache.avro.io.DatumWriter<CustomerV2>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CustomerV2>
    READER$ = (org.apache.avro.io.DatumReader<CustomerV2>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}