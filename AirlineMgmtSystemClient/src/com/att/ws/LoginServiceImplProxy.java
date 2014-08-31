package com.att.ws;

public class LoginServiceImplProxy implements com.att.ws.LoginServiceImpl {
  private String _endpoint = null;
  private com.att.ws.LoginServiceImpl loginServiceImpl = null;
  
  public LoginServiceImplProxy() {
    _initLoginServiceImplProxy();
  }
  
  public LoginServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initLoginServiceImplProxy();
  }
  
  private void _initLoginServiceImplProxy() {
    try {
      loginServiceImpl = (new com.att.ws.LoginServiceImplServiceLocator()).getLoginServiceImpl();
      if (loginServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)loginServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)loginServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (loginServiceImpl != null)
      ((javax.xml.rpc.Stub)loginServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.att.ws.LoginServiceImpl getLoginServiceImpl() {
    if (loginServiceImpl == null)
      _initLoginServiceImplProxy();
    return loginServiceImpl;
  }
  
  public void deleteProfile(int personId) throws java.rmi.RemoteException{
    if (loginServiceImpl == null)
      _initLoginServiceImplProxy();
    loginServiceImpl.deleteProfile(personId);
  }
  
  public com.att.ws.ProfileBean getProfileInfo(java.lang.String username) throws java.rmi.RemoteException{
    if (loginServiceImpl == null)
      _initLoginServiceImplProxy();
    return loginServiceImpl.getProfileInfo(username);
  }
  
  public boolean loginValidate(java.lang.String userName, java.lang.String pass) throws java.rmi.RemoteException{
    if (loginServiceImpl == null)
      _initLoginServiceImplProxy();
    return loginServiceImpl.loginValidate(userName, pass);
  }
  
  public com.att.ws.ProfileBean[] getListOfCustomers() throws java.rmi.RemoteException{
    if (loginServiceImpl == null)
      _initLoginServiceImplProxy();
    return loginServiceImpl.getListOfCustomers();
  }
  
  public boolean updateProfile(com.att.ws.ProfileBean userbean1) throws java.rmi.RemoteException{
    if (loginServiceImpl == null)
      _initLoginServiceImplProxy();
    return loginServiceImpl.updateProfile(userbean1);
  }
  
  
}