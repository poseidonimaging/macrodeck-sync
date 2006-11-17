/**
 * MacroDeckUserServicePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.macrodeck.www.xmlns.services._1_0;

public interface MacroDeckUserServicePort extends java.rmi.Remote {
    public java.lang.String getAuthCode(java.lang.String userName, java.lang.String authToken) throws java.rmi.RemoteException;
    public java.lang.String getAuthCookie(java.lang.String userName) throws java.rmi.RemoteException;
}
