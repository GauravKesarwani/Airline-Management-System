/**
 * ReservationDetailBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beanFiles;

public class ReservationDetailBean  implements java.io.Serializable {
    private java.lang.String boardingStatus;

    private java.lang.String createdBy;

    private java.util.Calendar creationDate;

    private java.util.Calendar dateOfJourney;

    private java.lang.String flightId;

    private java.lang.String lastUpdated;

    private java.util.Calendar lastUpdatedAt;

    private double price;

    private int reservationDtlId;

    private int reservationId;

    private java.lang.String seatNo;

    private java.lang.String status;

    private double tax;

    private java.lang.String travelClass;

    private beanFiles.PersonBean traveller;

    public ReservationDetailBean() {
    }

    public ReservationDetailBean(
           java.lang.String boardingStatus,
           java.lang.String createdBy,
           java.util.Calendar creationDate,
           java.util.Calendar dateOfJourney,
           java.lang.String flightId,
           java.lang.String lastUpdated,
           java.util.Calendar lastUpdatedAt,
           double price,
           int reservationDtlId,
           int reservationId,
           java.lang.String seatNo,
           java.lang.String status,
           double tax,
           java.lang.String travelClass,
           beanFiles.PersonBean traveller) {
           this.boardingStatus = boardingStatus;
           this.createdBy = createdBy;
           this.creationDate = creationDate;
           this.dateOfJourney = dateOfJourney;
           this.flightId = flightId;
           this.lastUpdated = lastUpdated;
           this.lastUpdatedAt = lastUpdatedAt;
           this.price = price;
           this.reservationDtlId = reservationDtlId;
           this.reservationId = reservationId;
           this.seatNo = seatNo;
           this.status = status;
           this.tax = tax;
           this.travelClass = travelClass;
           this.traveller = traveller;
    }


    /**
     * Gets the boardingStatus value for this ReservationDetailBean.
     * 
     * @return boardingStatus
     */
    public java.lang.String getBoardingStatus() {
        return boardingStatus;
    }


    /**
     * Sets the boardingStatus value for this ReservationDetailBean.
     * 
     * @param boardingStatus
     */
    public void setBoardingStatus(java.lang.String boardingStatus) {
        this.boardingStatus = boardingStatus;
    }


    /**
     * Gets the createdBy value for this ReservationDetailBean.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ReservationDetailBean.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the creationDate value for this ReservationDetailBean.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this ReservationDetailBean.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the dateOfJourney value for this ReservationDetailBean.
     * 
     * @return dateOfJourney
     */
    public java.util.Calendar getDateOfJourney() {
        return dateOfJourney;
    }


    /**
     * Sets the dateOfJourney value for this ReservationDetailBean.
     * 
     * @param dateOfJourney
     */
    public void setDateOfJourney(java.util.Calendar dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }


    /**
     * Gets the flightId value for this ReservationDetailBean.
     * 
     * @return flightId
     */
    public java.lang.String getFlightId() {
        return flightId;
    }


    /**
     * Sets the flightId value for this ReservationDetailBean.
     * 
     * @param flightId
     */
    public void setFlightId(java.lang.String flightId) {
        this.flightId = flightId;
    }


    /**
     * Gets the lastUpdated value for this ReservationDetailBean.
     * 
     * @return lastUpdated
     */
    public java.lang.String getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Sets the lastUpdated value for this ReservationDetailBean.
     * 
     * @param lastUpdated
     */
    public void setLastUpdated(java.lang.String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    /**
     * Gets the lastUpdatedAt value for this ReservationDetailBean.
     * 
     * @return lastUpdatedAt
     */
    public java.util.Calendar getLastUpdatedAt() {
        return lastUpdatedAt;
    }


    /**
     * Sets the lastUpdatedAt value for this ReservationDetailBean.
     * 
     * @param lastUpdatedAt
     */
    public void setLastUpdatedAt(java.util.Calendar lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }


    /**
     * Gets the price value for this ReservationDetailBean.
     * 
     * @return price
     */
    public double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ReservationDetailBean.
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * Gets the reservationDtlId value for this ReservationDetailBean.
     * 
     * @return reservationDtlId
     */
    public int getReservationDtlId() {
        return reservationDtlId;
    }


    /**
     * Sets the reservationDtlId value for this ReservationDetailBean.
     * 
     * @param reservationDtlId
     */
    public void setReservationDtlId(int reservationDtlId) {
        this.reservationDtlId = reservationDtlId;
    }


    /**
     * Gets the reservationId value for this ReservationDetailBean.
     * 
     * @return reservationId
     */
    public int getReservationId() {
        return reservationId;
    }


    /**
     * Sets the reservationId value for this ReservationDetailBean.
     * 
     * @param reservationId
     */
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }


    /**
     * Gets the seatNo value for this ReservationDetailBean.
     * 
     * @return seatNo
     */
    public java.lang.String getSeatNo() {
        return seatNo;
    }


    /**
     * Sets the seatNo value for this ReservationDetailBean.
     * 
     * @param seatNo
     */
    public void setSeatNo(java.lang.String seatNo) {
        this.seatNo = seatNo;
    }


    /**
     * Gets the status value for this ReservationDetailBean.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReservationDetailBean.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the tax value for this ReservationDetailBean.
     * 
     * @return tax
     */
    public double getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this ReservationDetailBean.
     * 
     * @param tax
     */
    public void setTax(double tax) {
        this.tax = tax;
    }


    /**
     * Gets the travelClass value for this ReservationDetailBean.
     * 
     * @return travelClass
     */
    public java.lang.String getTravelClass() {
        return travelClass;
    }


    /**
     * Sets the travelClass value for this ReservationDetailBean.
     * 
     * @param travelClass
     */
    public void setTravelClass(java.lang.String travelClass) {
        this.travelClass = travelClass;
    }


    /**
     * Gets the traveller value for this ReservationDetailBean.
     * 
     * @return traveller
     */
    public beanFiles.PersonBean getTraveller() {
        return traveller;
    }


    /**
     * Sets the traveller value for this ReservationDetailBean.
     * 
     * @param traveller
     */
    public void setTraveller(beanFiles.PersonBean traveller) {
        this.traveller = traveller;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationDetailBean)) return false;
        ReservationDetailBean other = (ReservationDetailBean) obj;
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
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.dateOfJourney==null && other.getDateOfJourney()==null) || 
             (this.dateOfJourney!=null &&
              this.dateOfJourney.equals(other.getDateOfJourney()))) &&
            ((this.flightId==null && other.getFlightId()==null) || 
             (this.flightId!=null &&
              this.flightId.equals(other.getFlightId()))) &&
            ((this.lastUpdated==null && other.getLastUpdated()==null) || 
             (this.lastUpdated!=null &&
              this.lastUpdated.equals(other.getLastUpdated()))) &&
            ((this.lastUpdatedAt==null && other.getLastUpdatedAt()==null) || 
             (this.lastUpdatedAt!=null &&
              this.lastUpdatedAt.equals(other.getLastUpdatedAt()))) &&
            this.price == other.getPrice() &&
            this.reservationDtlId == other.getReservationDtlId() &&
            this.reservationId == other.getReservationId() &&
            ((this.seatNo==null && other.getSeatNo()==null) || 
             (this.seatNo!=null &&
              this.seatNo.equals(other.getSeatNo()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.tax == other.getTax() &&
            ((this.travelClass==null && other.getTravelClass()==null) || 
             (this.travelClass!=null &&
              this.travelClass.equals(other.getTravelClass()))) &&
            ((this.traveller==null && other.getTraveller()==null) || 
             (this.traveller!=null &&
              this.traveller.equals(other.getTraveller())));
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
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getDateOfJourney() != null) {
            _hashCode += getDateOfJourney().hashCode();
        }
        if (getFlightId() != null) {
            _hashCode += getFlightId().hashCode();
        }
        if (getLastUpdated() != null) {
            _hashCode += getLastUpdated().hashCode();
        }
        if (getLastUpdatedAt() != null) {
            _hashCode += getLastUpdatedAt().hashCode();
        }
        _hashCode += new Double(getPrice()).hashCode();
        _hashCode += getReservationDtlId();
        _hashCode += getReservationId();
        if (getSeatNo() != null) {
            _hashCode += getSeatNo().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += new Double(getTax()).hashCode();
        if (getTravelClass() != null) {
            _hashCode += getTravelClass().hashCode();
        }
        if (getTraveller() != null) {
            _hashCode += getTraveller().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationDetailBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beanFiles", "ReservationDetailBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boardingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "boardingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfJourney");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "dateOfJourney"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "flightId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "lastUpdated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdatedAt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "lastUpdatedAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("seatNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "seatNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "travelClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traveller");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "traveller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beanFiles", "PersonBean"));
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
