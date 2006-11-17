/**
 * DataServiceCustomTypesYAML.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.macrodeck.www.xmlns.services._1_0;

public class DataServiceCustomTypesYAML  implements java.io.Serializable {
    private java.lang.String yamlContent;

    public DataServiceCustomTypesYAML() {
    }

    public DataServiceCustomTypesYAML(
           java.lang.String yamlContent) {
           this.yamlContent = yamlContent;
    }


    /**
     * Gets the yamlContent value for this DataServiceCustomTypesYAML.
     * 
     * @return yamlContent
     */
    public java.lang.String getYamlContent() {
        return yamlContent;
    }


    /**
     * Sets the yamlContent value for this DataServiceCustomTypesYAML.
     * 
     * @param yamlContent
     */
    public void setYamlContent(java.lang.String yamlContent) {
        this.yamlContent = yamlContent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataServiceCustomTypesYAML)) return false;
        DataServiceCustomTypesYAML other = (DataServiceCustomTypesYAML) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.yamlContent==null && other.getYamlContent()==null) || 
             (this.yamlContent!=null &&
              this.yamlContent.equals(other.getYamlContent())));
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
        if (getYamlContent() != null) {
            _hashCode += getYamlContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataServiceCustomTypesYAML.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/", "DataServiceCustomTypes..YAML"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yamlContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "yamlContent"));
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
