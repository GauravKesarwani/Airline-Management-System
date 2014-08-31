<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment</title>

<script type="text/javascript" src="js/jQuery.js"></script>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<link rel="stylesheet" href="JSP/css/redmond/jquery-ui-1.8.16.custom.css">
<script type="text/javascript" src="js/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.12.custom.min.js"></script>





<script type="text/javascript">

$(function(){
	$("#expirationdate").datepicker({});	
});


function myFunction()
{
	/* var value;
	alert(value);
	alert(event.target.name);
	
	
	 var btn=event.target.name;
	if(btn=="cancel")
		{
		  alert("let return true");
		  value=true;
		  alert(value);
		  return true;
		} 
	 else if(btn=="buy")
	{ */
	 	// alert("inside");
       var val=document.getElementsByName("credit")[0].value;
       var isnum = /^\d+$/.test(val);
       if(isnum) {
		     //alert(test);
		     if(val.length!=16){
		    	 alert("lenght doesnot match");
		    	 return false;
		     }
		     else if(val.length==16)
		    	 {
		    	     return true;
		    	 }
		     return false;
		}
		else {
			alert("Invalid");
		return false;
		}
	//}
	 
		 
}

</script>
<link rel="stylesheet" type="text/css" href="JSP/css/bootstrap.css">


 

</head>
<body>
<div>
	<center>
	<img alt="header" src="top.gif">
	</center>
</div>
<div style="position: relative;margin-top: 60px;">
<center>
   <label>Please provide your credit card information and click on buy to purchase ticket</label>
   </center>
</div>
<div >
<label></label>
</div>
<div style="position:relative; margin-top:40px;margin-left:290px; width:50%;" align="center">
<form class="well span6" style="height: 200px;" action="/AirlineMgmtSystemClient/Purchase" method="post" onsubmit="return myFunction();">
<center>
<table align="center">
<tr>
<td>
<label>Credit Card No</label>
</td>
<td>
</td>
<td>
<input type="text" class="span6" name="credit" >
</td>
</tr>
<tr>
<td>
<label>Card Expiration Date</label>
</td>
<td>
</td>
<td>
<input type="text" class="span6" name="expirationdate" id="expirationdate">
</td>
</tr>
<tr></tr>
<tr>
<td></td>

<td colspan="2">
<br><input type="submit" name="buy" value="Purchase" id="purchase" onclick="myFunction();" class="btn btn-primary">
</td>
<!-- <td><br><button class="btn btn-primary" name="cancel" id="cancel" value="cancel" onclick="myFunction(event);">Cancel</button></td> --> 
</tr>

</table>
  </center>
</form>
</div>
<div style="position:relative;margin-left: 250px; " >
 <form action="/AirlineMgmtSystemClient/Purchase" method="post">
 
 <br><button class="btn btn-primary" name="cancel" id="cancel" value="cancel" >Cancel</button>
 </form>
</div>
</body>
</html>