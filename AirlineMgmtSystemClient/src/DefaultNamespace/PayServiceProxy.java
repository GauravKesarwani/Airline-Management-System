package DefaultNamespace;

public class PayServiceProxy implements DefaultNamespace.PayService {
  private String _endpoint = null;
  private DefaultNamespace.PayService payService = null;
  
  public PayServiceProxy() {
    _initPayServiceProxy();
  }
  
  public PayServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initPayServiceProxy();
  }
  
  private void _initPayServiceProxy() {
    try {
      payService = (new DefaultNamespace.PayServiceServiceLocator()).getpayService();
      if (payService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)payService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)payService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (payService != null)
      ((javax.xml.rpc.Stub)payService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.PayService getPayService() {
    if (payService == null)
      _initPayServiceProxy();
    return payService;
  }
  
  public boolean payByCredit(int reservationId, long cardNo, java.lang.String date, int flightID, java.lang.String flightNo, int personId, int amt) throws java.rmi.RemoteException{
    if (payService == null)
      _initPayServiceProxy();
    return payService.payByCredit(reservationId, cardNo, date, flightID, flightNo, personId, amt);
  }
  
  public boolean updateStatus(int reservationid, int people) throws java.rmi.RemoteException{
    if (payService == null)
      _initPayServiceProxy();
    return payService.updateStatus(reservationid, people);
  }
  
  
}