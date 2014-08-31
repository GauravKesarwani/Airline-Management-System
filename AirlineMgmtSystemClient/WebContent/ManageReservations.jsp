<%@page import="beanFiles.ActiveReservationsBean"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Reservations</title>
<style type="text/css">
	table.myAds th td{
		border: 1px solid #d4d4d4;
		padding-right: 10px:
		padding-top: 10px;
		padding-bottom: 10px;
		border-collapse:collapse;
	}
</style>
</head>
<body>
<%@include file="AMSheader.jsp" %>
<h4>Your Reservations</h4>
<div><%if(request.getParameter("errorMessage")!=null && request.getParameter("errorMessage").length()>0){%><%=request.getParameter("errorMessage")%><%}else { %></div>
<%  
	if(session.getAttribute("person_id")!=null) {
	Map<Integer, List<ActiveReservationsBean>> myReservations = (Map<Integer, List<ActiveReservationsBean>>)request.getAttribute("myReservations");	
	if(myReservations!=null && myReservations.size()>0) {
		for(int reservationId : myReservations.keySet()) { %>
			<table  class="myAds" style="width:80%;text-align: center; font-size: 3; border-collapse:collapse;" border="1px" bordercolor="#87AFC7">
				<tr>
					<td colspan="2" style="width:30%">Reservation Id : <%=reservationId%></td>
					<td colspan="2" style="width:40%">Status : <%=myReservations.get(reservationId).get(0).getStatus() %></td>
					<td colspan="2" style="vertical-align:center; width:30%">
						<%if(!myReservations.get(reservationId).get(0).getStatus().equals("Cancelled")) {%>
							<form name="cancelReservation" id="cancelReservation" action="CancelReservationServlet" method="post">
								<input type="hidden" name="reservationId" value="<%=reservationId %>"/>
								<input type="hidden" name="customerId" value="<%=(Integer)session.getAttribute("person_id")%>"/>
								<input type="submit" value="Cancel"/>
							</form>
						<%} %></td>
				</tr>
				<tr>
					<td>Ticket Id</td>
					<td>Name</td>
					<td>Date of Journey</td>
					<td>Source-Destination</td>
					<td>Price</td>
					<!-- td>Boarding Status</td>  -->
				</tr>
				<%for(ActiveReservationsBean reservationDtls : myReservations.get(reservationId)) {%>
				<tr>
					<td><%=reservationDtls.getReservationDtlId() %></td>
					<td><%=reservationDtls.getFirstName() %>&nbsp;<%=reservationDtls.getLastName() %></td>
					<td><%=reservationDtls.getDateOfJourney() %></td>
					<td><%=reservationDtls.getSource() %>&nbsp;-&nbsp;<%=reservationDtls.getDestination() %></td>
					<td><%=reservationDtls.getPrice() %></td>
					<!-- <td><!--%=reservationDtls.getBoardingStatus() %></td>  -->
				</tr>
				<%} %>
			</table>			
<%		}}
	}
}%>
</body>
</html>