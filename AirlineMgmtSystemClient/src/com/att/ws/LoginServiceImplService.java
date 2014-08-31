/**
 * LoginServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.att.ws;

public interface LoginServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getLoginServiceImplAddress();

    public com.att.ws.LoginServiceImpl getLoginServiceImpl() throws javax.xml.rpc.ServiceException;

    public com.att.ws.LoginServiceImpl getLoginServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
