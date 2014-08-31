/**
 * EmployeeHelperServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package helperClasses;

public class EmployeeHelperServiceLocator extends org.apache.axis.client.Service implements helperClasses.EmployeeHelperService {

    public EmployeeHelperServiceLocator() {
    }


    public EmployeeHelperServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmployeeHelperServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmployeeHelper
    private java.lang.String EmployeeHelper_address = "http://localhost:8080/AirlineMgmtSystemServer/services/EmployeeHelper";

    public java.lang.String getEmployeeHelperAddress() {
        return EmployeeHelper_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmployeeHelperWSDDServiceName = "EmployeeHelper";

    public java.lang.String getEmployeeHelperWSDDServiceName() {
        return EmployeeHelperWSDDServiceName;
    }

    public void setEmployeeHelperWSDDServiceName(java.lang.String name) {
        EmployeeHelperWSDDServiceName = name;
    }

    public helperClasses.EmployeeHelper getEmployeeHelper() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmployeeHelper_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmployeeHelper(endpoint);
    }

    public helperClasses.EmployeeHelper getEmployeeHelper(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            helperClasses.EmployeeHelperSoapBindingStub _stub = new helperClasses.EmployeeHelperSoapBindingStub(portAddress, this);
            _stub.setPortName(getEmployeeHelperWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmployeeHelperEndpointAddress(java.lang.String address) {
        EmployeeHelper_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (helperClasses.EmployeeHelper.class.isAssignableFrom(serviceEndpointInterface)) {
                helperClasses.EmployeeHelperSoapBindingStub _stub = new helperClasses.EmployeeHelperSoapBindingStub(new java.net.URL(EmployeeHelper_address), this);
                _stub.setPortName(getEmployeeHelperWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EmployeeHelper".equals(inputPortName)) {
            return getEmployeeHelper();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://helperClasses", "EmployeeHelperService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://helperClasses", "EmployeeHelper"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EmployeeHelper".equals(portName)) {
            setEmployeeHelperEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
