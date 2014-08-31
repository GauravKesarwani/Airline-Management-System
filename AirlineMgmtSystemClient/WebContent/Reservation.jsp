<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="/AirlineMgmtSystemClient/js/jquery-1.6.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('.idType').change(function(){
		var id = $(this).attr('id');
		var idNoId = "idNo"+id;
		//alert($(this).val()+"-"+id+" : "+idNoId);
		if($(this).val()=="ssn") {
			$('#'+idNoId).attr('pattern','[0-9]{3}-[0-9]{2}-[0-9]{4}');
			$('#'+idNoId).attr('title','Please enter in the format XXX-XX-XXXX');
		} else {
			$('#'+idNoId).attr('pattern','[a-zA-Z0-9]{2}[0-9]{5,10}');
			$('#'+idNoId).attr('title','Please enter in format X01234567');
		}
	});
});
</script>
<%@include file="AMSheader.jsp" %>
</head>
<body>
	<form name="travellerInfo" action="ReservationTravellerInfoServlet" method="post">
		<% String[] flightIds = request.getParameterValues("flightId");
		session.setAttribute("person_id", 2);
		String[] prices = request.getParameterValues("price");
		String[] dojs = request.getParameterValues("dateOfJourney");
		if(flightIds!=null && flightIds.length>0) {
		for(String flightId : flightIds) {%>
			<input type="hidden" name="flightId" value="<%=flightId%>"/>
		<%} 
		for(String price : prices) {%>
			<input type="hidden" name="price" value="<%=price%>"/>
		<% } for(String doj : dojs) {%>
			<input type="hidden" name="dateOfJourney" value="<%=doj%>"/>
		<%}%>
		<h3>Enter Travellers Information</h3>
		<% int noOfPeople = (Integer)request.getAttribute("noOfPassengers");
		for(int i=0; i<noOfPeople; i++) { %>
		<table>
			<tr>
				<td colspan="2"><b>Traveller<%=i+1 %></b></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName"  pattern="[A-Za-z]{0,45}" value="" maxlength="45" required  title="Upper or lower case alphabets only"></input></td>
			</tr>
			<tr>
				<td>Middle Name</td>
				<td><input type="text" name="middleName"  pattern="[A-Za-z]{0,1}" value="" maxlength="1"  required  title="Initial Only"></input></td>
			</tr>			
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName"  pattern="[A-Za-z]{0,45}" value="" required  title="Upper or lower case alphabets only"></input></td>
			</tr>			
			<tr>
				<td>Identity Proof</td>
				<td>
				<select name="idType" class="idType" id="<%=i %>">
					<option value="passport">Passport</option>
					<option value="ssn">SSN</option>
				</select>
				</td>
			</tr>	
			<tr>
				<td>Identity Number</td>
				<td><input type="text" name="idNo" id="idNo<%=i %>" value="" pattern="\b[a-zA-Z0-9]{2}[0-9]{5,10}\b" required title="Please enter valid identity no."></input></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>
				<select name="gender">
					<option value="Female">Female</option>
					<option value="Male">Male</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>Date of Birth</td>
				<td>
					<input type="text" size="10" name="dob" value="" maxlength="10" pattern="[0-9]{4}-[0-1]{1}[0-9]{1}-[0-3]{1}[0-9]{1}" placeholder="2013-12-01" title="DOB in format YYYY-MM-DD"/>
				</td>
			</tr>		
		</table>
		<br/>
		<%} } else {
			System.out.println("request obj ma locha!");
		}%>
		<!-- input type="hidden" name="price" value="1000"/-->
		<input type="submit" value="Submit" name="submit"/>
	</form>
</body>
</html>