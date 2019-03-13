<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company Login</title>
<link rel="shortcut icon" href="http://www.iconarchive.com/download/i47277/avosoft/warm-toolbar/user.ico">
<script type="text/javascript" language="javascript">
function chk_onclick()
{
	var myform=document.pform;
	if(myform.username.value=="" || myform.passwd.value=="")
	{
		alert("PLEASE COMPLETE ALL THE SPECIFICATION");
		if(myform.username.value=="")
		{
			myform.username.focus();
		}
		else
		{
			myform.passwd.focus();
		}
	}
}
	  </script>
</head>
<body>
<font face="verdana,arial" size=-1>
<center><table cellpadding=2 cellspacing=0 border=0 height=500 width=600>

<tr><td >EMPLOYER'S LOGIN
<table cellpadding=0 cellspacing=0 border=0 width=100%><tr>

<td  align=center style="padding:2;padding-bottom:4">

Enter your login and password
<tr><td bgcolor="white" style="padding:5"><br>

<form method="post" action="CompanyLogin" name=pform >

<center><table>
<tr><td><font face="verdana,arial" size=-1>Email:</td><td>
<input type="text" name="mail"></td></tr>
<tr><td><font face="verdana,arial" size=-1>PASSWORD:</td><td>
<input type="password" name="passwd"></td></tr>
<tr><td><font face="verdana,arial" size=-1>&nbsp;
</td><td><font face="verdana,arial" size=-1>
<input type="submit" value="SUBMIT" name=chkform onclick="chk_onclick()"></td></tr>
<tr><td colspan=2><font face="verdana,arial" size=-1>&nbsp;</td></tr>

<tr><td colspan=2><font face="verdana,arial" size=-1>Not member yet? <a href="registerCompany.jsp">Click here</a> to register.</td></tr>
<td align="right" valign="bottom"><img src="1.gif"   width="5" height="5" ></td>
</table></center>
</form>

</td></tr></table></td></tr></table>


</body>
</html>