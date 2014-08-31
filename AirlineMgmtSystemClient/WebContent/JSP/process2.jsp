<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.sql.rowset.*" %>
<%@ page import="com.sun.rowset.*" %>

<HTML>
<HEAD><TITLE></TITLE>

</HEAD>


<%!
Connection conn;
Statement stmt2;
String flight_no;
String class_of_travel;
Calendar cd1;
Calendar cd2=Calendar.getInstance();
%>


<%
String adult=(String)session.getAttribute("adult");
int ad=Integer.parseInt(adult);
%>


<script language="javascript" type="text/javascript">


function checkform()
{

var myform=document.forms[0];

//var f_name=myform.firstname0.value;
//var l_name=myform.lastname0.value;

var o_phone_no1=myform.o_phone_no1.value;
var o_phone_no2=myform.o_phone_no2.value;
var o_phone_no3=myform.o_phone_no3.value;
var ccard_no=myform.credit_no.value;
if(f_name=="")
 {
  alert("Please enter a valid firstname");
  return false;
 }
else if(l_name=="")
 {
  alert("Please enter a valid lastname");
  return false;
 }
else if((o_phone_no1=="")||(o_phone_no2=="")||(o_phone_no3==""))
{
alert("Please enter a valid origin phone number");
return false;
}

else if(ccard_no=="")
{
alert("credit card field cannot be left blank");
return false;
}

else
{
 return true;
}
}


function luhn()
{
var myform1=document.forms[0];
var card_num=myform1.credit_no.value;
var cc_no=new Array(card_num.length);
var n=0,sum=0;
for(n=0;n<card_num.length;++n)
{
 cc_no[n]=parseInt(card_num.charAt(n));
}

for(n=cc_no.length-2;n>=0;n-=2)
{
cc_no[n]*=2;
if(cc_no[n]>9)
  cc_no[n]-=9;
}

for(n=0;n<cc_no.length;++n)
{
sum+=cc_no[n];
}

if(sum%10==0)
{
 return true;
}
else
{
alert("Credit card number is invalid");
return false;
}

}

</script>







<img src="http://localhost:8080/jsp-examples/project/top.gif">

<TABLE>
<TR>
<TD WIDTH="40%">
</TD>
<TD>
<img src="C:\programming\projects\project_crm\project\pay.gif" align=right>
</TD>
</TR>
</TABLE>
<BR><BR><BR>

<TABLE  bgcolor=#9E7BFF width=95%>
<TR>
<TH  colspan=12>Itinerary Details</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</TH>
</TR>
</TABLE>

<TABLE  width="90%">
<TR>
<TH align=center width="15%">Flight&nbsp;&nbsp;&nbsp;&nbsp;</TH>
<TH align=center width="15%">Date</TH>
<TH align=center width="15%">Departure</TH>
<TH align=center width="15%">Arrival</TH>
<TH align=center width="15%">Flight Duration</TH>
<TH align=center width="15%">Class Of Travel</TH>

</TR>


