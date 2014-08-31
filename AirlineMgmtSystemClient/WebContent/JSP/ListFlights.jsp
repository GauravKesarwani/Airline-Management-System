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
<script type="text/javascript">
$(function() {
	$('#selection').attr('checked',true);
	$('#returnselection').attr('checked',true);
});

</script>
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

				<FORM id="formResults" method="Post" action="/AirlineMgmtSystemClient/JSP/updateflight.jsp">

					<TABLE>
						
						<%
							FlightListBean[] fdbean = (FlightListBean[]) session.getAttribute("flightlist");
							for (int i = 0; i < fdbean.length; i++) {
						%>
						 <TR>
						 	<TD width="12%"><INPUT type="radio" id="selected" name="selected" value="<%=i%>"></TD>
							<TD width="12%"><%=fdbean[i].getFlight_id()%></TD>
							<TD width="12%"><%=fdbean[i].getFlight_Number()%></TD>
							<TD width="12%"><%=fdbean[i].getAirline_Name()%></TD>
							<TD width="12%"><%=fdbean[i].getDepart_date()%></TD>
							<TD width="12%"><%=fdbean[i].getFlight_Source()%></TD>
							<TD width="12%"><%=fdbean[i].getFlight_Destination()%></TD>
							<TD width="12%"><%=fdbean[i].getFlight_Depart_Time()%></TD>
							<TD width="12%"><%=fdbean[i].getFlight_Arr_Time()%></TD>	
						</TR>
						<%
							}
						%>
						
					</TABLE>
					<input type="submit" id="Update" name="Update"
											value="updateflight" class="btn btn-primary" />	
				</FORM>
			</div>
			</div>
		</div>
		</body>
		</html>	