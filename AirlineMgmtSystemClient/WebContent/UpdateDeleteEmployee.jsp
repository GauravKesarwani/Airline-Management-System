<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update/Delete Employee</title>
<link href="assets/css/lib/bootstrap.min.css" rel="stylesheet">
<link href="assets/css/lib/bootstrap-responsive.min.css"
	rel="stylesheet">
<link href="assets/css/custom.css" rel="stylesheet">
</head>
<body>
<form class="form-horizontal" action="UpdDelEmployeeServlet" method="post">
<fieldset>
<div class="control-group">
<center>
<img alt="header" src="top.gif">
</center>
<legend>EMPLOYEE</legend>
</div>


<!-- Text input-->
<div class="control-group">
  <label>Enter the Employee ID of the Employee you wish to delete or update</label>
  <br/>
  <label class="control-label" for="EmployeeId">Employee ID</label>
  <div class="controls">
    <input id="EmployeeId" name="EmployeeId" placeholder="" class="input-xlarge" required="" type="text">
    
  </div>
</div>

<!-- Button -->
<div class="control-group">
  <label class="control-label" for="DeleteButton"></label>
  <div class="controls">
  <button type="submit" id="UpdateButton" name="UpdateButton" class="btn btn-success">Update</button>
    <button type="submit" id="DeleteButton" name="DeleteButton" class="btn btn-danger">Delete</button>    
  </div>
</div>



</fieldset>
</form>

<form class="form-horizontal" action="Employee.jsp" method="post">
<fieldset>
<!-- Button -->
<div class="control-group">
  <label class="control-label" for="goButton"></label>
  <div class="controls">
    <button type="submit" id="goButton" name="goButton" class="btn btn-primary">Go Back</button>
  </div>
</div>

</fieldset>
</form>

</body>
</html>