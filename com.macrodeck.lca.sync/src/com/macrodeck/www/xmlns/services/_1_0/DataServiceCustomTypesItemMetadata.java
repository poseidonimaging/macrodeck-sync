/**
 * DataServiceCustomTypesItemMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.macrodeck.www.xmlns.services._1_0;

public class DataServiceCustomTypesItemMetadata  implements java.io.Serializable {
    private java.lang.String title;

    private java.lang.String description;

    private java.lang.String creatorApp;

    private java.lang.String dataType;

    public DataServiceCustomTypesItemMetadata() {
    }

    public DataServiceCustomTypesItemMetadata(
           java.lang.String title,
           java.lang.String description,
           java.lang.String creatorApp,
           java.lang.String dataType) {
           this.title = title;
           this.description = description;
           this.creatorApp = creatorApp;
           this.dataType = dataType;
    }


    /**
     * Gets the title value for this DataServiceCustomTypesItemMetadata.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this DataServiceCustomTypesItemMetadata.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the description value for this DataServiceCustomTypesItemMetadata.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DataServiceCustomTypesItemMetadata.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the creatorApp value for this DataServiceCustomTypesItemMetadata.
     * 
     * @return creatorApp
     */
    public java.lang.String getCreatorApp() {
        return creatorApp;
    }


    /**
     * Sets the creatorApp value for this DataServiceCustomTypesItemMetadata.
     * 
     * @param creatorApp
     */
    public void setCreatorApp(java.lang.String creatorApp) {
        this.creatorApp = creatorApp;
    }


    /**
     * Gets the dataType value for this DataServiceCustomTypesItemMetadata.
     * 
     * @return dataType
     */
    public java.lang.String getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this DataServiceCustomTypesItemMetadata.
     * 
     * @param dataType
     */
    public void setDataType(java.lang.String dataType) {
        this.dataType = dataType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataServiceCustomTypesItemMetadata)) return false;
        DataServiceCustomTypesItemMetadata other = (DataServiceCustomTypesItemMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.creatorApp==null && other.getCreatorApp()==null) || 
             (this.creatorApp!=null &&
              this.creatorApp.equals(other.getCreatorApp()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType())));
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCreatorApp() != null) {
            _hashCode += getCreatorApp().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataServiceCustomTypesItemMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/", "DataServiceCustomTypes..ItemMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorApp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creatorApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
