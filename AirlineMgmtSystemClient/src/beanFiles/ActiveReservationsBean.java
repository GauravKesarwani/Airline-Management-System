/**
 * ActiveReservationsBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beanFiles;

public class ActiveReservationsBean  implements java.io.Serializable {
    private java.lang.String boardingStatus;

    private java.lang.String dateOfJourney;

    private java.lang.String destination;

    private java.lang.String firstName;

    private int flightId;

    private java.lang.String flightNo;

    private java.lang.String lastName;

    private double price;

    private int reservationDtlId;

    private int reservationId;

    private java.lang.String source;

    private java.lang.String status;

    public ActiveReservationsBean() {
    }

    public ActiveReservationsBean(
           java.lang.String boardingStatus,
           java.lang.String dateOfJourney,
           java.lang.String destination,
           java.lang.String firstName,
           int flightId,
           java.lang.String flightNo,
           java.lang.String lastName,
           double price,
           int reservationDtlId,
           int reservationId,
           java.lang.String source,
           java.lang.String status) {
           this.boardingStatus = boardingStatus;
           this.dateOfJourney = dateOfJourney;
           this.destination = destination;
           this.firstName = firstName;
           this.flightId = flightId;
           this.flightNo = flightNo;
           this.lastName = lastName;
           this.price = price;
           this.reservationDtlId = reservationDtlId;
           this.reservationId = reservationId;
           this.source = source;
           this.status = status;
    }


    /**
     * Gets the boardingStatus value for this ActiveReservationsBean.
     * 
     * @return boardingStatus
     */
    public java.lang.String getBoardingStatus() {
        return boardingStatus;
    }


    /**
     * Sets the boardingStatus value for this ActiveReservationsBean.
     * 
     * @param boardingStatus
     */
    public void setBoardingStatus(java.lang.String boardingStatus) {
        this.boardingStatus = boardingStatus;
    }


    /**
     * Gets the dateOfJourney value for this ActiveReservationsBean.
     * 
     * @return dateOfJourney
     */
    public java.lang.String getDateOfJourney() {
        return dateOfJourney;
    }


    /**
     * Sets the dateOfJourney value for this ActiveReservationsBean.
     * 
     * @param dateOfJourney
     */
    public void setDateOfJourney(java.lang.String dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }


    /**
     * Gets the destination value for this ActiveReservationsBean.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this ActiveReservationsBean.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the firstName value for this ActiveReservationsBean.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this ActiveReservationsBean.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the flightId value for this ActiveReservationsBean.
     * 
     * @return flightId
     */
    public int getFlightId() {
        return flightId;
    }


    /**
     * Sets the flightId value for this ActiveReservationsBean.
     * 
     * @param flightId
     */
    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }


    /**
     * Gets the flightNo value for this ActiveReservationsBean.
     * 
     * @return flightNo
     */
    public java.lang.String getFlightNo() {
        return flightNo;
    }


    /**
     * Sets the flightNo value for this ActiveReservationsBean.
     * 
     * @param flightNo
     */
    public void setFlightNo(java.lang.String flightNo) {
        this.flightNo = flightNo;
    }


    /**
     * Gets the lastName value for this ActiveReservationsBean.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this ActiveReservationsBean.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the price value for this ActiveReservationsBean.
     * 
     * @return price
     */
    public double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ActiveReservationsBean.
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * Gets the reservationDtlId value for this ActiveReservationsBean.
     * 
     * @return reservationDtlId
     */
    public int getReservationDtlId() {
        return reservationDtlId;
    }


    /**
     * Sets the reservationDtlId value for this ActiveReservationsBean.
     * 
     * @param reservationDtlId
     */
    public void setReservationDtlId(int reservationDtlId) {
        this.reservationDtlId = reservationDtlId;
    }


    /**
     * Gets the reservationId value for this ActiveReservationsBean.
     * 
     * @return reservationId
     */
    public int getReservationId() {
        return reservationId;
    }


    /**
     * Sets the reservationId value for this ActiveReservationsBean.
     * 
     * @param reservationId
     */
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }


    /**
     * Gets the source value for this ActiveReservationsBean.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this ActiveReservationsBean.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the status value for this ActiveReservationsBean.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ActiveReservationsBean.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActiveReservationsBean)) return false;
        ActiveReservationsBean other = (ActiveReservationsBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.boardingStatus==null && other.getBoardingStatus()==null) || 
             (this.boardingStatus!=null &&
              this.boardingStatus.equals(other.getBoardingStatus()))) &&
            ((this.dateOfJourney==null && other.getDateOfJourney()==null) || 
             (this.dateOfJourney!=null &&
              this.dateOfJourney.equals(other.getDateOfJourney()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            this.flightId == other.getFlightId() &&
            ((this.flightNo==null && other.getFlightNo()==null) || 
             (this.flightNo!=null &&
              this.flightNo.equals(other.getFlightNo()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            this.price == other.getPrice() &&
            this.reservationDtlId == other.getReservationDtlId() &&
            this.reservationId == other.getReservationId() &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getBoardingStatus() != null) {
            _hashCode += getBoardingStatus().hashCode();
        }
        if (getDateOfJourney() != null) {
            _hashCode += getDateOfJourney().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        _hashCode += getFlightId();
        if (getFlightNo() != null) {
            _hashCode += getFlightNo().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        _hashCode += new Double(getPrice()).hashCode();
        _hashCode += getReservationDtlId();
        _hashCode += getReservationId();
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActiveReservationsBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beanFiles", "ActiveReservationsBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boardingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "boardingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfJourney");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "dateOfJourney"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "flightId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "flightNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationDtlId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "reservationDtlId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "reservationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "status"));
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
