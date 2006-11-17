/**
 * MacroDeckService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.macrodeck.www.xmlns.services._1_0;

public interface MacroDeckService extends javax.xml.rpc.Service {
    public java.lang.String getMacroDeckDataServicePortAddress();

    public com.macrodeck.www.xmlns.services._1_0.MacroDeckDataServicePort getMacroDeckDataServicePort() throws javax.xml.rpc.ServiceException;

    public com.macrodeck.www.xmlns.services._1_0.MacroDeckDataServicePort getMacroDeckDataServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getMacroDeckUserServicePortAddress();

    public com.macrodeck.www.xmlns.services._1_0.MacroDeckUserServicePort getMacroDeckUserServicePort() throws javax.xml.rpc.ServiceException;

    public com.macrodeck.www.xmlns.services._1_0.MacroDeckUserServicePort getMacroDeckUserServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
