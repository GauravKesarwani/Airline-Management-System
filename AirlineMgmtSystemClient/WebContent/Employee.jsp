<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee</title>
<link href="assets/css/lib/bootstrap.min.css" rel="stylesheet">
<link href="assets/css/lib/bootstrap-responsive.min.css"
	rel="stylesheet">
<link href="assets/css/custom.css" rel="stylesheet">
</head>
<body>


<form class="form-horizontal" action="CreateNewEmployee.jsp" method="post">
<fieldset>
<div class="control-group">
<center>
<img alt="header" src="top.gif">
</center>
<legend>Dear Admin, Welcome to the portal</legend>
<legend>EMPLOYEE</legend>
</div>

<!-- Button -->
<div class="control-group">
  <label class="control-label" for="CreateButton"></label>
  <div class="controls">
    <button type="submit" id="CreateButton" name="CreateButton" class="btn btn-primary">Add New</button>
  </div>
</div>

</fieldset>
</form>

<form class="form-horizontal" action="ListEmployeeServlet" method="post">
<fieldset>

<!-- Button -->
<div class="control-group">
  <label class="control-label" for="ListButton"></label>
  <div class="controls">
    <button type="submit" id="ListButton" name="ListButton" class="btn btn-primary">List All</button>
  </div>
</div>

</fieldset>
</form>

<form class="form-horizontal" action="SearchEmployee.jsp" method="post">
<fieldset>

<!-- Button -->
<div class="control-group">  
  <label class="control-label" for="SearchButton"></label>
  <div class="controls">
    <button type="submit" id="SearchButton" name="SearchButton" class="btn btn-primary">Search</button>
  </div>
</div>

</fieldset>
</form>

<form class="form-horizontal" action="UpdateDeleteEmployee.jsp" method="post">
<fieldset>

<!-- Button -->
<div class="control-group">  
  <label class="control-label" for="DelButton"></label>
  <div class="controls">
    <button type="submit" id="DelButton" name="DelButton" class="btn btn-primary">Update/Delete</button>
  </div>
</div>

</fieldset>
</form>

<form class="form-horizontal" action="SearchAllCustomers" method="post">
<fieldset>

<!-- Form Name -->

<legend>CUSTOMER</legend>

<!-- Button -->
<div class="control-group">
  <label class="control-label" for="CustButton"></label>
  <div class="controls">
    <button type="List Customer" id="CustButton" name="CustButton" class="btn btn-primary">List Customer</button>
  </div>
</div>
</fieldset>
</form>


<!-- Form Name -->

<legend>FLIGHTS</legend>
<form class="form-horizontal" action="/AirlineMgmtSystemClient/servlets/listservlet" method="post">
<fieldset>
<!-- Button -->
<div class="control-group">
  <label class="control-label" for="FlightButton"></label>
  <div class="controls">
    <button type="List Flights" id="FlightButton" name="FlightButton" class="btn btn-primary">List & Update Flights</button>
  </div>
</div>
</fieldset>
</form>
<form class="form-horizontal" action="/AirlineMgmtSystemClient/JSP/FLIGHT_INFO.jsp" method="post">
<fieldset>
<!-- Button -->
<div class="control-group">
  <label class="control-label" for="FlightInfoButton"></label>
  <div class="controls">
    <button type="Flight Info" id="FlightInfoButton" name="FlightInfoButton" class="btn btn-primary">View Flight Reservations</button>
  </div>
</div>
</fieldset>
</form>
</body>
</html>