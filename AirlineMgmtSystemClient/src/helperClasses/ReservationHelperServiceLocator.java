/**
 * ReservationHelperServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package helperClasses;

public class ReservationHelperServiceLocator extends org.apache.axis.client.Service implements helperClasses.ReservationHelperService {

    public ReservationHelperServiceLocator() {
    }


    public ReservationHelperServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReservationHelperServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReservationHelper
    private java.lang.String ReservationHelper_address = "http://localhost:8080/AirlineMgmtSystemServer/services/ReservationHelper";

    public java.lang.String getReservationHelperAddress() {
        return ReservationHelper_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReservationHelperWSDDServiceName = "ReservationHelper";

    public java.lang.String getReservationHelperWSDDServiceName() {
        return ReservationHelperWSDDServiceName;
    }

    public void setReservationHelperWSDDServiceName(java.lang.String name) {
        ReservationHelperWSDDServiceName = name;
    }

    public helperClasses.ReservationHelper getReservationHelper() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReservationHelper_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReservationHelper(endpoint);
    }

    public helperClasses.ReservationHelper getReservationHelper(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            helperClasses.ReservationHelperSoapBindingStub _stub = new helperClasses.ReservationHelperSoapBindingStub(portAddress, this);
            _stub.setPortName(getReservationHelperWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReservationHelperEndpointAddress(java.lang.String address) {
        ReservationHelper_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (helperClasses.ReservationHelper.class.isAssignableFrom(serviceEndpointInterface)) {
                helperClasses.ReservationHelperSoapBindingStub _stub = new helperClasses.ReservationHelperSoapBindingStub(new java.net.URL(ReservationHelper_address), this);
                _stub.setPortName(getReservationHelperWSDDServiceName());
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
        if ("ReservationHelper".equals(inputPortName)) {
            return getReservationHelper();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://helperClasses", "ReservationHelperService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://helperClasses", "ReservationHelper"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReservationHelper".equals(portName)) {
            setReservationHelperEndpointAddress(address);
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
