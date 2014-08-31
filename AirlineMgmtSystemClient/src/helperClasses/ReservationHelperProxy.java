package helperClasses;

public class ReservationHelperProxy implements helperClasses.ReservationHelper {
  private String _endpoint = null;
  private helperClasses.ReservationHelper reservationHelper = null;
  
  public ReservationHelperProxy() {
    _initReservationHelperProxy();
  }
  
  public ReservationHelperProxy(String endpoint) {
    _endpoint = endpoint;
    _initReservationHelperProxy();
  }
  
  private void _initReservationHelperProxy() {
    try {
      reservationHelper = (new helperClasses.ReservationHelperServiceLocator()).getReservationHelper();
      if (reservationHelper != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)reservationHelper)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)reservationHelper)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (reservationHelper != null)
      ((javax.xml.rpc.Stub)reservationHelper)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public helperClasses.ReservationHelper getReservationHelper() {
    if (reservationHelper == null)
      _initReservationHelperProxy();
    return reservationHelper;
  }
  
  public beanFiles.ReservationBean createNewReservations(beanFiles.ReservationBean reservation) throws java.rmi.RemoteException{
    if (reservationHelper == null)
      _initReservationHelperProxy();
    return reservationHelper.createNewReservations(reservation);
  }
  
  public beanFiles.ActiveReservationsBean[] cancelReservation(int customerId, int reservationId) throws java.rmi.RemoteException{
    if (reservationHelper == null)
      _initReservationHelperProxy();
    return reservationHelper.cancelReservation(customerId, reservationId);
  }
  
  public beanFiles.ActiveReservationsBean[] loadReservationsForCustomer(int customerId, java.lang.String status) throws java.rmi.RemoteException{
    if (reservationHelper == null)
      _initReservationHelperProxy();
    return reservationHelper.loadReservationsForCustomer(customerId, status);
  }
  
  public beanFiles.ActiveReservationsBean[] cancelReservationDtl(int customerId, int[] reservationDtlId) throws java.rmi.RemoteException{
    if (reservationHelper == null)
      _initReservationHelperProxy();
    return reservationHelper.cancelReservationDtl(customerId, reservationDtlId);
  }
  
  public beanFiles.ActiveReservationsBean[] loadReservationsForFlight(int flightId) throws java.rmi.RemoteException{
    if (reservationHelper == null)
      _initReservationHelperProxy();
    return reservationHelper.loadReservationsForFlight(flightId);
  }
  
  
}