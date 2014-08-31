/**
 * ReservationHelper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package helperClasses;

public interface ReservationHelper extends java.rmi.Remote {
    public beanFiles.ReservationBean createNewReservations(beanFiles.ReservationBean reservation) throws java.rmi.RemoteException;
    public beanFiles.ActiveReservationsBean[] cancelReservation(int customerId, int reservationId) throws java.rmi.RemoteException;
    public beanFiles.ActiveReservationsBean[] loadReservationsForCustomer(int customerId, java.lang.String status) throws java.rmi.RemoteException;
    public beanFiles.ActiveReservationsBean[] cancelReservationDtl(int customerId, int[] reservationDtlId) throws java.rmi.RemoteException;
    public beanFiles.ActiveReservationsBean[] loadReservationsForFlight(int flightId) throws java.rmi.RemoteException;
}
