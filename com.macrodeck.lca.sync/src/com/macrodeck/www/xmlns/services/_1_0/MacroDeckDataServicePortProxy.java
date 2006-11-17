package com.macrodeck.www.xmlns.services._1_0;

public class MacroDeckDataServicePortProxy implements com.macrodeck.www.xmlns.services._1_0.MacroDeckDataServicePort {
  private String _endpoint = null;
  private com.macrodeck.www.xmlns.services._1_0.MacroDeckDataServicePort macroDeckDataServicePort = null;
  
  public MacroDeckDataServicePortProxy() {
    _initMacroDeckDataServicePortProxy();
  }
  
  private void _initMacroDeckDataServicePortProxy() {
    try {
      macroDeckDataServicePort = (new com.macrodeck.www.xmlns.services._1_0.MacroDeckServiceLocator()).getMacroDeckDataServicePort();
      if (macroDeckDataServicePort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)macroDeckDataServicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)macroDeckDataServicePort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (macroDeckDataServicePort != null)
      ((javax.xml.rpc.Stub)macroDeckDataServicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.macrodeck.www.xmlns.services._1_0.MacroDeckDataServicePort getMacroDeckDataServicePort() {
    if (macroDeckDataServicePort == null)
      _initMacroDeckDataServicePortProxy();
    return macroDeckDataServicePort;
  }
  
  public boolean setIntegerValue(java.lang.String authCode, java.lang.String itemUUID, int value) throws java.rmi.RemoteException{
    if (macroDeckDataServicePort == null)
      _initMacroDeckDataServicePortProxy();
    return macroDeckDataServicePort.setIntegerValue(authCode, itemUUID, value);
  }
  
  public java.lang.String createDataItem(java.lang.String authCode, java.lang.String grouping, com.macrodeck.www.xmlns.services._1_0.DataServiceCustomTypesItemMetadata metadata) throws java.rmi.RemoteException{
    if (macroDeckDataServicePort == null)
      _initMacroDeckDataServicePortProxy();
    return macroDeckDataServicePort.createDataItem(authCode, grouping, metadata);
  }
  
  public boolean deleteIntegerValue(java.lang.String authCode, java.lang.String itemUUID) throws java.rmi.RemoteException{
    if (macroDeckDataServicePort == null)
      _initMacroDeckDataServicePortProxy();
    return macroDeckDataServicePort.deleteIntegerValue(authCode, itemUUID);
  }
  
  public boolean deleteDataItem(java.lang.String authCode, java.lang.String itemUUID) throws java.rmi.RemoteException{
    if (macroDeckDataServicePort == null)
      _initMacroDeckDataServicePortProxy();
    return macroDeckDataServicePort.deleteDataItem(authCode, itemUUID);
  }
  
  public boolean setObjectValue(java.lang.String authCode, java.lang.String itemUUID, com.macrodeck.www.xmlns.services._1_0.DataServiceCustomTypesYAML value) throws java.rmi.RemoteException{
    if (macroDeckDataServicePort == null)
      _initMacroDeckDataServicePortProxy();
    return macroDeckDataServicePort.setObjectValue(authCode, itemUUID, value);
  }
  
  public boolean deleteObjectValue(java.lang.String authCode, java.lang.String itemUUID) throws java.rmi.RemoteException{
    if (macroDeckDataServicePort == null)
      _initMacroDeckDataServicePortProxy();
    return macroDeckDataServicePort.deleteObjectValue(authCode, itemUUID);
  }
  
  public boolean setStringValue(java.lang.String authCode, java.lang.String itemUUID, java.lang.String value) throws java.rmi.RemoteException{
    if (macroDeckDataServicePort == null)
      _initMacroDeckDataServicePortProxy();
    return macroDeckDataServicePort.setStringValue(authCode, itemUUID, value);
  }
  
  public boolean deleteStringValue(java.lang.String authCode, java.lang.String itemUUID) throws java.rmi.RemoteException{
    if (macroDeckDataServicePort == null)
      _initMacroDeckDataServicePortProxy();
    return macroDeckDataServicePort.deleteStringValue(authCode, itemUUID);
  }
  
  
}