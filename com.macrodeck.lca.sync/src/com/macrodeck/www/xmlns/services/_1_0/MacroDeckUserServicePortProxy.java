package com.macrodeck.www.xmlns.services._1_0;

public class MacroDeckUserServicePortProxy implements com.macrodeck.www.xmlns.services._1_0.MacroDeckUserServicePort {
  private String _endpoint = null;
  private com.macrodeck.www.xmlns.services._1_0.MacroDeckUserServicePort macroDeckUserServicePort = null;
  
  public MacroDeckUserServicePortProxy() {
    _initMacroDeckUserServicePortProxy();
  }
  
  private void _initMacroDeckUserServicePortProxy() {
    try {
      macroDeckUserServicePort = (new com.macrodeck.www.xmlns.services._1_0.MacroDeckServiceLocator()).getMacroDeckUserServicePort();
      if (macroDeckUserServicePort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)macroDeckUserServicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)macroDeckUserServicePort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (macroDeckUserServicePort != null)
      ((javax.xml.rpc.Stub)macroDeckUserServicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.macrodeck.www.xmlns.services._1_0.MacroDeckUserServicePort getMacroDeckUserServicePort() {
    if (macroDeckUserServicePort == null)
      _initMacroDeckUserServicePortProxy();
    return macroDeckUserServicePort;
  }
  
  public java.lang.String getAuthCode(java.lang.String userName, java.lang.String authToken) throws java.rmi.RemoteException{
    if (macroDeckUserServicePort == null)
      _initMacroDeckUserServicePortProxy();
    return macroDeckUserServicePort.getAuthCode(userName, authToken);
  }
  
  public java.lang.String getAuthCookie(java.lang.String userName) throws java.rmi.RemoteException{
    if (macroDeckUserServicePort == null)
      _initMacroDeckUserServicePortProxy();
    return macroDeckUserServicePort.getAuthCookie(userName);
  }
  
  
}