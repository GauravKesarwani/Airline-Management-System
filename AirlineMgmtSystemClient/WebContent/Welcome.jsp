<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To Reservation Module</title>
</head>
<body>
	<%//HttpSession session = request.getSession(true);
	session.setAttribute("customerId",1);
	session.setAttribute("noOfPeople", 4);%>
	<label><a href="myServlet">Manage My Reservations</a></label>
	<label><a href="Reservation.jsp">Reserve a flight</a></label>
</body>
</html>