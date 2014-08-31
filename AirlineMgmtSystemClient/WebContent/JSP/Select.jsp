<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.sql.rowset.*" %>
<%@ page import="com.sun.rowset.*" %>

<HTML>
<HEAD>
<TITLE>Booking</TITLE>
<style>
P:first-letter {font size: 150%;}
</style>

</HEAD>

<%!
String f_no[]=new String[6];
String d_f[]=new String[6];
%>



<FORM  name="F1" method="Get" action="http:\\localhost:8080\jsp-examples\process2.jsp">


<TABLE bgcolor=#9E7BFF background="C:\projects\project_crm\project\strip.gif" >
<TR>
<TH>Departing Flight</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
</TR>
</TABLE>
<BR><BR><BR>



<TABLE width="90%">
<TR>
<TD  WIDTH="50%" ><H5 style="font-family>:Arial;font-size:12pt" >Welcome To Penguin Airlines Online Booking Facility</H5>
<P style="text-indent:3em">
To continue  your booking, select your preferred flight(s) / fare by clicking
 the radio button next to the  selection available,scroll to the bottom of this page and click Continue.
</TD>
<TD align=right>
<img src="C:\programming\projects\project_crm\project\fly1.gif">
</TD>
</TR>
</TABLE>
<BR><BR><BR>


<TABLE cellspacing=10 width="90%" background="C:\projects\project_crm\project\Picture1.gif">
<TR>
<TH width="12%">Flight</TH>
<TH width="12%">Depart From</TH>
<TH width="12%">Arrive At</TH>
<TH width="12%">Special Fares</TH>
<TH width="12%">Check Fares(restricted)</TH>
<TH width="12%">Check Fares</TH>
<TH width="12%">Economy</TH>
<TH width="12%">Premiere</TH>
</TR>
</TABLE>


<TABLE  cellspacing=10 width="90%" background="C:\programming\projects\project_crm\project\Picture1.gif">

<%
CachedRowSetImpl crs=(CachedRowSetImpl)application.getAttribute("c_rowset");
if(!crs.isBeforeFirst())
{
crs.beforeFirst();
}
for(int i=0;crs.next();i++)
{
%>
<TR>



<TD width="12%" align=center><%=crs.getString(1)%></TD>
<TD width="12%" align=center><%=crs.getString(2)%></TD>
<TD width="12%" align=center><%=crs.getString(3)%></TD>

<TD width="12%" align=center>
<%
if(!(crs.getString(4).equals("N/A")||crs.getString(4).equals("Sold Out")))
{
if(i==0)
{
%>
 <input type=radio name=book value="sf0">

<%
}
if(i==1)
{
%>
<input type=radio name=book value="sf1">
<%
}
}
%>
<%=crs.getString(4)%>
</TD>

<TD width="12%" align=center>
<%
if(!(crs.getString(5).equals("N/A")||crs.getString(5).equals("Sold Out")))
{
if(i==0)
{
%>
 <input type=radio name=book value="cr0">

<%
}
if(i==1)
{
%>
 <input type=radio name=book value="cr1">
<%
}
}
%>

<%=crs.getString(5)%>
</TD>


<TD width="12%" align=center>
<%
if(!(crs.getString(6).equals("N/A")||crs.getString(6).equals("Sold Out")))
{
if(i==0)
{
%>
 <input type=radio name=book value="cf0">

<%
}
if(i==1)
{
%>
<input type=radio name=book value="cf1">
<%
}
}
%>

<%=crs.getString(6)%>

</TD>

<TD width="12%" align=center>
<%
if(!(crs.getString(7).equals("N/A")||crs.getString(7).equals("Sold Out")))
{
if(i==0)
{
%>
 <input type=radio name=book value="ec0">

<%
}
if(i==1)
{
%>
<input type=radio name=book value="ec1">
<%
}
}
%>


<%=crs.getString(7)%></TD>
<TD width="12%" align=center>
<%
if(!(crs.getString(8).equals("N/A")||crs.getString(8).equals("Sold Out")))
{
if(i==0)
{
%>
 <input type=radio name=book value="pr0">

<%
}
if(i==1)
{
%>
<input type=radio name=book value="pr1">
<%
}
}
%>






<%=crs.getString(8)%>


</TD>




</TR>

<%
}
%>
</TABLE>

<BR><BR>

<TABLE width="90%">
<TR>
<TD WIDTH="90%" align="right"></TD>
<TD><INPUT type=submit  name=conti  value="continue" >
</TD>
</TR>
</TABLE>
</FORM>
</HTML>