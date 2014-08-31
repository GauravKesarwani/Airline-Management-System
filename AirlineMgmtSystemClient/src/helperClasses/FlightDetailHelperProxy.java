package helperClasses;

public class FlightDetailHelperProxy implements helperClasses.FlightDetailHelper {
  private String _endpoint = null;
  private helperClasses.FlightDetailHelper flightDetailHelper = null;
  
  public FlightDetailHelperProxy() {
    _initFlightDetailHelperProxy();
  }
  
  public FlightDetailHelperProxy(String endpoint) {
    _endpoint = endpoint;
    _initFlightDetailHelperProxy();
  }
  
  private void _initFlightDetailHelperProxy() {
    try {
      flightDetailHelper = (new helperClasses.FlightDetailHelperServiceLocator()).getFlightDetailHelper();
      if (flightDetailHelper != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)flightDetailHelper)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)flightDetailHelper)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (flightDetailHelper != null)
      ((javax.xml.rpc.Stub)flightDetailHelper)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public helperClasses.FlightDetailHelper getFlightDetailHelper() {
    if (flightDetailHelper == null)
      _initFlightDetailHelperProxy();
    return flightDetailHelper;
  }
  
  public beanFiles.FlightDetailsBean[] cancelFlight(int[] flightIds) throws java.rmi.RemoteException{
    if (flightDetailHelper == null)
      _initFlightDetailHelperProxy();
    return flightDetailHelper.cancelFlight(flightIds);
  }
  
  public beanFiles.FlightDetailsBean createNewFlight(beanFiles.FlightDetailsBean newFilght) throws java.rmi.RemoteException{
    if (flightDetailHelper == null)
      _initFlightDetailHelperProxy();
    return flightDetailHelper.createNewFlight(newFilght);
  }
  
  public beanFiles.FlightDetailsBean[] listAllFlights() throws java.rmi.RemoteException{
    if (flightDetailHelper == null)
      _initFlightDetailHelperProxy();
    return flightDetailHelper.listAllFlights();
  }
  
  public beanFiles.FlightDetailsBean[] getFlightByFlightIds(int[] flightIds) throws java.rmi.RemoteException{
    if (flightDetailHelper == null)
      _initFlightDetailHelperProxy();
    return flightDetailHelper.getFlightByFlightIds(flightIds);
  }
  
  public beanFiles.FlightDetailsBean[] updateFlights(beanFiles.FlightDetailsBean[] flights) throws java.rmi.RemoteException{
    if (flightDetailHelper == null)
      _initFlightDetailHelperProxy();
    return flightDetailHelper.updateFlights(flights);
  }
  
  
}