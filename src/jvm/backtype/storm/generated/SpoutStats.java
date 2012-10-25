/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpoutStats implements org.apache.thrift7.TBase<SpoutStats, SpoutStats._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift7.protocol.TStruct STRUCT_DESC = new org.apache.thrift7.protocol.TStruct("SpoutStats");

  private static final org.apache.thrift7.protocol.TField ACKED_FIELD_DESC = new org.apache.thrift7.protocol.TField("acked", org.apache.thrift7.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift7.protocol.TField FAILED_FIELD_DESC = new org.apache.thrift7.protocol.TField("failed", org.apache.thrift7.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift7.protocol.TField COMPLETE_MS_AVG_FIELD_DESC = new org.apache.thrift7.protocol.TField("complete_ms_avg", org.apache.thrift7.protocol.TType.MAP, (short)3);

  private Map<String,Map<String,Long>> acked; // required
  private Map<String,Map<String,Long>> failed; // required
  private Map<String,Map<String,Double>> complete_ms_avg; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift7.TFieldIdEnum {
    ACKED((short)1, "acked"),
    FAILED((short)2, "failed"),
    COMPLETE_MS_AVG((short)3, "complete_ms_avg");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ACKED
          return ACKED;
        case 2: // FAILED
          return FAILED;
        case 3: // COMPLETE_MS_AVG
          return COMPLETE_MS_AVG;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift7.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACKED, new org.apache.thrift7.meta_data.FieldMetaData("acked", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING), 
            new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
                new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING), 
                new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.I64)))));
    tmpMap.put(_Fields.FAILED, new org.apache.thrift7.meta_data.FieldMetaData("failed", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING), 
            new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
                new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING), 
                new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.I64)))));
    tmpMap.put(_Fields.COMPLETE_MS_AVG, new org.apache.thrift7.meta_data.FieldMetaData("complete_ms_avg", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING), 
            new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
                new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING), 
                new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.DOUBLE)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift7.meta_data.FieldMetaData.addStructMetaDataMap(SpoutStats.class, metaDataMap);
  }

  public SpoutStats() {
  }

  public SpoutStats(
    Map<String,Map<String,Long>> acked,
    Map<String,Map<String,Long>> failed,
    Map<String,Map<String,Double>> complete_ms_avg)
  {
    this();
    this.acked = acked;
    this.failed = failed;
    this.complete_ms_avg = complete_ms_avg;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SpoutStats(SpoutStats other) {
    if (other.is_set_acked()) {
      Map<String,Map<String,Long>> __this__acked = new HashMap<String,Map<String,Long>>();
      for (Map.Entry<String, Map<String,Long>> other_element : other.acked.entrySet()) {

        String other_element_key = other_element.getKey();
        Map<String,Long> other_element_value = other_element.getValue();

        String __this__acked_copy_key = other_element_key;

        Map<String,Long> __this__acked_copy_value = new HashMap<String,Long>();
        for (Map.Entry<String, Long> other_element_value_element : other_element_value.entrySet()) {

          String other_element_value_element_key = other_element_value_element.getKey();
          Long other_element_value_element_value = other_element_value_element.getValue();

          String __this__acked_copy_value_copy_key = other_element_value_element_key;

          Long __this__acked_copy_value_copy_value = other_element_value_element_value;

          __this__acked_copy_value.put(__this__acked_copy_value_copy_key, __this__acked_copy_value_copy_value);
        }

        __this__acked.put(__this__acked_copy_key, __this__acked_copy_value);
      }
      this.acked = __this__acked;
    }
    if (other.is_set_failed()) {
      Map<String,Map<String,Long>> __this__failed = new HashMap<String,Map<String,Long>>();
      for (Map.Entry<String, Map<String,Long>> other_element : other.failed.entrySet()) {

        String other_element_key = other_element.getKey();
        Map<String,Long> other_element_value = other_element.getValue();

        String __this__failed_copy_key = other_element_key;

        Map<String,Long> __this__failed_copy_value = new HashMap<String,Long>();
        for (Map.Entry<String, Long> other_element_value_element : other_element_value.entrySet()) {

          String other_element_value_element_key = other_element_value_element.getKey();
          Long other_element_value_element_value = other_element_value_element.getValue();

          String __this__failed_copy_value_copy_key = other_element_value_element_key;

          Long __this__failed_copy_value_copy_value = other_element_value_element_value;

          __this__failed_copy_value.put(__this__failed_copy_value_copy_key, __this__failed_copy_value_copy_value);
        }

        __this__failed.put(__this__failed_copy_key, __this__failed_copy_value);
      }
      this.failed = __this__failed;
    }
    if (other.is_set_complete_ms_avg()) {
      Map<String,Map<String,Double>> __this__complete_ms_avg = new HashMap<String,Map<String,Double>>();
      for (Map.Entry<String, Map<String,Double>> other_element : other.complete_ms_avg.entrySet()) {

        String other_element_key = other_element.getKey();
        Map<String,Double> other_element_value = other_element.getValue();

        String __this__complete_ms_avg_copy_key = other_element_key;

        Map<String,Double> __this__complete_ms_avg_copy_value = new HashMap<String,Double>();
        for (Map.Entry<String, Double> other_element_value_element : other_element_value.entrySet()) {

          String other_element_value_element_key = other_element_value_element.getKey();
          Double other_element_value_element_value = other_element_value_element.getValue();

          String __this__complete_ms_avg_copy_value_copy_key = other_element_value_element_key;

          Double __this__complete_ms_avg_copy_value_copy_value = other_element_value_element_value;

          __this__complete_ms_avg_copy_value.put(__this__complete_ms_avg_copy_value_copy_key, __this__complete_ms_avg_copy_value_copy_value);
        }

        __this__complete_ms_avg.put(__this__complete_ms_avg_copy_key, __this__complete_ms_avg_copy_value);
      }
      this.complete_ms_avg = __this__complete_ms_avg;
    }
  }

  public SpoutStats deepCopy() {
    return new SpoutStats(this);
  }

  @Override
  public void clear() {
    this.acked = null;
    this.failed = null;
    this.complete_ms_avg = null;
  }

  public int get_acked_size() {
    return (this.acked == null) ? 0 : this.acked.size();
  }

  public void put_to_acked(String key, Map<String,Long> val) {
    if (this.acked == null) {
      this.acked = new HashMap<String,Map<String,Long>>();
    }
    this.acked.put(key, val);
  }

  public Map<String,Map<String,Long>> get_acked() {
    return this.acked;
  }

  public void set_acked(Map<String,Map<String,Long>> acked) {
    this.acked = acked;
  }

  public void unset_acked() {
    this.acked = null;
  }

  /** Returns true if field acked is set (has been assigned a value) and false otherwise */
  public boolean is_set_acked() {
    return this.acked != null;
  }

  public void set_acked_isSet(boolean value) {
    if (!value) {
      this.acked = null;
    }
  }

  public int get_failed_size() {
    return (this.failed == null) ? 0 : this.failed.size();
  }

  public void put_to_failed(String key, Map<String,Long> val) {
    if (this.failed == null) {
      this.failed = new HashMap<String,Map<String,Long>>();
    }
    this.failed.put(key, val);
  }

  public Map<String,Map<String,Long>> get_failed() {
    return this.failed;
  }

  public void set_failed(Map<String,Map<String,Long>> failed) {
    this.failed = failed;
  }

  public void unset_failed() {
    this.failed = null;
  }

  /** Returns true if field failed is set (has been assigned a value) and false otherwise */
  public boolean is_set_failed() {
    return this.failed != null;
  }

  public void set_failed_isSet(boolean value) {
    if (!value) {
      this.failed = null;
    }
  }

  public int get_complete_ms_avg_size() {
    return (this.complete_ms_avg == null) ? 0 : this.complete_ms_avg.size();
  }

  public void put_to_complete_ms_avg(String key, Map<String,Double> val) {
    if (this.complete_ms_avg == null) {
      this.complete_ms_avg = new HashMap<String,Map<String,Double>>();
    }
    this.complete_ms_avg.put(key, val);
  }

  public Map<String,Map<String,Double>> get_complete_ms_avg() {
    return this.complete_ms_avg;
  }

  public void set_complete_ms_avg(Map<String,Map<String,Double>> complete_ms_avg) {
    this.complete_ms_avg = complete_ms_avg;
  }

  public void unset_complete_ms_avg() {
    this.complete_ms_avg = null;
  }

  /** Returns true if field complete_ms_avg is set (has been assigned a value) and false otherwise */
  public boolean is_set_complete_ms_avg() {
    return this.complete_ms_avg != null;
  }

  public void set_complete_ms_avg_isSet(boolean value) {
    if (!value) {
      this.complete_ms_avg = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACKED:
      if (value == null) {
        unset_acked();
      } else {
        set_acked((Map<String,Map<String,Long>>)value);
      }
      break;

    case FAILED:
      if (value == null) {
        unset_failed();
      } else {
        set_failed((Map<String,Map<String,Long>>)value);
      }
      break;

    case COMPLETE_MS_AVG:
      if (value == null) {
        unset_complete_ms_avg();
      } else {
        set_complete_ms_avg((Map<String,Map<String,Double>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACKED:
      return get_acked();

    case FAILED:
      return get_failed();

    case COMPLETE_MS_AVG:
      return get_complete_ms_avg();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACKED:
      return is_set_acked();
    case FAILED:
      return is_set_failed();
    case COMPLETE_MS_AVG:
      return is_set_complete_ms_avg();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SpoutStats)
      return this.equals((SpoutStats)that);
    return false;
  }

  public boolean equals(SpoutStats that) {
    if (that == null)
      return false;

    boolean this_present_acked = true && this.is_set_acked();
    boolean that_present_acked = true && that.is_set_acked();
    if (this_present_acked || that_present_acked) {
      if (!(this_present_acked && that_present_acked))
        return false;
      if (!this.acked.equals(that.acked))
        return false;
    }

    boolean this_present_failed = true && this.is_set_failed();
    boolean that_present_failed = true && that.is_set_failed();
    if (this_present_failed || that_present_failed) {
      if (!(this_present_failed && that_present_failed))
        return false;
      if (!this.failed.equals(that.failed))
        return false;
    }

    boolean this_present_complete_ms_avg = true && this.is_set_complete_ms_avg();
    boolean that_present_complete_ms_avg = true && that.is_set_complete_ms_avg();
    if (this_present_complete_ms_avg || that_present_complete_ms_avg) {
      if (!(this_present_complete_ms_avg && that_present_complete_ms_avg))
        return false;
      if (!this.complete_ms_avg.equals(that.complete_ms_avg))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_acked = true && (is_set_acked());
    builder.append(present_acked);
    if (present_acked)
      builder.append(acked);

    boolean present_failed = true && (is_set_failed());
    builder.append(present_failed);
    if (present_failed)
      builder.append(failed);

    boolean present_complete_ms_avg = true && (is_set_complete_ms_avg());
    builder.append(present_complete_ms_avg);
    if (present_complete_ms_avg)
      builder.append(complete_ms_avg);

    return builder.toHashCode();
  }

  public int compareTo(SpoutStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SpoutStats typedOther = (SpoutStats)other;

    lastComparison = Boolean.valueOf(is_set_acked()).compareTo(typedOther.is_set_acked());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_acked()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.acked, typedOther.acked);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_failed()).compareTo(typedOther.is_set_failed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_failed()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.failed, typedOther.failed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_complete_ms_avg()).compareTo(typedOther.is_set_complete_ms_avg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_complete_ms_avg()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.complete_ms_avg, typedOther.complete_ms_avg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift7.protocol.TProtocol iprot) throws org.apache.thrift7.TException {
    org.apache.thrift7.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift7.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // ACKED
          if (field.type == org.apache.thrift7.protocol.TType.MAP) {
            {
              org.apache.thrift7.protocol.TMap _map95 = iprot.readMapBegin();
              this.acked = new HashMap<String,Map<String,Long>>(2*_map95.size);
              for (int _i96 = 0; _i96 < _map95.size; ++_i96)
              {
                String _key97; // required
                Map<String,Long> _val98; // required
                _key97 = iprot.readString();
                {
                  org.apache.thrift7.protocol.TMap _map99 = iprot.readMapBegin();
                  _val98 = new HashMap<String,Long>(2*_map99.size);
                  for (int _i100 = 0; _i100 < _map99.size; ++_i100)
                  {
                    String _key101; // required
                    long _val102; // required
                    _key101 = iprot.readString();
                    _val102 = iprot.readI64();
                    _val98.put(_key101, _val102);
                  }
                  iprot.readMapEnd();
                }
                this.acked.put(_key97, _val98);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // FAILED
          if (field.type == org.apache.thrift7.protocol.TType.MAP) {
            {
              org.apache.thrift7.protocol.TMap _map103 = iprot.readMapBegin();
              this.failed = new HashMap<String,Map<String,Long>>(2*_map103.size);
              for (int _i104 = 0; _i104 < _map103.size; ++_i104)
              {
                String _key105; // required
                Map<String,Long> _val106; // required
                _key105 = iprot.readString();
                {
                  org.apache.thrift7.protocol.TMap _map107 = iprot.readMapBegin();
                  _val106 = new HashMap<String,Long>(2*_map107.size);
                  for (int _i108 = 0; _i108 < _map107.size; ++_i108)
                  {
                    String _key109; // required
                    long _val110; // required
                    _key109 = iprot.readString();
                    _val110 = iprot.readI64();
                    _val106.put(_key109, _val110);
                  }
                  iprot.readMapEnd();
                }
                this.failed.put(_key105, _val106);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // COMPLETE_MS_AVG
          if (field.type == org.apache.thrift7.protocol.TType.MAP) {
            {
              org.apache.thrift7.protocol.TMap _map111 = iprot.readMapBegin();
              this.complete_ms_avg = new HashMap<String,Map<String,Double>>(2*_map111.size);
              for (int _i112 = 0; _i112 < _map111.size; ++_i112)
              {
                String _key113; // required
                Map<String,Double> _val114; // required
                _key113 = iprot.readString();
                {
                  org.apache.thrift7.protocol.TMap _map115 = iprot.readMapBegin();
                  _val114 = new HashMap<String,Double>(2*_map115.size);
                  for (int _i116 = 0; _i116 < _map115.size; ++_i116)
                  {
                    String _key117; // required
                    double _val118; // required
                    _key117 = iprot.readString();
                    _val118 = iprot.readDouble();
                    _val114.put(_key117, _val118);
                  }
                  iprot.readMapEnd();
                }
                this.complete_ms_avg.put(_key113, _val114);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift7.protocol.TProtocol oprot) throws org.apache.thrift7.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.acked != null) {
      oprot.writeFieldBegin(ACKED_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.STRING, org.apache.thrift7.protocol.TType.MAP, this.acked.size()));
        for (Map.Entry<String, Map<String,Long>> _iter119 : this.acked.entrySet())
        {
          oprot.writeString(_iter119.getKey());
          {
            oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.STRING, org.apache.thrift7.protocol.TType.I64, _iter119.getValue().size()));
            for (Map.Entry<String, Long> _iter120 : _iter119.getValue().entrySet())
            {
              oprot.writeString(_iter120.getKey());
              oprot.writeI64(_iter120.getValue());
            }
            oprot.writeMapEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.failed != null) {
      oprot.writeFieldBegin(FAILED_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.STRING, org.apache.thrift7.protocol.TType.MAP, this.failed.size()));
        for (Map.Entry<String, Map<String,Long>> _iter121 : this.failed.entrySet())
        {
          oprot.writeString(_iter121.getKey());
          {
            oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.STRING, org.apache.thrift7.protocol.TType.I64, _iter121.getValue().size()));
            for (Map.Entry<String, Long> _iter122 : _iter121.getValue().entrySet())
            {
              oprot.writeString(_iter122.getKey());
              oprot.writeI64(_iter122.getValue());
            }
            oprot.writeMapEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.complete_ms_avg != null) {
      oprot.writeFieldBegin(COMPLETE_MS_AVG_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.STRING, org.apache.thrift7.protocol.TType.MAP, this.complete_ms_avg.size()));
        for (Map.Entry<String, Map<String,Double>> _iter123 : this.complete_ms_avg.entrySet())
        {
          oprot.writeString(_iter123.getKey());
          {
            oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.STRING, org.apache.thrift7.protocol.TType.DOUBLE, _iter123.getValue().size()));
            for (Map.Entry<String, Double> _iter124 : _iter123.getValue().entrySet())
            {
              oprot.writeString(_iter124.getKey());
              oprot.writeDouble(_iter124.getValue());
            }
            oprot.writeMapEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SpoutStats(");
    boolean first = true;

    sb.append("acked:");
    if (this.acked == null) {
      sb.append("null");
    } else {
      sb.append(this.acked);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("failed:");
    if (this.failed == null) {
      sb.append("null");
    } else {
      sb.append(this.failed);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("complete_ms_avg:");
    if (this.complete_ms_avg == null) {
      sb.append("null");
    } else {
      sb.append(this.complete_ms_avg);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift7.TException {
    // check for required fields
    if (!is_set_acked()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'acked' is unset! Struct:" + toString());
    }

    if (!is_set_failed()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'failed' is unset! Struct:" + toString());
    }

    if (!is_set_complete_ms_avg()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'complete_ms_avg' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

