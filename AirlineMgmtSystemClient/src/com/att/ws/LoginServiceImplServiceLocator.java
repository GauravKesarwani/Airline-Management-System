/**
 * LoginServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.att.ws;

public class LoginServiceImplServiceLocator extends org.apache.axis.client.Service implements com.att.ws.LoginServiceImplService {

    public LoginServiceImplServiceLocator() {
    }


    public LoginServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoginServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LoginServiceImpl
    private java.lang.String LoginServiceImpl_address = "http://localhost:8080/LoginService/services/LoginServiceImpl";

    public java.lang.String getLoginServiceImplAddress() {
        return LoginServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LoginServiceImplWSDDServiceName = "LoginServiceImpl";

    public java.lang.String getLoginServiceImplWSDDServiceName() {
        return LoginServiceImplWSDDServiceName;
    }

    public void setLoginServiceImplWSDDServiceName(java.lang.String name) {
        LoginServiceImplWSDDServiceName = name;
    }

    public com.att.ws.LoginServiceImpl getLoginServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LoginServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLoginServiceImpl(endpoint);
    }

    public com.att.ws.LoginServiceImpl getLoginServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.att.ws.LoginServiceImplSoapBindingStub _stub = new com.att.ws.LoginServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getLoginServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLoginServiceImplEndpointAddress(java.lang.String address) {
        LoginServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.att.ws.LoginServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.att.ws.LoginServiceImplSoapBindingStub _stub = new com.att.ws.LoginServiceImplSoapBindingStub(new java.net.URL(LoginServiceImpl_address), this);
                _stub.setPortName(getLoginServiceImplWSDDServiceName());
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
        if ("LoginServiceImpl".equals(inputPortName)) {
            return getLoginServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.att.com", "LoginServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.att.com", "LoginServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LoginServiceImpl".equals(portName)) {
            setLoginServiceImplEndpointAddress(address);
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
