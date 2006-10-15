/**
 * MacroDeckServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.macrodeck.services.dataservice_0_2;

public class MacroDeckServiceLocator extends org.apache.axis.client.Service implements com.macrodeck.services.dataservice_0_2.MacroDeckService {

    public MacroDeckServiceLocator() {
    }


    public MacroDeckServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MacroDeckServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MacroDeckDataServicePort
    private java.lang.String MacroDeckDataServicePort_address = "http://www.macrodeck.com/services/DataService";

    public java.lang.String getMacroDeckDataServicePortAddress() {
        return MacroDeckDataServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MacroDeckDataServicePortWSDDServiceName = "MacroDeckDataServicePort";

    public java.lang.String getMacroDeckDataServicePortWSDDServiceName() {
        return MacroDeckDataServicePortWSDDServiceName;
    }

    public void setMacroDeckDataServicePortWSDDServiceName(java.lang.String name) {
        MacroDeckDataServicePortWSDDServiceName = name;
    }

    public com.macrodeck.services.dataservice_0_2.MacroDeckDataServicePort getMacroDeckDataServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MacroDeckDataServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMacroDeckDataServicePort(endpoint);
    }

    public com.macrodeck.services.dataservice_0_2.MacroDeckDataServicePort getMacroDeckDataServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.macrodeck.services.dataservice_0_2.MacroDeckDataServiceBindingStub _stub = new com.macrodeck.services.dataservice_0_2.MacroDeckDataServiceBindingStub(portAddress, this);
            _stub.setPortName(getMacroDeckDataServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMacroDeckDataServicePortEndpointAddress(java.lang.String address) {
        MacroDeckDataServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.macrodeck.services.dataservice_0_2.MacroDeckDataServicePort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.macrodeck.services.dataservice_0_2.MacroDeckDataServiceBindingStub _stub = new com.macrodeck.services.dataservice_0_2.MacroDeckDataServiceBindingStub(new java.net.URL(MacroDeckDataServicePort_address), this);
                _stub.setPortName(getMacroDeckDataServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MacroDeckDataServicePort".equals(inputPortName)) {
            return getMacroDeckDataServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/", "MacroDeckService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.macrodeck.com/xmlns/services/1.0/", "MacroDeckDataServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MacroDeckDataServicePort".equals(portName)) {
            setMacroDeckDataServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
