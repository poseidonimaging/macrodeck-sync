/**
 * MacroDeckDataServicePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.macrodeck.www.xmlns.services._1_0;

public interface MacroDeckDataServicePort extends java.rmi.Remote {
    public boolean setIntegerValue(java.lang.String authCode, java.lang.String itemUUID, int value) throws java.rmi.RemoteException;
    public java.lang.String createDataItem(java.lang.String authCode, java.lang.String grouping, com.macrodeck.www.xmlns.services._1_0.DataServiceCustomTypesItemMetadata metadata) throws java.rmi.RemoteException;
    public boolean deleteIntegerValue(java.lang.String authCode, java.lang.String itemUUID) throws java.rmi.RemoteException;
    public boolean deleteDataItem(java.lang.String authCode, java.lang.String itemUUID) throws java.rmi.RemoteException;
    public boolean setObjectValue(java.lang.String authCode, java.lang.String itemUUID, com.macrodeck.www.xmlns.services._1_0.DataServiceCustomTypesYAML value) throws java.rmi.RemoteException;
    public boolean deleteObjectValue(java.lang.String authCode, java.lang.String itemUUID) throws java.rmi.RemoteException;
    public boolean setStringValue(java.lang.String authCode, java.lang.String itemUUID, java.lang.String value) throws java.rmi.RemoteException;
    public boolean deleteStringValue(java.lang.String authCode, java.lang.String itemUUID) throws java.rmi.RemoteException;
}
