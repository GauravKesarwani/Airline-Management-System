<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="fdpackage.FlightListBean"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../resources/css/bootstrap.min.css" rel="stylesheet">
<link href="../resources/css/search.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.12.custom.min.js"></script>
<title>Search Results</title>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<img src="../resources/img/top.gif" style="width: 100%">
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column">

				<FORM id="formResults" method="Post" action="">

					<TABLE>
						
						<%
							FlightListBean fdbean = (FlightListBean) session.getAttribute("flightinfobean");
							
						%>
						<TR>
						 	
							<TH width="12%">Flight Id</TH>
							<TH width="12%">Flight Number</TH>
							<TH width="12%">Flight Name</TD>
							<TD width="12%">Flight Depart Date</TD>
							<TD width="12%">Flight Source</TD>
							<TD width="12%">Flight Destination</TD>
							<TD width="12%">Flight Depart Time</TD>
							<TD width="12%">Flight Arrival Time</TD>	
							<TD width="12%">Flight Fare</TD>
							<TD width="12%">Number of Seats</TD>
						</TR>
						 <TR>
						 	
							<TD width="12%"><%=fdbean.getFlight_id()%></TD>
							<TD width="12%"><%=fdbean.getFlight_Number()%></TD>
							<TD width="12%"><%=fdbean.getAirline_Name()%></TD>
							<TD width="12%"><%=fdbean.getDepart_date()%></TD>
							<TD width="12%"><%=fdbean.getFlight_Source()%></TD>
							<TD width="12%"><%=fdbean.getFlight_Destination()%></TD>
							<TD width="12%"><%=fdbean.getFlight_Depart_Time()%></TD>
							<TD width="12%"><%=fdbean.getFlight_Arr_Time()%></TD>	
							<TD width="12%"><%=fdbean.getFlight_fare()%></TD>
							<TD width="12%"><%=fdbean.getNo_of_seats()%></TD>
						</TR>
					</TABLE>
						

</body>
</html>