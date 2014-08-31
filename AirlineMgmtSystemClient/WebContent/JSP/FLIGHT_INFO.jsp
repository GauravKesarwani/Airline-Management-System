<HTML>
<HEAD>
<TITLE>
</TITLE>
<link rel="stylesheet" type="text/css" href="flight_info.css" />


</HEAD>



<BODY>
<center>
<IMG SRC="top.gif">

<Form id="form1"  name="searchflight" method="Post" action="/AirlineMgmtSystemClient/servlets/FlightInfo">
<BR><BR>

<TABLE id="table1">
<TR>
<TH colspan=2>FLIGHT INFORMATION</TH>
</TR>
<TR><TD>
<BR>
</TD></TR>
<TR>
<TD colspan=2><B>The Timings Below are indicative only.For exact timings please contact Penguin airways call center </TD>
</TR>
<TR>
<TD><BR></TD>
</TR>

<TR ALIGN=left>
<TD>
<INPUT TYPE=radio name="search"  value="search_by_fno" onclick="focus1()">
By Flight Number
</TD>
</TR>

<TR>
<TD><BR><BR></TD>
</TR>

<TR>
<TD colspan=2>
Flight Number&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<INPUT TYPE=text id="flightid" name="flightid">



<INPUT TYPE=submit name=flight_information value="Get Flight Info">
</TD>
</TR>

<TR>
<TD><BR></TD>
</TR>


</TABLE>

</Form>
</center>
</BODY>

</HTML>