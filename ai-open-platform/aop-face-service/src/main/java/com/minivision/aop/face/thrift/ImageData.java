package com.minivision.aop.face.thrift;
/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-08-24")
public class ImageData implements org.apache.thrift.TBase<ImageData, ImageData._Fields>, java.io.Serializable, Cloneable, Comparable<ImageData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ImageData");

  private static final org.apache.thrift.protocol.TField IMGDATA_FIELD_DESC = new org.apache.thrift.protocol.TField("imgdata", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USE_AGE_ATTRIBUTE_FIELD_DESC = new org.apache.thrift.protocol.TField("use_age_attribute", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField USE_GENDER_ATTRIBUTE_FIELD_DESC = new org.apache.thrift.protocol.TField("use_gender_attribute", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField USE_FACE_FEATURES_FIELD_DESC = new org.apache.thrift.protocol.TField("use_face_features", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ImageDataStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ImageDataTupleSchemeFactory();

  public java.nio.ByteBuffer imgdata; // required
  public boolean use_age_attribute; // required
  public boolean use_gender_attribute; // required
  public boolean use_face_features; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IMGDATA((short)1, "imgdata"),
    USE_AGE_ATTRIBUTE((short)2, "use_age_attribute"),
    USE_GENDER_ATTRIBUTE((short)3, "use_gender_attribute"),
    USE_FACE_FEATURES((short)4, "use_face_features");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // IMGDATA
          return IMGDATA;
        case 2: // USE_AGE_ATTRIBUTE
          return USE_AGE_ATTRIBUTE;
        case 3: // USE_GENDER_ATTRIBUTE
          return USE_GENDER_ATTRIBUTE;
        case 4: // USE_FACE_FEATURES
          return USE_FACE_FEATURES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __USE_AGE_ATTRIBUTE_ISSET_ID = 0;
  private static final int __USE_GENDER_ATTRIBUTE_ISSET_ID = 1;
  private static final int __USE_FACE_FEATURES_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IMGDATA, new org.apache.thrift.meta_data.FieldMetaData("imgdata", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.USE_AGE_ATTRIBUTE, new org.apache.thrift.meta_data.FieldMetaData("use_age_attribute", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.USE_GENDER_ATTRIBUTE, new org.apache.thrift.meta_data.FieldMetaData("use_gender_attribute", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.USE_FACE_FEATURES, new org.apache.thrift.meta_data.FieldMetaData("use_face_features", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ImageData.class, metaDataMap);
  }

  public ImageData() {
  }

  public ImageData(
    java.nio.ByteBuffer imgdata,
    boolean use_age_attribute,
    boolean use_gender_attribute,
    boolean use_face_features)
  {
    this();
    this.imgdata = org.apache.thrift.TBaseHelper.copyBinary(imgdata);
    this.use_age_attribute = use_age_attribute;
    setUse_age_attributeIsSet(true);
    this.use_gender_attribute = use_gender_attribute;
    setUse_gender_attributeIsSet(true);
    this.use_face_features = use_face_features;
    setUse_face_featuresIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ImageData(ImageData other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetImgdata()) {
      this.imgdata = org.apache.thrift.TBaseHelper.copyBinary(other.imgdata);
    }
    this.use_age_attribute = other.use_age_attribute;
    this.use_gender_attribute = other.use_gender_attribute;
    this.use_face_features = other.use_face_features;
  }

  public ImageData deepCopy() {
    return new ImageData(this);
  }

  @Override
  public void clear() {
    this.imgdata = null;
    setUse_age_attributeIsSet(false);
    this.use_age_attribute = false;
    setUse_gender_attributeIsSet(false);
    this.use_gender_attribute = false;
    setUse_face_featuresIsSet(false);
    this.use_face_features = false;
  }

  public byte[] getImgdata() {
    setImgdata(org.apache.thrift.TBaseHelper.rightSize(imgdata));
    return imgdata == null ? null : imgdata.array();
  }

  public java.nio.ByteBuffer bufferForImgdata() {
    return org.apache.thrift.TBaseHelper.copyBinary(imgdata);
  }

  public ImageData setImgdata(byte[] imgdata) {
    this.imgdata = imgdata == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(imgdata.clone());
    return this;
  }

  public ImageData setImgdata(java.nio.ByteBuffer imgdata) {
    this.imgdata = org.apache.thrift.TBaseHelper.copyBinary(imgdata);
    return this;
  }

  public void unsetImgdata() {
    this.imgdata = null;
  }

  /** Returns true if field imgdata is set (has been assigned a value) and false otherwise */
  public boolean isSetImgdata() {
    return this.imgdata != null;
  }

  public void setImgdataIsSet(boolean value) {
    if (!value) {
      this.imgdata = null;
    }
  }

  public boolean isUse_age_attribute() {
    return this.use_age_attribute;
  }

  public ImageData setUse_age_attribute(boolean use_age_attribute) {
    this.use_age_attribute = use_age_attribute;
    setUse_age_attributeIsSet(true);
    return this;
  }

  public void unsetUse_age_attribute() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USE_AGE_ATTRIBUTE_ISSET_ID);
  }

  /** Returns true if field use_age_attribute is set (has been assigned a value) and false otherwise */
  public boolean isSetUse_age_attribute() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USE_AGE_ATTRIBUTE_ISSET_ID);
  }

  public void setUse_age_attributeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USE_AGE_ATTRIBUTE_ISSET_ID, value);
  }

  public boolean isUse_gender_attribute() {
    return this.use_gender_attribute;
  }

  public ImageData setUse_gender_attribute(boolean use_gender_attribute) {
    this.use_gender_attribute = use_gender_attribute;
    setUse_gender_attributeIsSet(true);
    return this;
  }

  public void unsetUse_gender_attribute() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USE_GENDER_ATTRIBUTE_ISSET_ID);
  }

  /** Returns true if field use_gender_attribute is set (has been assigned a value) and false otherwise */
  public boolean isSetUse_gender_attribute() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USE_GENDER_ATTRIBUTE_ISSET_ID);
  }

  public void setUse_gender_attributeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USE_GENDER_ATTRIBUTE_ISSET_ID, value);
  }

  public boolean isUse_face_features() {
    return this.use_face_features;
  }

  public ImageData setUse_face_features(boolean use_face_features) {
    this.use_face_features = use_face_features;
    setUse_face_featuresIsSet(true);
    return this;
  }

  public void unsetUse_face_features() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USE_FACE_FEATURES_ISSET_ID);
  }

  /** Returns true if field use_face_features is set (has been assigned a value) and false otherwise */
  public boolean isSetUse_face_features() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USE_FACE_FEATURES_ISSET_ID);
  }

  public void setUse_face_featuresIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USE_FACE_FEATURES_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case IMGDATA:
      if (value == null) {
        unsetImgdata();
      } else {
        if (value instanceof byte[]) {
          setImgdata((byte[])value);
        } else {
          setImgdata((java.nio.ByteBuffer)value);
        }
      }
      break;

    case USE_AGE_ATTRIBUTE:
      if (value == null) {
        unsetUse_age_attribute();
      } else {
        setUse_age_attribute((java.lang.Boolean)value);
      }
      break;

    case USE_GENDER_ATTRIBUTE:
      if (value == null) {
        unsetUse_gender_attribute();
      } else {
        setUse_gender_attribute((java.lang.Boolean)value);
      }
      break;

    case USE_FACE_FEATURES:
      if (value == null) {
        unsetUse_face_features();
      } else {
        setUse_face_features((java.lang.Boolean)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case IMGDATA:
      return getImgdata();

    case USE_AGE_ATTRIBUTE:
      return isUse_age_attribute();

    case USE_GENDER_ATTRIBUTE:
      return isUse_gender_attribute();

    case USE_FACE_FEATURES:
      return isUse_face_features();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case IMGDATA:
      return isSetImgdata();
    case USE_AGE_ATTRIBUTE:
      return isSetUse_age_attribute();
    case USE_GENDER_ATTRIBUTE:
      return isSetUse_gender_attribute();
    case USE_FACE_FEATURES:
      return isSetUse_face_features();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ImageData)
      return this.equals((ImageData)that);
    return false;
  }

  public boolean equals(ImageData that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_imgdata = true && this.isSetImgdata();
    boolean that_present_imgdata = true && that.isSetImgdata();
    if (this_present_imgdata || that_present_imgdata) {
      if (!(this_present_imgdata && that_present_imgdata))
        return false;
      if (!this.imgdata.equals(that.imgdata))
        return false;
    }

    boolean this_present_use_age_attribute = true;
    boolean that_present_use_age_attribute = true;
    if (this_present_use_age_attribute || that_present_use_age_attribute) {
      if (!(this_present_use_age_attribute && that_present_use_age_attribute))
        return false;
      if (this.use_age_attribute != that.use_age_attribute)
        return false;
    }

    boolean this_present_use_gender_attribute = true;
    boolean that_present_use_gender_attribute = true;
    if (this_present_use_gender_attribute || that_present_use_gender_attribute) {
      if (!(this_present_use_gender_attribute && that_present_use_gender_attribute))
        return false;
      if (this.use_gender_attribute != that.use_gender_attribute)
        return false;
    }

    boolean this_present_use_face_features = true;
    boolean that_present_use_face_features = true;
    if (this_present_use_face_features || that_present_use_face_features) {
      if (!(this_present_use_face_features && that_present_use_face_features))
        return false;
      if (this.use_face_features != that.use_face_features)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetImgdata()) ? 131071 : 524287);
    if (isSetImgdata())
      hashCode = hashCode * 8191 + imgdata.hashCode();

    hashCode = hashCode * 8191 + ((use_age_attribute) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((use_gender_attribute) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((use_face_features) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(ImageData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetImgdata()).compareTo(other.isSetImgdata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImgdata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.imgdata, other.imgdata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUse_age_attribute()).compareTo(other.isSetUse_age_attribute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUse_age_attribute()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.use_age_attribute, other.use_age_attribute);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUse_gender_attribute()).compareTo(other.isSetUse_gender_attribute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUse_gender_attribute()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.use_gender_attribute, other.use_gender_attribute);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUse_face_features()).compareTo(other.isSetUse_face_features());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUse_face_features()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.use_face_features, other.use_face_features);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageData(");
    boolean first = true;

    sb.append("imgdata:");
    if (this.imgdata == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.imgdata, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("use_age_attribute:");
    sb.append(this.use_age_attribute);
    first = false;
    if (!first) sb.append(", ");
    sb.append("use_gender_attribute:");
    sb.append(this.use_gender_attribute);
    first = false;
    if (!first) sb.append(", ");
    sb.append("use_face_features:");
    sb.append(this.use_face_features);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ImageDataStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ImageDataStandardScheme getScheme() {
      return new ImageDataStandardScheme();
    }
  }

  private static class ImageDataStandardScheme extends org.apache.thrift.scheme.StandardScheme<ImageData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ImageData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IMGDATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.imgdata = iprot.readBinary();
              struct.setImgdataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USE_AGE_ATTRIBUTE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.use_age_attribute = iprot.readBool();
              struct.setUse_age_attributeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USE_GENDER_ATTRIBUTE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.use_gender_attribute = iprot.readBool();
              struct.setUse_gender_attributeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USE_FACE_FEATURES
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.use_face_features = iprot.readBool();
              struct.setUse_face_featuresIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ImageData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.imgdata != null) {
        oprot.writeFieldBegin(IMGDATA_FIELD_DESC);
        oprot.writeBinary(struct.imgdata);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(USE_AGE_ATTRIBUTE_FIELD_DESC);
      oprot.writeBool(struct.use_age_attribute);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(USE_GENDER_ATTRIBUTE_FIELD_DESC);
      oprot.writeBool(struct.use_gender_attribute);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(USE_FACE_FEATURES_FIELD_DESC);
      oprot.writeBool(struct.use_face_features);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ImageDataTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ImageDataTupleScheme getScheme() {
      return new ImageDataTupleScheme();
    }
  }

  private static class ImageDataTupleScheme extends org.apache.thrift.scheme.TupleScheme<ImageData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ImageData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetImgdata()) {
        optionals.set(0);
      }
      if (struct.isSetUse_age_attribute()) {
        optionals.set(1);
      }
      if (struct.isSetUse_gender_attribute()) {
        optionals.set(2);
      }
      if (struct.isSetUse_face_features()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetImgdata()) {
        oprot.writeBinary(struct.imgdata);
      }
      if (struct.isSetUse_age_attribute()) {
        oprot.writeBool(struct.use_age_attribute);
      }
      if (struct.isSetUse_gender_attribute()) {
        oprot.writeBool(struct.use_gender_attribute);
      }
      if (struct.isSetUse_face_features()) {
        oprot.writeBool(struct.use_face_features);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ImageData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.imgdata = iprot.readBinary();
        struct.setImgdataIsSet(true);
      }
      if (incoming.get(1)) {
        struct.use_age_attribute = iprot.readBool();
        struct.setUse_age_attributeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.use_gender_attribute = iprot.readBool();
        struct.setUse_gender_attributeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.use_face_features = iprot.readBool();
        struct.setUse_face_featuresIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
