/**
 * ReservationBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beanFiles;

public class ReservationBean  implements java.io.Serializable {
    private java.lang.String createdBy;

    private java.util.Calendar creationDate;

    private int customerId;

    private java.lang.String lastUpdated;

    private java.util.Calendar lastUpdatedAt;

    private beanFiles.ReservationDetailBean[] reservationDtls;

    private int reservationId;

    private java.lang.String status;

    private java.lang.String typeOfJourney;

    public ReservationBean() {
    }

    public ReservationBean(
           java.lang.String createdBy,
           java.util.Calendar creationDate,
           int customerId,
           java.lang.String lastUpdated,
           java.util.Calendar lastUpdatedAt,
           beanFiles.ReservationDetailBean[] reservationDtls,
           int reservationId,
           java.lang.String status,
           java.lang.String typeOfJourney) {
           this.createdBy = createdBy;
           this.creationDate = creationDate;
           this.customerId = customerId;
           this.lastUpdated = lastUpdated;
           this.lastUpdatedAt = lastUpdatedAt;
           this.reservationDtls = reservationDtls;
           this.reservationId = reservationId;
           this.status = status;
           this.typeOfJourney = typeOfJourney;
    }


    /**
     * Gets the createdBy value for this ReservationBean.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ReservationBean.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the creationDate value for this ReservationBean.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this ReservationBean.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the customerId value for this ReservationBean.
     * 
     * @return customerId
     */
    public int getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this ReservationBean.
     * 
     * @param customerId
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the lastUpdated value for this ReservationBean.
     * 
     * @return lastUpdated
     */
    public java.lang.String getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Sets the lastUpdated value for this ReservationBean.
     * 
     * @param lastUpdated
     */
    public void setLastUpdated(java.lang.String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    /**
     * Gets the lastUpdatedAt value for this ReservationBean.
     * 
     * @return lastUpdatedAt
     */
    public java.util.Calendar getLastUpdatedAt() {
        return lastUpdatedAt;
    }


    /**
     * Sets the lastUpdatedAt value for this ReservationBean.
     * 
     * @param lastUpdatedAt
     */
    public void setLastUpdatedAt(java.util.Calendar lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }


    /**
     * Gets the reservationDtls value for this ReservationBean.
     * 
     * @return reservationDtls
     */
    public beanFiles.ReservationDetailBean[] getReservationDtls() {
        return reservationDtls;
    }


    /**
     * Sets the reservationDtls value for this ReservationBean.
     * 
     * @param reservationDtls
     */
    public void setReservationDtls(beanFiles.ReservationDetailBean[] reservationDtls) {
        this.reservationDtls = reservationDtls;
    }


    /**
     * Gets the reservationId value for this ReservationBean.
     * 
     * @return reservationId
     */
    public int getReservationId() {
        return reservationId;
    }


    /**
     * Sets the reservationId value for this ReservationBean.
     * 
     * @param reservationId
     */
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }


    /**
     * Gets the status value for this ReservationBean.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReservationBean.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the typeOfJourney value for this ReservationBean.
     * 
     * @return typeOfJourney
     */
    public java.lang.String getTypeOfJourney() {
        return typeOfJourney;
    }


    /**
     * Sets the typeOfJourney value for this ReservationBean.
     * 
     * @param typeOfJourney
     */
    public void setTypeOfJourney(java.lang.String typeOfJourney) {
        this.typeOfJourney = typeOfJourney;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationBean)) return false;
        ReservationBean other = (ReservationBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            this.customerId == other.getCustomerId() &&
            ((this.lastUpdated==null && other.getLastUpdated()==null) || 
             (this.lastUpdated!=null &&
              this.lastUpdated.equals(other.getLastUpdated()))) &&
            ((this.lastUpdatedAt==null && other.getLastUpdatedAt()==null) || 
             (this.lastUpdatedAt!=null &&
              this.lastUpdatedAt.equals(other.getLastUpdatedAt()))) &&
            ((this.reservationDtls==null && other.getReservationDtls()==null) || 
             (this.reservationDtls!=null &&
              java.util.Arrays.equals(this.reservationDtls, other.getReservationDtls()))) &&
            this.reservationId == other.getReservationId() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.typeOfJourney==null && other.getTypeOfJourney()==null) || 
             (this.typeOfJourney!=null &&
              this.typeOfJourney.equals(other.getTypeOfJourney())));
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
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        _hashCode += getCustomerId();
        if (getLastUpdated() != null) {
            _hashCode += getLastUpdated().hashCode();
        }
        if (getLastUpdatedAt() != null) {
            _hashCode += getLastUpdatedAt().hashCode();
        }
        if (getReservationDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReservationDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReservationDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getReservationId();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTypeOfJourney() != null) {
            _hashCode += getTypeOfJourney().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beanFiles", "ReservationBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
        elemField.setFieldName("reservationDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "reservationDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beanFiles", "ReservationDetailBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://helperClasses", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "reservationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfJourney");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beanFiles", "typeOfJourney"));
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
