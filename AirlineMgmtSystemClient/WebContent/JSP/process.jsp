<%@ page import="java.sql.*" %>
<%@ page import="com.sun.rowset.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.sql.rowset.*" %>
<%@ page import="fdpackage.FlightDetailsBean"%>



<%
String departFlight=request.getParameter("selection");
String returnFlight=request.getParameter("returnselection");
//got selected indexes from list
System.out.println(departFlight);
System.out.println(returnFlight);
if(null!=departFlight){
FlightDetailsBean[] fdbean = (FlightDetailsBean[]) session
.getAttribute("flightdetails");
int index1=Integer.parseInt(departFlight);
out.println(fdbean[index1].getFlightnumber());
}
if(null!=returnFlight){
int index2=Integer.parseInt(returnFlight);

FlightDetailsBean[] returnbean = (FlightDetailsBean[]) session
.getAttribute("returnflightdetails");
out.println(returnbean[index2].getFlightnumber());
}
%>