<%
try{
conn=(Connection)application.getAttribute("connection");
stmt2=conn.createStatement();
CachedRowSetImpl crs1=(CachedRowSetImpl)application.getAttribute("c_rowset");

String book_value=(String)request.getParameter("book");
char ch=book_value.charAt(2);
class_of_travel=book_value.substring(0,2);
if(ch=='0')
crs1.absolute(1);
else 
if(ch=='1')
crs1.absolute(2);
else 
if(ch=='3')
crs1.absolute(3);
%>



<TR>
<TD align=center>

<%=crs1.getString(1) %>

</TD>


<TD align=center>
<%
String st=crs1.getString(9);
String d_time=crs1.getString(10);
String a_time=crs1.getString(11);
cd1=Calendar.getInstance();
int i=Integer.parseInt(d_time.substring(11,13)); //hour
cd1.set(Calendar.HOUR,i);
cd2=Calendar.getInstance();
i=Integer.parseInt(a_time.substring(11,13));
cd2.set(Calendar.HOUR,i);
i=Integer.parseInt(d_time.substring(14,16)); //minutes
cd1.set(Calendar.MINUTE,i);
i=Integer.parseInt(a_time.substring(14,16));
cd2.set(Calendar.MINUTE,i);
long ms=cd2.getTimeInMillis()-cd1.getTimeInMillis();
int sec=(int)ms/1000;
int mins=sec/60;
int h=mins/60;int min=mins%60;
String q="Select Reserved_seats.Depart_date From Reserved_seats where Reserved_seats.F_id="+
"'"+st+"'";
ResultSet r=stmt2.executeQuery(q);
r.next();
%>
<%= r.getString(1) %>

</TD>



<TD align=center>

<%=crs1.getString(2) %>
</TD>

<TD align=center>
<%=crs1.getString(3) %>
</TD>


<TD align=center>
<%= " "+h+" h "+min+ " min"%>
</TD>

<TD align=center>
<%
if(class_of_travel.equals("ec"))
{
%>
<%= "Economy" %>
<%
}
else if(class_of_travel.equals("pr"))
{
%>
<%="Premiere" %>
<%
}
else if(class_of_travel.equals("sf"))
{
%>
<%="Special fares" %>
<%
}
else if(class_of_travel.equals("cr"))
{
%>
<%="Check Fares(Restricted)" %>
<%
}
else if(class_of_travel.equals("cf"))
{
%>
<%="Check Fares" %>
<%
}
%>
</TD>


</TR>
<%
}catch(SQLException e){out.print("SQLException caught");}
%>
</TABLE>



<BR><BR><BR><BR><BR>
<FORM name="pay" method="Post" action="http://localhost:8080/jsp-examples/jsp/CustInfoServlet" onsubmit="return luhn()">


Please complete the name and title of all the passengers for whom this booking is being made.Please ensure  that the name(s) entered here match the identification shown at the time of check-in.Kindly provide all the contact numbers as this will be used to contact you in case of any changes in flight timings.
<BR><BR>


<Table width=95% bgcolor=#9E7BFF>
<TR>
<TD>
<B>Passenger Details</B>
</TD>
</TR>
</Table>
<BR><BR>
<%
for(int k=0;k<ad;k++)
{
%>


<TABLE width=90%  cellspacing=10 cellpadding=3>

<TR>
<TH width=12% align=center>Title * </TH> 
<TH width=15%>First Name *&nbsp;&nbsp;&nbsp;&nbsp;</TH> 
<TH width=15%> Last Name *&nbsp;&nbsp;</TH>
<TH width=20% align=center>Meal </TH>
<TH width=20% align=center>Airline &nbsp;&nbsp;&nbsp;&nbsp;</TH>
</TR>

<TR>
<TD align=center>
<SELECT  name=<%="title"+k%>>
<option>Mr.
<option>Mrs.
<option>Ms.
<option>Dr.
<option>Prof.
</SELECT>
</TD>

<TD>
<input type=text name=<%="firstname"+k%>>
</TD>


<TD>
<input type=text name=<%="lastname"+k%>>
</TD>


<TD align=center>
<SELECT name=<%="meal"+k%>>
<option>No Preference
<option>Asian(veg)
<option>Bland Soft(Non Veg)
<option>Bland Soft(Veg)
<option>Diabetic(Veg)
<option>Diabetic(Non Veg)
</SELECT>
</TD>


<TD align=center>
<SELECT name=<%="airline"+k%>>
<option>Zeppelin Airways
<option>Quantas
<option>Brussels Airlines
<option>Gulf Air
</SELECT>
</TD>

</TR>

</TABLE>

<%
}
%>
<BR><BR>

<Table width=95% bgcolor=#9E7BFF>
<TR>
<TD>
<B>Contact Details</B>
</TD>
</TR>
</Table>

<TABLE cellspacing=10  cellpadding=0>

<TR>
<TD><B>Origin Phone no. * </B> &nbsp;&nbsp;&nbsp;
+<INPUT type=text name="o_phone_no1" size=2 maxlength=2>
<INPUT type=text name="o_phone_no2"  size=3 maxlength=3>
<INPUT type=text name="o_phone_no3"  size=10 maxlength=7>
</TD>
</TR>



