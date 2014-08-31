<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>

<html>
<head>
<title>
</title>
</head>

<body>
<img src="http://localhost:8080/jsp-examples/project/top.gif">

<%!

//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection conn;
Statement stmt;

%>

<Table width=80% align=center border>

<%
conn=(Connection)application.getAttribute("connection");
stmt=conn.createStatement();
String origin=request.getParameter("origin");
String destination=request.getParameter("destination");
ResultSet rs=stmt.executeQuery("Select Flight_details.Flight_no,Flight_details.Depart_from,Flight_details.Destination,"+
"Flight_details.Departure_time,Flight_details.Arrival_time From Flight_details "+
"where Flight_details.Depart_from="+"'"+origin+"'"+
" AND Flight_details.Destination="+"'"+destination+"'");

while(rs.next())
{
 
%>

<tr>
<td><%=rs.getString(1)%></td>
<td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5)%></td>
</tr>

<%
}
%>
</Table>

</body>

<%
rs.close();
stmt.close();
//conn.close();
%>
</html>