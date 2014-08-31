/**
 * FlightDetailHelperServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package helperClasses;

public class FlightDetailHelperServiceLocator extends org.apache.axis.client.Service implements helperClasses.FlightDetailHelperService {

    public FlightDetailHelperServiceLocator() {
    }


    public FlightDetailHelperServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FlightDetailHelperServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FlightDetailHelper
    private java.lang.String FlightDetailHelper_address = "http://localhost:8080/AirlineMgmtSystemServer/services/FlightDetailHelper";

    public java.lang.String getFlightDetailHelperAddress() {
        return FlightDetailHelper_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FlightDetailHelperWSDDServiceName = "FlightDetailHelper";

    public java.lang.String getFlightDetailHelperWSDDServiceName() {
        return FlightDetailHelperWSDDServiceName;
    }

    public void setFlightDetailHelperWSDDServiceName(java.lang.String name) {
        FlightDetailHelperWSDDServiceName = name;
    }

    public helperClasses.FlightDetailHelper getFlightDetailHelper() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FlightDetailHelper_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFlightDetailHelper(endpoint);
    }

    public helperClasses.FlightDetailHelper getFlightDetailHelper(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            helperClasses.FlightDetailHelperSoapBindingStub _stub = new helperClasses.FlightDetailHelperSoapBindingStub(portAddress, this);
            _stub.setPortName(getFlightDetailHelperWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFlightDetailHelperEndpointAddress(java.lang.String address) {
        FlightDetailHelper_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (helperClasses.FlightDetailHelper.class.isAssignableFrom(serviceEndpointInterface)) {
                helperClasses.FlightDetailHelperSoapBindingStub _stub = new helperClasses.FlightDetailHelperSoapBindingStub(new java.net.URL(FlightDetailHelper_address), this);
                _stub.setPortName(getFlightDetailHelperWSDDServiceName());
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
        if ("FlightDetailHelper".equals(inputPortName)) {
            return getFlightDetailHelper();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://helperClasses", "FlightDetailHelperService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://helperClasses", "FlightDetailHelper"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FlightDetailHelper".equals(portName)) {
            setFlightDetailHelperEndpointAddress(address);
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
