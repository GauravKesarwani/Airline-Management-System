package DefaultNamespace;

public class TicketInfoProxy implements DefaultNamespace.TicketInfo {
  private String _endpoint = null;
  private DefaultNamespace.TicketInfo ticketInfo = null;
  
  public TicketInfoProxy() {
    _initTicketInfoProxy();
  }
  
  public TicketInfoProxy(String endpoint) {
    _endpoint = endpoint;
    _initTicketInfoProxy();
  }
  
  private void _initTicketInfoProxy() {
    try {
      ticketInfo = (new DefaultNamespace.TicketInfoServiceLocator()).getticketInfo();
      if (ticketInfo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ticketInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ticketInfo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ticketInfo != null)
      ((javax.xml.rpc.Stub)ticketInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.TicketInfo getTicketInfo() {
    if (ticketInfo == null)
      _initTicketInfoProxy();
    return ticketInfo;
  }
  
  public java.lang.String getdata(int personid) throws java.rmi.RemoteException{
    if (ticketInfo == null)
      _initTicketInfoProxy();
    return ticketInfo.getdata(personid);
  }
  
  
}