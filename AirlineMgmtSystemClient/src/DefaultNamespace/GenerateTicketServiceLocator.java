/**
 * GenerateTicketServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class GenerateTicketServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.GenerateTicketService {

    public GenerateTicketServiceLocator() {
    }


    public GenerateTicketServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GenerateTicketServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GenerateTicket
    private java.lang.String GenerateTicket_address = "http://localhost:8080/PaymentService/services/GenerateTicket";

    public java.lang.String getGenerateTicketAddress() {
        return GenerateTicket_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GenerateTicketWSDDServiceName = "GenerateTicket";

    public java.lang.String getGenerateTicketWSDDServiceName() {
        return GenerateTicketWSDDServiceName;
    }

    public void setGenerateTicketWSDDServiceName(java.lang.String name) {
        GenerateTicketWSDDServiceName = name;
    }

    public DefaultNamespace.GenerateTicket getGenerateTicket() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GenerateTicket_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGenerateTicket(endpoint);
    }

    public DefaultNamespace.GenerateTicket getGenerateTicket(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.GenerateTicketSoapBindingStub _stub = new DefaultNamespace.GenerateTicketSoapBindingStub(portAddress, this);
            _stub.setPortName(getGenerateTicketWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGenerateTicketEndpointAddress(java.lang.String address) {
        GenerateTicket_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.GenerateTicket.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.GenerateTicketSoapBindingStub _stub = new DefaultNamespace.GenerateTicketSoapBindingStub(new java.net.URL(GenerateTicket_address), this);
                _stub.setPortName(getGenerateTicketWSDDServiceName());
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
        if ("GenerateTicket".equals(inputPortName)) {
            return getGenerateTicket();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "GenerateTicketService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "GenerateTicket"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GenerateTicket".equals(portName)) {
            setGenerateTicketEndpointAddress(address);
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
