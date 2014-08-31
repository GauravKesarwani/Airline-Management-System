/**
 * PayService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface PayService extends java.rmi.Remote {
    public boolean payByCredit(int reservationId, long cardNo, java.lang.String date, int flightID, java.lang.String flightNo, int personId, int amt) throws java.rmi.RemoteException;
    public boolean updateStatus(int reservationid, int people) throws java.rmi.RemoteException;
}
