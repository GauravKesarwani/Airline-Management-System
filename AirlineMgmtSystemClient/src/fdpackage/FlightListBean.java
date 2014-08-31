/**
 * FlightListBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fdpackage;

public class FlightListBean  implements java.io.Serializable {
    private java.lang.String airline_Name;

    private int crew_Count;

    private java.lang.String depart_date;

    private java.lang.String flight_Arr_Time;

    private java.lang.String flight_Depart_Time;

    private java.lang.String flight_Destination;

    private java.lang.String flight_Number;

    private java.lang.String flight_Source;

    private float flight_fare;

    private int flight_id;

    private int no_of_seats;

    public FlightListBean() {
    }

    public FlightListBean(
           java.lang.String airline_Name,
           int crew_Count,
           java.lang.String depart_date,
           java.lang.String flight_Arr_Time,
           java.lang.String flight_Depart_Time,
           java.lang.String flight_Destination,
           java.lang.String flight_Number,
           java.lang.String flight_Source,
           float flight_fare,
           int flight_id,
           int no_of_seats) {
           this.airline_Name = airline_Name;
           this.crew_Count = crew_Count;
           this.depart_date = depart_date;
           this.flight_Arr_Time = flight_Arr_Time;
           this.flight_Depart_Time = flight_Depart_Time;
           this.flight_Destination = flight_Destination;
           this.flight_Number = flight_Number;
           this.flight_Source = flight_Source;
           this.flight_fare = flight_fare;
           this.flight_id = flight_id;
           this.no_of_seats = no_of_seats;
    }


    /**
     * Gets the airline_Name value for this FlightListBean.
     * 
     * @return airline_Name
     */
    public java.lang.String getAirline_Name() {
        return airline_Name;
    }


    /**
     * Sets the airline_Name value for this FlightListBean.
     * 
     * @param airline_Name
     */
    public void setAirline_Name(java.lang.String airline_Name) {
        this.airline_Name = airline_Name;
    }


    /**
     * Gets the crew_Count value for this FlightListBean.
     * 
     * @return crew_Count
     */
    public int getCrew_Count() {
        return crew_Count;
    }


    /**
     * Sets the crew_Count value for this FlightListBean.
     * 
     * @param crew_Count
     */
    public void setCrew_Count(int crew_Count) {
        this.crew_Count = crew_Count;
    }


    /**
     * Gets the depart_date value for this FlightListBean.
     * 
     * @return depart_date
     */
    public java.lang.String getDepart_date() {
        return depart_date;
    }


    /**
     * Sets the depart_date value for this FlightListBean.
     * 
     * @param depart_date
     */
    public void setDepart_date(java.lang.String depart_date) {
        this.depart_date = depart_date;
    }


    /**
     * Gets the flight_Arr_Time value for this FlightListBean.
     * 
     * @return flight_Arr_Time
     */
    public java.lang.String getFlight_Arr_Time() {
        return flight_Arr_Time;
    }


    /**
     * Sets the flight_Arr_Time value for this FlightListBean.
     * 
     * @param flight_Arr_Time
     */
    public void setFlight_Arr_Time(java.lang.String flight_Arr_Time) {
        this.flight_Arr_Time = flight_Arr_Time;
    }


    /**
     * Gets the flight_Depart_Time value for this FlightListBean.
     * 
     * @return flight_Depart_Time
     */
    public java.lang.String getFlight_Depart_Time() {
        return flight_Depart_Time;
    }


    /**
     * Sets the flight_Depart_Time value for this FlightListBean.
     * 
     * @param flight_Depart_Time
     */
    public void setFlight_Depart_Time(java.lang.String flight_Depart_Time) {
        this.flight_Depart_Time = flight_Depart_Time;
    }


    /**
     * Gets the flight_Destination value for this FlightListBean.
     * 
     * @return flight_Destination
     */
    public java.lang.String getFlight_Destination() {
        return flight_Destination;
    }


    /**
     * Sets the flight_Destination value for this FlightListBean.
     * 
     * @param flight_Destination
     */
    public void setFlight_Destination(java.lang.String flight_Destination) {
        this.flight_Destination = flight_Destination;
    }


    /**
     * Gets the flight_Number value for this FlightListBean.
     * 
     * @return flight_Number
     */
    public java.lang.String getFlight_Number() {
        return flight_Number;
    }


    /**
     * Sets the flight_Number value for this FlightListBean.
     * 
     * @param flight_Number
     */
    public void setFlight_Number(java.lang.String flight_Number) {
        this.flight_Number = flight_Number;
    }


    /**
     * Gets the flight_Source value for this FlightListBean.
     * 
     * @return flight_Source
     */
    public java.lang.String getFlight_Source() {
        return flight_Source;
    }


    /**
     * Sets the flight_Source value for this FlightListBean.
     * 
     * @param flight_Source
     */
    public void setFlight_Source(java.lang.String flight_Source) {
        this.flight_Source = flight_Source;
    }


    /**
     * Gets the flight_fare value for this FlightListBean.
     * 
     * @return flight_fare
     */
    public float getFlight_fare() {
        return flight_fare;
    }


    /**
     * Sets the flight_fare value for this FlightListBean.
     * 
     * @param flight_fare
     */
    public void setFlight_fare(float flight_fare) {
        this.flight_fare = flight_fare;
    }


    /**
     * Gets the flight_id value for this FlightListBean.
     * 
     * @return flight_id
     */
    public int getFlight_id() {
        return flight_id;
    }


    /**
     * Sets the flight_id value for this FlightListBean.
     * 
     * @param flight_id
     */
    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }


    /**
     * Gets the no_of_seats value for this FlightListBean.
     * 
     * @return no_of_seats
     */
    public int getNo_of_seats() {
        return no_of_seats;
    }


    /**
     * Sets the no_of_seats value for this FlightListBean.
     * 
     * @param no_of_seats
     */
    public void setNo_of_seats(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightListBean)) return false;
        FlightListBean other = (FlightListBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airline_Name==null && other.getAirline_Name()==null) || 
             (this.airline_Name!=null &&
              this.airline_Name.equals(other.getAirline_Name()))) &&
            this.crew_Count == other.getCrew_Count() &&
            ((this.depart_date==null && other.getDepart_date()==null) || 
             (this.depart_date!=null &&
              this.depart_date.equals(other.getDepart_date()))) &&
            ((this.flight_Arr_Time==null && other.getFlight_Arr_Time()==null) || 
             (this.flight_Arr_Time!=null &&
              this.flight_Arr_Time.equals(other.getFlight_Arr_Time()))) &&
            ((this.flight_Depart_Time==null && other.getFlight_Depart_Time()==null) || 
             (this.flight_Depart_Time!=null &&
              this.flight_Depart_Time.equals(other.getFlight_Depart_Time()))) &&
            ((this.flight_Destination==null && other.getFlight_Destination()==null) || 
             (this.flight_Destination!=null &&
              this.flight_Destination.equals(other.getFlight_Destination()))) &&
            ((this.flight_Number==null && other.getFlight_Number()==null) || 
             (this.flight_Number!=null &&
              this.flight_Number.equals(other.getFlight_Number()))) &&
            ((this.flight_Source==null && other.getFlight_Source()==null) || 
             (this.flight_Source!=null &&
              this.flight_Source.equals(other.getFlight_Source()))) &&
            this.flight_fare == other.getFlight_fare() &&
            this.flight_id == other.getFlight_id() &&
            this.no_of_seats == other.getNo_of_seats();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAirline_Name() != null) {
            _hashCode += getAirline_Name().hashCode();
        }
        _hashCode += getCrew_Count();
        if (getDepart_date() != null) {
            _hashCode += getDepart_date().hashCode();
        }
        if (getFlight_Arr_Time() != null) {
            _hashCode += getFlight_Arr_Time().hashCode();
        }
        if (getFlight_Depart_Time() != null) {
            _hashCode += getFlight_Depart_Time().hashCode();
        }
        if (getFlight_Destination() != null) {
            _hashCode += getFlight_Destination().hashCode();
        }
        if (getFlight_Number() != null) {
            _hashCode += getFlight_Number().hashCode();
        }
        if (getFlight_Source() != null) {
            _hashCode += getFlight_Source().hashCode();
        }
        _hashCode += new Float(getFlight_fare()).hashCode();
        _hashCode += getFlight_id();
        _hashCode += getNo_of_seats();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightListBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fdpackage", "FlightListBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airline_Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "airline_Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crew_Count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "crew_Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depart_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "depart_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight_Arr_Time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "flight_Arr_Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight_Depart_Time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "flight_Depart_Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight_Destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "flight_Destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight_Number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "flight_Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight_Source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "flight_Source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight_fare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "flight_fare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "flight_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no_of_seats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "no_of_seats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
