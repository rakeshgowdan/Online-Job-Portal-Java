<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.sql.*"%>
<!DOCTYPE>
<HTML><HEAD>
<h3>Company Information Page : 
</h3>

<TITLE>Company Register</TITLE>
<link rel="shortcut icon" href="http://www.iconarchive.com/download/i47277/avosoft/warm-toolbar/user.ico">
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META name=GENERATOR content="MSHTML 9.00.8080.16413"></HEAD>
<BODY >
<form NAME="CREATEACCTFORM" action="RegisterCompany"  METHOD="POST" >
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
	<table width="100%" border="0" cellpadding="7" cellspacing="0" class="bg_white">
	  <tr>
		  <td colspan="2" align="right" valign="top" class="border_green_btm bg_grey" style="padding:0px 10px 0px 0px;"><span class="txt_orange">*</span> Required fields</td>
		</tr>
<tr>
				<td width="400" align="right" bgcolor="#736AFF">Required Information</td>
			</tr>
<tr>
				<td align="right" valign="top"><span class="txt_orange">*</span>Company Name:</td>
				<td valign="top"  ><input maxlength="255" size="30" name="username"   onFocus="hintEvent('UNAME');"  onblur="hintEvent('UNAME', 'HIDE');" type="text" value="">
					<div id="UNAME" style="width:250px; margin-left:205px; margin-top:-20px; _margin-left:20px; _margin-top:0px; position:absolute;"></div>
					<div id="ERR_UNAME" style="padding: 2px; width: 400px; display: none;" class="txt_red small_1"></div>
				</td>
			  </tr>
			  <tr>
				<td align="right" valign="top"><span class="txt_orange">*</span> Choose a password: </td>
				<td valign="top"  >
				<input maxlength="32" size="30"  name="passwd" type="password" value="">
				<div id="PASS" style="width:250px; margin-left:205px; margin-top:-20px; _margin-left:20px; _margin-top:0px; position:absolute;"></div>
				<div id="ERR_PASS" style="padding: 2px; width: 400px; display: none;" class="txt_red small_1"></div>
				</td>
			</tr>
			  <tr>
				<td align="right" valign="top"><span class="txt_orange">*</span> Re-enter password: </td>
				<td valign="top"  >
				<input name="passwd_temp"   size="30" maxlength="32" type="password"  value="">
				<div id="PASS_TEMP" style="width:250px; margin-left:205px; margin-top:-20px; _margin-left:20px; _margin-top:0px; position:absolute;"></div>
				<div id="ERR_PASS_TEMP" style="padding: 2px; width: 400px; display: none;" class="txt_red small_1"></div>
				</td>
			</tr>
			<tr>
				<td align="right" valign="top"><span class="txt_orange">* </span>
				Web address: </td>
				<td  >
				<table cellspacing="0" cellpadding="0" border="0" id="currentloc_border">
				<tr><td>
				<input type="text" name="web" value="">
				</table>
					 </td>
			</tr>
			<tr>
				<td align="right" valign="top"><span class="txt_orange">* </span>
				Email address: </td>
				<td  >
				<table cellspacing="0" cellpadding="0" border="0" id="currentloc_border">
				<tr><td>
				<input type="text" name="mail" value="">
				</table>
				</td>
			    </tr>
	<table width="350" border="0" cellpadding="0" cellspacing="0">
				<tr><td valign="bottom" class="bg_grey" >&nbsp;</td>
                <td height="40" valign="bottom" ><span class="button"><span>
				<input type="submit" name="submit1"  value="Submit"></span></span>
				<button type="reset" value="Reset">Reset</button>
				</td>
</table>
</table>
</form>
</table>
</form>
</body>
</html>