<TR>
<TD><B>Mobile Phone no. *</B>&nbsp;&nbsp;&nbsp;
+<INPUT type=text name="mob_phone_no1" size=2 maxlength=2>
<INPUT type=text name="mob_phone_no2">
</TD>

<TD><INPUT type=checkbox name="sms" value="Yes">&nbsp;Please SMS  me my booking confirmation</TD>
</TR>


<TR>
<TD><B>Primary Email *</B></TD>
<TD><B>Secondary Email</B></TD>
</TR>

<TR>
<TD><INPUT type=text name="pri_email"></TD>
<TD><INPUT type=text name="sec_email"></TD>
</TR>
</TABLE>

<BR><BR><BR><BR>
<Table width=95% bgcolor=#9E7BFF>
<TR>
<TD>
<B>Payment Details</B>
</TD>
</TR>
</Table>
<BR><BR>

Please enter your credit card information below.Information you exchange with us online is treated securely and protected by using the internationally accepted and industry standard powerful encryption technology(128 bit secure socket layer,SSL).
<TABLE cellspacing=15 cellpadding=5>

<TR>
<TD><B>Credit Card Type *</TD>
<TD>Credit Card No. *</TD>
<TD>Expiry Date *</TD>
<TD>CVV no *</TD>
<TD>Name Of Issuing Bank *</TD>
</TR>

<TR>
<TD>
<Select name=cc_type>
<option>Visa
<option>Master Card
<option>American Express
<option>Diners Club
</Select>
</TD>

<TD><INPUT  type=text name="credit_no"></TD>

<TD>
<Select name="expiry_m">
<option>MM
<option>01
<option>02
<option>03
<option>04
<option>05

</Select>
<Select name="expiry_y">
<option>YY
<option>08
<option>09
</TD>

<TD>
<INPUT type=text size=3 maxlength=4  name="cvv">
</TD>

<TD>
<Select name="issuing bank">
<option>Vijaya Bank
<option>UTI Bank
<option>Kotak Mahindra
<option>HDFC
<option>ICICI Bank
</Select>
</TD>
</TR>

<TR>
<TD>FName  as on card *</TD>
<TD>Middle Name </TD>
<TD>LastName as on card *</TD>
</TR>

<TR>
<TD><INPUT type=text name="fname"></TD>
<TD><INPUT type=text name="mname"></TD>
<TD><INPUT type=text name="lname"></TD>
</TR>

</TABLE>

Address of Credit Card Holder

<BR><BR>

Address 1 *
<INPUT type=text name="add" size=50 >


<BR><BR>
Address 2 
<INPUT type=text name="add"  size=50 >

<BR><BR>
<TABLE cellpadding=5>
<TR>
<TD><B>Country*</B> </TD>
<TD><B>City* </B></TD>
</TR>

<TR>
<TD>
<Select name="country">
<option>India
<option>Indonesia
<option>Iran
<option>Iraq
</Select>
</TD>

<TD>
<INPUT  type=text name="city">
</TD>
</TR>

<TR>
<TD><B>Postal/Zip code *</B></TD>
<TD><B>State</B></TD>
</TR>

<TR>
<TD><INPUT type=text name="postal"></TD>
<TD><INPUT type=text name="state"></TD>
</TR>

<TR><TD colspan=2 >Email Address of credit card holder</TD></TR>
<TR><TD colspan=2 ><INPUT type=text name="emailid"  size=40></TD></TR>

<TR><TD colspan=2 >Credit Card Holder's Contact No. as recorded with the bank *</TD></TR>
<TR><TD  >+<INPUT type=text size=3>&nbsp;<INPUT type=text name=cch_cno></TD></TR>

<TR><TD><B>The Credit Card Holder is a part of this travel itinerary *</B></TD></TR>

<TR>
<TD>
<input type="radio" name="part_of">Yes
<input type="radio" name="part_of">No
</TD>
</TR>

<TR>
<TD>
<input type=submit value="pay_details" >
</TD>
</TR>
</TABLE>
<%
conn.close();
%>
</FORM>
</HTML>
