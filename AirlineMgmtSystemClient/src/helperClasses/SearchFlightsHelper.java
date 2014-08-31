/**
 * SearchFlightsHelper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package helperClasses;

public interface SearchFlightsHelper extends java.rmi.Remote {
    public fdpackage.FlightDetailsBean[] searchCancelledFlights(java.util.Calendar date) throws java.rmi.RemoteException;
    public fdpackage.FlightDetailsBean searchFlightByBookingId(fdpackage.FlightDetailsBean flightdetails) throws java.rmi.RemoteException;
    public beanFiles.ActiveReservationsBean[] loadReservationsForFlight(int flightId) throws java.rmi.RemoteException;
    public fdpackage.CustomerBean searchCustomerByBookingIdRef(fdpackage.CustomerBean cust) throws java.rmi.RemoteException;
    public fdpackage.FlightListBean[] getFlightlist() throws java.rmi.RemoteException;
    public boolean updateFlight(fdpackage.FlightListBean flight) throws java.rmi.RemoteException;
    public fdpackage.FlightListBean getFlightInfo(fdpackage.FlightListBean flbean) throws java.rmi.RemoteException;
    public fdpackage.FlightDetailsBean[] searchOneWayFlight(fdpackage.FlightDetailsBean flightdetails) throws java.rmi.RemoteException;
    public fdpackage.FlightDetailsBean[] searchReturnFlight(fdpackage.FlightDetailsBean flightdetails) throws java.rmi.RemoteException;
}
