/**
 * EmployeeHelper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package helperClasses;

public interface EmployeeHelper extends java.rmi.Remote {
    public beanFiles.PersonBean[] listEmployee() throws java.rmi.RemoteException;
    public boolean updDeleteEmployee(beanFiles.PersonBean empObj, java.lang.String emp, boolean isUpdate) throws java.rmi.RemoteException;
    public boolean createNewEmployee(beanFiles.PersonBean empObj) throws java.rmi.RemoteException;
    public beanFiles.PersonBean[] searchEmployee(beanFiles.PersonBean empObj) throws java.rmi.RemoteException;
}
