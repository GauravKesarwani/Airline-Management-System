/**
 * FlightDetailHelper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package helperClasses;

public interface FlightDetailHelper extends java.rmi.Remote {
    public beanFiles.FlightDetailsBean[] cancelFlight(int[] flightIds) throws java.rmi.RemoteException;
    public beanFiles.FlightDetailsBean createNewFlight(beanFiles.FlightDetailsBean newFilght) throws java.rmi.RemoteException;
    public beanFiles.FlightDetailsBean[] listAllFlights() throws java.rmi.RemoteException;
    public beanFiles.FlightDetailsBean[] getFlightByFlightIds(int[] flightIds) throws java.rmi.RemoteException;
    public beanFiles.FlightDetailsBean[] updateFlights(beanFiles.FlightDetailsBean[] flights) throws java.rmi.RemoteException;
}
