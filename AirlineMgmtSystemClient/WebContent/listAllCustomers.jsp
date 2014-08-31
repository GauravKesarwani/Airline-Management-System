<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.att.ws.ProfileBean"%>

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

				<FORM id="formResults" method="Post" action="SearchAllCustomers">

					<TABLE>
						
						<%
						ProfileBean[] bean = (ProfileBean[]) session.getAttribute("customerList");
							for (int i = 0; i < bean.length; i++) {
						%>
						 <TR>
						 	<TD width="12%"><INPUT type="radio" id="selected" name="selected" value="<%=i%>"></TD>
							<TD width="12%"><%=bean[i].getPerson_id()%></TD>
							<TD width="12%"><%=bean[i].getFirst_name()%></TD>
							<TD width="12%"><%=bean[i].getLast_name()%></TD>
							<TD width="12%"><%=bean[i].getContact_no()%></TD>
							<TD width="12%"><%=bean[i].getEmail()%></TD>
							<TD width="12%"><%=bean[i].getAddress()%></TD>
							<TD width="12%"><%=bean[i].getCity()%></TD>
							<TD width="12%"><%=bean[i].getState()%></TD>
							<TD width="12%"><%=bean[i].getZipcode()%></TD>
							<TD width="12%"><%=bean[i].getDate_of_birth()%></TD>
							<TD width="12%"><%=bean[i].getGender()%></TD>
							<TD width="12%"><%=bean[i].getTraveller_id()%></TD>	
						</TR>
						<%
							}
						%>
						
					</TABLE>
					<input type="submit" id="Update" name="Update"
											value="Show Customers" class="btn btn-primary" />	
				</FORM>
			</div>
			</div>
		</div>
		</body>
		</html>	