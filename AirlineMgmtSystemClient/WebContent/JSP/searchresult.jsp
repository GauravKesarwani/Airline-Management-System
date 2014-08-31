<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="fdpackage.FlightDetailsBean"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="/AirlineMgmtSystemClient/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="/AirlineMgmtSystemClient/resources/css/search.css" rel="stylesheet">
<script type="text/javascript" src="/AirlineMgmtSystemClient/js/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="/AirlineMgmtSystemClient/js/jquery-ui-1.8.12.custom.min.js"></script>
<title>Search Results</title>
<script type="text/javascript">
$(function() {
	$('#selection').attr('checked',true);
	$('#returnselection').attr('checked',true);
});
$(document).ready(function(){
	$('.selection').change(function(){
		var id = $(this).attr('id');
		var priceId = "price"+id;
		var dateOfJourney = "doj"+id;
		//alert($(this).val()+"-"+id+" : "+idNoId);
		$('#'+priceId).removeAttr('disabled','disabled');
		$('.selected').attr('disabled','disabled');
		$('.selected').removeClass('selected');
		$('#'+dateOfJourney).removeAttr('disabled','disabled');
		$('#'+priceId).attr('class','selected');
		$('#'+dateOfJourney).attr('class','selected');
	});
});


</script>
</head>
<body>
<!-- %@include file="/../AMSheader.jsp" %> -->
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<img src="/AirlineMgmtSystemClient/resources/img/top.gif" style="width: 100%">
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column">

					<div id="errorText"></div>
			<%
			System.out.println("In search jsp");
			FlightDetailsBean[] fdbean = null;
			if(session.getAttribute("flightdetails")!=null) {
					System.out.println("Session has values");
					fdbean = (FlightDetailsBean[]) session.getAttribute("flightdetails");
			}
			if(fdbean==null || fdbean.length<=0) {
				%><br><br>
				<div>No flights from the selected source and destinations within 5 days of selection. Please change the selection.</div>
				<a href="/AirlineMgmtSystemClient/JSP/index.html"><input type="button" value="Back To Search"/></a>
				<% }
			
			else {

				System.out.println("fdBean :" +fdbean.length); %>
			<FORM id="formResults" method="post" action="/AirlineMgmtSystemClient/servlets/BeginReservationServlet">
					<%session.setAttribute("person_id",2); %>
					<TABLE>
						<TR>
							<TD align="center"><H3>Welcome To Penguin Airlines
									Online Booking Facility</H3>
								<P>Select your preferred flight(s) / fare by clicking the
									radio button next to the selection available,scroll to the
									bottom of this page and click Continue.</TD>

						</TR>
					</TABLE>


					<TABLE id="table3">
						<TR>
							<td colspan="7">
								<h4>Select Departing Flight</h4>
							</td>
						</TR>
						<TR>
							<TH width="12%">Select</TH>
							<TH width="12%" align=center>Flight</TH>
							<TH width="12%">Depart From</TH>
							<TH width="12%">Arrive At</TH>
							<TH width="12%">Departure Date</TH>
							<TH width="12%">Departure Time</TH>
							<TH width="12%">Arrival Time</TH>
							<TH width="12%">Fare</TH>
						</TR>
						<%
								for (int i = 0; i < fdbean.length; i++) {
								System.out.println("fdBean Id :"+fdbean[i].getFlightId());
								System.out.println("Price : "+fdbean[i].getFare());
						%>
						<TR>
							<TD width="12%"><INPUT type="radio" id="<%=fdbean[i].getFlightId()%>" class="selection"
								name="flightId" value="<%=fdbean[i].getFlightId()%>"></TD>
								<input type="hidden" name="price" id="price<%=fdbean[i].getFlightId()%>" value="<%=fdbean[i].getFare()%>" disabled/>
								<input type="hidden" name="dateOfJourney" id="doj<%=fdbean[i].getFlightId()%>" value="<%=fdbean[i].getDate_of_journey()%>" disabled/>
							<TD width="12%"><%=fdbean[i].getFlightnumber()%></TD>
							<TD width="12%"><%=fdbean[i].getSource()%></TD>
							<TD width="12%"><%=fdbean[i].getDestination()%></TD>
							<TD width="12%"><%=fdbean[i].getDate_of_journey()%></TD>
							<TD width="12%"><%=fdbean[i].getDeparture()%></TD>
							<TD width="12%"><%=fdbean[i].getArrival()%></TD>
							<TD width="12%"><%=Double.toString(fdbean[i].getFare())%></TD>
						</TR>
						<%
							}
						%>
					</TABLE>

					<BR>
					<input type="hidden" name="noOfPassengers" value="<%=request.getAttribute("noOfPassengers") %>"/>
					<TABLE width="90%">
						<TR>
							<TD WIDTH="90%" align="right"></TD>
							<TD><INPUT type=submit name=conti value="Book FLights"
								class="btn btn-primary"></TD>
						</TR>
					</TABLE>
				</FORM>
					<%
					}
					%>
			</div>
		</div>
	</div>
</body>
</html>