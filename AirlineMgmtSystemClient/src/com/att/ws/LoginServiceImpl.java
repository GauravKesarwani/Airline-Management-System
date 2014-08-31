/**
 * LoginServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.att.ws;

public interface LoginServiceImpl extends java.rmi.Remote {
    public void deleteProfile(int personId) throws java.rmi.RemoteException;
    public com.att.ws.ProfileBean getProfileInfo(java.lang.String username) throws java.rmi.RemoteException;
    public boolean loginValidate(java.lang.String userName, java.lang.String pass) throws java.rmi.RemoteException;
    public com.att.ws.ProfileBean[] getListOfCustomers() throws java.rmi.RemoteException;
    public boolean updateProfile(com.att.ws.ProfileBean userbean1) throws java.rmi.RemoteException;
}
