<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Employee</title>
<link href="assets/css/lib/bootstrap.min.css" rel="stylesheet">
<link href="assets/css/lib/bootstrap-responsive.min.css"
	rel="stylesheet">
<link href="assets/css/custom.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.10.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
$('.IDType').change(function(){
//svar id = $(this).attr('id');
alert('In Script');
var idNoId = "IDNumber";
//alert($(this).val()+"-"+id+" : "+idNoId);
if($(this).val()=="SSN") {
	$('#IDNumber').attr('pattern','[0-9]{3}-[0-9]{2}-[0-9]{4}');
	$('#IDNumber').attr('title','Please enter in the format XXX-XX-XXXX');
} else {
	$('#IDNumber').attr('pattern','[a-zA-Z0-9]{2}[0-9]{5,10}');
	$('#IDNumber').attr('title','Please enter in format X01234567');
}
var patt = $('#IDNumber').attr('pattern');
alert(patt);
});
});
</script>

</head>
<body>
<form class="form-horizontal" action="CreateNewEmployeeServlet" method="post">
<fieldset>

<div class="control-group">
<center>
<img alt="header" src="top.gif">
</center>
<legend>EMPLOYEE</legend>
</div>


<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="FirstName">First Name</label>
  <div class="controls">
    <input id="FirstName" name="FirstName" pattern="[A-Za-z]{0,45}" placeholder="" maxlength="45" class="input-xlarge" required="" type="text" title="Upper or lower case alphabets only">
    
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="LastName">Last Name</label>
  <div class="controls">
    <input id="LastName" name="LastName" pattern="[A-Za-z]{0,45}" maxlength="45" placeholder="" class="input-xlarge" required="" type="text" title="Upper or lower case alphabets only">
    
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="MiddleName">Middle Initial</label>
  <div class="controls">
    <input id="MiddleName" name="MiddleName" pattern="[A-Za-z]{0,1}" maxlength="1" placeholder="" class="input-xlarge" type="text">
    
  </div>
</div>

<div class="control-group">
  <label class="control-label" for="DOB">Date Of Birth</label>
  <div class="controls">
    <input id="DOB" name="DOB" maxlength="12" pattern="[a-zA-Z]{3} [0-9]{1,2}, [0-9]{4}" placeholder="Jan 01, 2013" class="input-xlarge" type="text" title="DOB in format MMM DD,YYYY">
    
  </div>
</div>

<!-- Textarea -->
<div class="control-group">
  <label class="control-label" for="Address">Address</label>
  <div class="controls">                     
    <textarea id="Address" name="Address"></textarea>
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="City">City</label>
  <div class="controls">
    <input id="City" name="City" placeholder="" class="input-xlarge" required="" type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="State">State</label>
  <div class="controls">
    <input id="State" name="State" placeholder="" class="input-xlarge" required="" type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="Zip">Zip Code</label>
  <div class="controls">
    <input id="Zip" name="Zip" pattern="[0-9]{5}" placeholder="" class="input-xlarge" required="" type="text" title="5 digit valid zip code">
    
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="contactNum">Contact #</label>
  <div class="controls">
    <input id="contactNum" name="contactNum" pattern="[0-9]{10}" placeholder="" class="input-xlarge" type="text" title="A 10 digit US Contact number">
    
  </div>
</div>

<!-- Multiple Radios -->
<div class="control-group">
  <label class="control-label" for="radios">Gender</label>
  <div class="controls">
    <label class="radio" for="radios-0">
      <input name="radios" id="radios-0" value="Male" checked="checked" type="radio">
      Male
    </label>
    <label class="radio" for="radios-1">
      <input name="radios" id="radios-1" value="Female" type="radio">
      Female
    </label>
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="userName">User Name</label>
  <div class="controls">
    <input id="userName" name="userName" pattern=".{5,}" placeholder="" class="input-xlarge" type="text" title="Minimum 5 character long">
   
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="password">Password</label>
  <div class="controls">
    <input id="password" name="password" pattern=".{5,}" class="input-xlarge" required="" type="password" title="Minimum 5 character long">
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="emailID">Email ID</label>
  <div class="controls">
    <input id="emailID" name="emailID" pattern="[a-zA-Z0-9]{1,20}@[a-zA-Z0-9]{1,20}.[a-zA-Z0-9]{1,10}" class="input-xlarge" required="" type="email">
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="EmployeeId">Employee ID</label>
  <div class="controls">
    <input id="EmployeeId" name="EmployeeId" pattern="[0-9]{3}-[0-9]{2}-[0-9]{4}" placeholder="XXX-XX-XXXX" class="input-xlarge" required="" type="text" title="SSN format Employee ID">
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="workDescription">Work Description</label>
  <div class="controls">
    <input id="workDescription" name="workDescription" placeholder="" class="input-xlarge" type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="Position">Position</label>
  <div class="controls">
    <input id="Position" name="Position" placeholder="" class="input-xlarge" type="text">
   
  </div>
</div>

<!-- Multiple Radios -->
<div class="control-group">
  <label class="control-label" for="IDType">ID Type</label>
  <div class="controls">
    <label class="radio" for="IDType-0">
      <input name="IDType" id="IDType-0" class="IDType" value="SSN" checked="checked" required="required" type="radio">
      SSN
    </label>
    <label class="radio" for="IDType-1">
      <input name="IDType" id="IDType-1" class="IDType" value="Passport" required="required" type="radio">
      Passport
    </label>
  </div>
</div>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="IDNumber">ID number</label>
  <div class="controls">
    <input id="IDNumber" name="IDNumber" pattern="[0-9]{3}-[0-9]{2}-[0-9]{4}" placeholder="SSN or Passport" class="input-xlarge" required="" type="text">
  </div>
</div>

<!-- Button -->
<div class="control-group">
  <label class="control-label" for="CreateButton"></label>
  <div class="controls">
    <button type="submit" id="CreateButton" name="CreateButton" class="btn btn-primary">Add</button>
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