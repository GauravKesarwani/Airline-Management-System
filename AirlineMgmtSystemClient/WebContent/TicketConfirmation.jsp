<%@ page import="ticket.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>E-Ticket</title>
</head>
<body>
<div>
<center>
<img alt="header" src="top.gif">
</center>
</div>
<div>
<center>
<label>An email with e-ticket has been sent you.Please print this ticket or print the ticket from email</label>
</center>
</div>
<%
   TicketBean[] ticket=(TicketBean[])session.getAttribute("TicketInfo");
   
System.out.println("Lenght "+ticket.length);
for(int i=0;i<ticket.length;i++)
{ 
%>



<div style="margin-top:20px;">
<center>
<label> PASSENGER AND TICKET INFORMATION</label>
</center>
<table class="table table-striped">
    <tr>
    	<td>
    		PASSENGER NAME
    	<td>
    	<td>
    		<%= ticket[i].getFirstName().toString()%>/<%= ticket[i].getLastName().toString()%>
    	</td>
    	   <td></td>	
    </tr>
    
    <tr>
    	<td>
    	 ISSUED BY
    	</td>
    	<td>
    	</td>
    	<td>
    	 PENGUINE AIRWAYS
    	</td>
    	
    </tr>
</table>
</div>

<div>
<center>
<label>TRAVEL INFORMATION</label>
</center>
<table class="table table-striped">
<tr>
<thead>
     <tr>
          <th>
           FLIGHT
          </th>
           <th>
           DEPART/ARRIVE
          </th>
           <th>
           SOURCE
          </th>
          <th>
           DESTINATION
          </th>
 	 </tr>
</thead>
<tbody>
	<tr>
		  <td>
		  <%=ticket[i].getFlightNo() %>
		  </td>
		  <td>
		 <%=ticket[i].getDeparturedate() %>
		   
		  </td>
		  <td>
		  <%=ticket[i].getSource() %>
		  </td>
		  <td>
		  <%=ticket[i].getDestination() %>
		  </td>
	</tr>
</tbody> 

</table>

</div>

<div>
<center>
<label>FAIR AND ADDITIONAL INFORMATION</label>
</center>
	<table class="table table-striped">
	 	<tr>
	 		<td>
	 			FARE
	 		</td>
	 		<td>
	 		  USD <%=ticket[i].getAmount() %>
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>
	 			PAYMENT METHOD
	 		</td>
	 		<td>
	 			<%=ticket[i].getType() %>
	 		</td>
	 	</tr>
	</table>
</div>
<%
	} 
%>

<div align="center">
<form action="/AirlineMgmtSystemClient/Purchase" method="post">
<table>
	<tr>
		<td>
		   <input type="submit" name="print" value="print ticket" class="btn btn-primary" onClick="window.print();return false;"> 
		</td>
		<td>
		    <input type="submit" name="back" value="back" class="btn btn-primary">
		</td>
		<td style="padding-left: 20px">
		    <input type="submit" name="logout" id="logoutBtn" value="logout" class="btn btn-primary">
		</td>
	</tr>
</table>

</form>
</div>

</body>
</html>