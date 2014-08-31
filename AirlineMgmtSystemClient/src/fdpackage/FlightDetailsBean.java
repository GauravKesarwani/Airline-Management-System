/**
 * FlightDetailsBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fdpackage;

public class FlightDetailsBean  implements java.io.Serializable {
    private java.lang.String airlinename;

    private java.lang.String arrival;

    private java.lang.String date_of_journey;

    private java.lang.String date_of_return;

    private java.lang.String departure;

    private java.lang.String destination;

    private double fare;

    private int flightId;

    private java.lang.String flightnumber;

    private java.lang.String source;

    private java.lang.String travelclass;

    public FlightDetailsBean() {
    }

    public FlightDetailsBean(
           java.lang.String airlinename,
           java.lang.String arrival,
           java.lang.String date_of_journey,
           java.lang.String date_of_return,
           java.lang.String departure,
           java.lang.String destination,
           double fare,
           int flightId,
           java.lang.String flightnumber,
           java.lang.String source,
           java.lang.String travelclass) {
           this.airlinename = airlinename;
           this.arrival = arrival;
           this.date_of_journey = date_of_journey;
           this.date_of_return = date_of_return;
           this.departure = departure;
           this.destination = destination;
           this.fare = fare;
           this.flightId = flightId;
           this.flightnumber = flightnumber;
           this.source = source;
           this.travelclass = travelclass;
    }


    /**
     * Gets the airlinename value for this FlightDetailsBean.
     * 
     * @return airlinename
     */
    public java.lang.String getAirlinename() {
        return airlinename;
    }


    /**
     * Sets the airlinename value for this FlightDetailsBean.
     * 
     * @param airlinename
     */
    public void setAirlinename(java.lang.String airlinename) {
        this.airlinename = airlinename;
    }


    /**
     * Gets the arrival value for this FlightDetailsBean.
     * 
     * @return arrival
     */
    public java.lang.String getArrival() {
        return arrival;
    }


    /**
     * Sets the arrival value for this FlightDetailsBean.
     * 
     * @param arrival
     */
    public void setArrival(java.lang.String arrival) {
        this.arrival = arrival;
    }


    /**
     * Gets the date_of_journey value for this FlightDetailsBean.
     * 
     * @return date_of_journey
     */
    public java.lang.String getDate_of_journey() {
        return date_of_journey;
    }


    /**
     * Sets the date_of_journey value for this FlightDetailsBean.
     * 
     * @param date_of_journey
     */
    public void setDate_of_journey(java.lang.String date_of_journey) {
        this.date_of_journey = date_of_journey;
    }


    /**
     * Gets the date_of_return value for this FlightDetailsBean.
     * 
     * @return date_of_return
     */
    public java.lang.String getDate_of_return() {
        return date_of_return;
    }


    /**
     * Sets the date_of_return value for this FlightDetailsBean.
     * 
     * @param date_of_return
     */
    public void setDate_of_return(java.lang.String date_of_return) {
        this.date_of_return = date_of_return;
    }


    /**
     * Gets the departure value for this FlightDetailsBean.
     * 
     * @return departure
     */
    public java.lang.String getDeparture() {
        return departure;
    }


    /**
     * Sets the departure value for this FlightDetailsBean.
     * 
     * @param departure
     */
    public void setDeparture(java.lang.String departure) {
        this.departure = departure;
    }


    /**
     * Gets the destination value for this FlightDetailsBean.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this FlightDetailsBean.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the fare value for this FlightDetailsBean.
     * 
     * @return fare
     */
    public double getFare() {
        return fare;
    }


    /**
     * Sets the fare value for this FlightDetailsBean.
     * 
     * @param fare
     */
    public void setFare(double fare) {
        this.fare = fare;
    }


    /**
     * Gets the flightId value for this FlightDetailsBean.
     * 
     * @return flightId
     */
    public int getFlightId() {
        return flightId;
    }


    /**
     * Sets the flightId value for this FlightDetailsBean.
     * 
     * @param flightId
     */
    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }


    /**
     * Gets the flightnumber value for this FlightDetailsBean.
     * 
     * @return flightnumber
     */
    public java.lang.String getFlightnumber() {
        return flightnumber;
    }


    /**
     * Sets the flightnumber value for this FlightDetailsBean.
     * 
     * @param flightnumber
     */
    public void setFlightnumber(java.lang.String flightnumber) {
        this.flightnumber = flightnumber;
    }


    /**
     * Gets the source value for this FlightDetailsBean.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this FlightDetailsBean.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the travelclass value for this FlightDetailsBean.
     * 
     * @return travelclass
     */
    public java.lang.String getTravelclass() {
        return travelclass;
    }


    /**
     * Sets the travelclass value for this FlightDetailsBean.
     * 
     * @param travelclass
     */
    public void setTravelclass(java.lang.String travelclass) {
        this.travelclass = travelclass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightDetailsBean)) return false;
        FlightDetailsBean other = (FlightDetailsBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airlinename==null && other.getAirlinename()==null) || 
             (this.airlinename!=null &&
              this.airlinename.equals(other.getAirlinename()))) &&
            ((this.arrival==null && other.getArrival()==null) || 
             (this.arrival!=null &&
              this.arrival.equals(other.getArrival()))) &&
            ((this.date_of_journey==null && other.getDate_of_journey()==null) || 
             (this.date_of_journey!=null &&
              this.date_of_journey.equals(other.getDate_of_journey()))) &&
            ((this.date_of_return==null && other.getDate_of_return()==null) || 
             (this.date_of_return!=null &&
              this.date_of_return.equals(other.getDate_of_return()))) &&
            ((this.departure==null && other.getDeparture()==null) || 
             (this.departure!=null &&
              this.departure.equals(other.getDeparture()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            this.fare == other.getFare() &&
            this.flightId == other.getFlightId() &&
            ((this.flightnumber==null && other.getFlightnumber()==null) || 
             (this.flightnumber!=null &&
              this.flightnumber.equals(other.getFlightnumber()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.travelclass==null && other.getTravelclass()==null) || 
             (this.travelclass!=null &&
              this.travelclass.equals(other.getTravelclass())));
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
        if (getAirlinename() != null) {
            _hashCode += getAirlinename().hashCode();
        }
        if (getArrival() != null) {
            _hashCode += getArrival().hashCode();
        }
        if (getDate_of_journey() != null) {
            _hashCode += getDate_of_journey().hashCode();
        }
        if (getDate_of_return() != null) {
            _hashCode += getDate_of_return().hashCode();
        }
        if (getDeparture() != null) {
            _hashCode += getDeparture().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        _hashCode += new Double(getFare()).hashCode();
        _hashCode += getFlightId();
        if (getFlightnumber() != null) {
            _hashCode += getFlightnumber().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getTravelclass() != null) {
            _hashCode += getTravelclass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightDetailsBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fdpackage", "FlightDetailsBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airlinename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "airlinename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrival");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "arrival"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_of_journey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "date_of_journey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_of_return");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "date_of_return"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "departure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "fare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "flightId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "flightnumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelclass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fdpackage", "travelclass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
