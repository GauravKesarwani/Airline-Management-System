/**
 * PayServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class PayServiceServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.PayServiceService {

    public PayServiceServiceLocator() {
    }


    public PayServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PayServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for payService
    private java.lang.String payService_address = "http://localhost:8080/PaymentService/services/payService";

    public java.lang.String getpayServiceAddress() {
        return payService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String payServiceWSDDServiceName = "payService";

    public java.lang.String getpayServiceWSDDServiceName() {
        return payServiceWSDDServiceName;
    }

    public void setpayServiceWSDDServiceName(java.lang.String name) {
        payServiceWSDDServiceName = name;
    }

    public DefaultNamespace.PayService getpayService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(payService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getpayService(endpoint);
    }

    public DefaultNamespace.PayService getpayService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.PayServiceSoapBindingStub _stub = new DefaultNamespace.PayServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getpayServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setpayServiceEndpointAddress(java.lang.String address) {
        payService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.PayService.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.PayServiceSoapBindingStub _stub = new DefaultNamespace.PayServiceSoapBindingStub(new java.net.URL(payService_address), this);
                _stub.setPortName(getpayServiceWSDDServiceName());
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
        if ("payService".equals(inputPortName)) {
            return getpayService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "payServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "payService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("payService".equals(portName)) {
            setpayServiceEndpointAddress(address);
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
