/**
 * EmployeeHelperService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package helperClasses;

public interface EmployeeHelperService extends javax.xml.rpc.Service {
    public java.lang.String getEmployeeHelperAddress();

    public helperClasses.EmployeeHelper getEmployeeHelper() throws javax.xml.rpc.ServiceException;

    public helperClasses.EmployeeHelper getEmployeeHelper(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
