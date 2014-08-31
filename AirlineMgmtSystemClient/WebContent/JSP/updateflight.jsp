<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="fdpackage.FlightListBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Flight</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="search.css">
<link rel="stylesheet" href="css/redmond/jquery-ui-1.8.16.custom.css">
<script type="text/javascript" src="js/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.12.custom.min.js"></script>


<script type="text/javascript">
//to trim an input String

	$(function() {
		var dateToday = new Date();
		$("#departdate").datepicker({
			numberOfMonths : 2,
			showButtonPanel : true,
			minDate : dateToday
		});


	});
	
function validateForm() {
		
		 if (($("#departdate").val() == "null")||($("#airline_name").val()=="null")||($("#airline_name").val()=="null")||($("#airline_name").val()=="null")) {
			 $("#errorText").html(
				"Please fill the required fields to update flight details.");
		$("#errorText").css({
			'color' : 'red'
		});
			return false;
		} else {
			$("#errorText").html(
			"");
		return true;
	}
} 
	</script>
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<img style="width: 100%" src="top.gif">

				<nav class="navbar navbar-default" role="navigation">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span><span
								class="icon-bar"></span><span class="icon-bar"></span><span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">Home</a>
					</div>

					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">About Us</a></li>
							<li><a href="#">Link</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">Navigate<strong class="caret"></strong></a>
								<ul class="dropdown-menu">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li class="divider"></li>
									<li><a href="#">Separated link</a></li>
									<li class="divider"></li>
									<li><a href="#">One more separated link</a></li>
								</ul></li>
						</ul>
						<form class="navbar-form navbar-left">
							<div class="form-group">
								<input type="text" class="form-control">
							</div>
							<button type="submit" class="btn btn-default">Submit</button>
						</form>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="#">Link</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
								<ul class="dropdown-menu">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li class="divider"></li>
									<li><a href="#">Separated link</a></li>
								</ul></li>
						</ul>
					</div>

				</nav>
			</div>
		</div>
		<div class="col-md-12 column">
			<div class="row clearfix">
<form name="updateflight" action="/AirlineMgmtSystemClient/servlets/UpdateFlight" onsubmit="return validateForm();" method="post">


<%
String selectedFlight=request.getParameter("selected");
int index1=0;
if(null!=selectedFlight){
index1=Integer.parseInt(selectedFlight);
}
FlightListBean[] fdbean = (FlightListBean[]) session.getAttribute("flightlist");
%>

	
<table id="table2">
<TR>
							<TD colspan="2">
								<div id="errorText"></div>
							</TD>

						</TR>
			<tr>
				<td colspan="2"><h4>Update Flight Details</h4></td>
			</tr>
			<tr>
				<td>Flight id</td>
				<td><input type="text" id="flightid" name="flightid" value="<%=fdbean[index1].getFlight_id()%>"></input></td>
			</tr>
			<tr>
				<td>Flight Number</td>
				<td><input type="text" id="flight_number" name="flight_number" value="<%=fdbean[index1].getFlight_Number()%>"></input></td>
			</tr>	
			<tr>
				<td>Airline Name</td>
				<td><input type="text" id="airline_name" name="airline_name" value="<%=fdbean[index1].getAirline_Name()%>"></input></td>
			</tr>
			<tr>
				<td>Departure Date</td>
				<td><input type="text"
								name="departdate"  id="departdate"  value="<%=fdbean[index1].getDepart_date()%>"></td>
				
			</tr>
			<tr>
				<td>Airline Name</td>
				<td><input type="text" id="source" name="source" value="<%=fdbean[index1].getFlight_Source()%>"></input></td>
			</tr>
			<tr>
				<td>Destination</td>
				<td><input type="text"
								name="destination"  id="destination"  value="<%=fdbean[index1].getFlight_Destination()%>"></td>
				
			</tr>
				<tr>
				<td>Departure Time</td>
				<td><input type="text"
								name="departtime"  id="departtime"  value="<%=fdbean[index1].getFlight_Depart_Time()%>"></td>
				
			</tr>
			</tr>
				<tr>
				<td>Arrival Time</td>
				<td><input type="text"
								name="arrivaltime"  id="arrivaltime"  value="<%=fdbean[index1].getFlight_Arr_Time()%>"></td>
				
			</tr>
			</tr>
			<tr>
				<td>Flight Fare</td>
				<td><input type="text"
								name="fare"  id="fare"  value="<%=fdbean[index1].getFlight_fare()%>"></td>
				
			</tr>
			<tr>
				<td>Number of seats</td>
				<td><input type="text"
								name="no_of_seats"  id="no_of_seats"  value="<%=fdbean[index1].getNo_of_seats()%>"></td>
				
			</tr>
			<tr>
				<td>Crew Count</td>
				<td><input type="text"
								name="crew_count"  id="crew_count"  value="<%=fdbean[index1].getCrew_Count()%>"></td>
				
			</tr>	
								
				<TR>
							<TD colspan=2></TD>
							<TD><div class="control-group">
									<label class="control-label" for="Search"></label>
									<div class="controls">
										<input type="submit" id="Search" name="Search"
											value="Update Flights" class="btn btn-primary" />
									</div>
								</div></TD>
						</TR>
							

</table>
</form>
</div>
</div>
</div>
</body>
</html>