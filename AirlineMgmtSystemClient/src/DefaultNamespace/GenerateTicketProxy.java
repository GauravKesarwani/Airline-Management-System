package DefaultNamespace;

public class GenerateTicketProxy implements DefaultNamespace.GenerateTicket {
  private String _endpoint = null;
  private DefaultNamespace.GenerateTicket generateTicket = null;
  
  public GenerateTicketProxy() {
    _initGenerateTicketProxy();
  }
  
  public GenerateTicketProxy(String endpoint) {
    _endpoint = endpoint;
    _initGenerateTicketProxy();
  }
  
  private void _initGenerateTicketProxy() {
    try {
      generateTicket = (new DefaultNamespace.GenerateTicketServiceLocator()).getGenerateTicket();
      if (generateTicket != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)generateTicket)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)generateTicket)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (generateTicket != null)
      ((javax.xml.rpc.Stub)generateTicket)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.GenerateTicket getGenerateTicket() {
    if (generateTicket == null)
      _initGenerateTicketProxy();
    return generateTicket;
  }
  
  public ticket.TicketBean[] ticketInfo(int reservationid) throws java.rmi.RemoteException{
    if (generateTicket == null)
      _initGenerateTicketProxy();
    return generateTicket.ticketInfo(reservationid);
  }
  
  
}