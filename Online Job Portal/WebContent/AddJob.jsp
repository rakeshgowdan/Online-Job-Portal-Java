<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE>
<HTML>
<HEAD>
<FONT SIZE="4" COLOR="blue" FACE="roman">JOB POSTS </FONT>
<br>
<FONT SIZE="4" COLOR="blue" FACE="roman">WELCOME <%=session.getAttribute("email")%></FONT>
<TITLE>Company HOME PAGE</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META name=GENERATOR content="MSHTML 9.00.8080.16413">
</HEAD>
<script type="text/javascript">
	window.history.forward();
	function noBack();
	{
		window.history.forward();
	}
</script>
<BODY>
	<form  action="AddJob" METHOD="POST">
		<table>
			<table>
				<tr>
					<td width="400" align="right" bgcolor="">Add Jobs</td>
				</tr>
				<tr><table></table></tr>
				<tr>
					<td align="right" valign="top">Location:</td>
					<td valign="top"><select name="loc" style="width: 165"><option>
								- Select -</option>
							<option>DELHI</option>
							<option>BANGLORE</option>
							<option>CHENNAI</option>
							<option>GURGAON</option>
							<option>HYDERABAD</option>
							<option>MUMBAI</option>
							<option>KOLKATA</option>
							<option>PUNE</option>
							<option>NOIDA</option>
							<option>KANPUR</option></select> <br>
				</tr>
				<tr>
					<td align="right" valign="top"><span class="txt_orange"></span>FunctionalArea:</td>
					<td valign="top">
						<div id="UNAME" style="width: 250px; margin-left: 205px; margin-top: -20px; _margin-left: 20px; _margin-top: 0px; position: absolute;"></div>
						<div id="ERR_UNAME" style="padding: 2px; width: 400px; display: none;"class="txt_red small_1"></div>
					</td>
				</tr>
				<tr>
					<select name="area" style="width: 165" id="industry"><option>- Select -</option>
						<option>Any</option>
						<option>Automotive</option>
						<option>Banking</option>
						<option>BioTechnology</option>
						<option>Chemicals</option>
						<option>Construction</option>
						<option>Consumer Goods</option>
						<option>Education</option>
						<option>Entertainment</option>
						<option>Insurance</option>
						<option>BPO</option>
						<option>Hardware</option>
						<option>Software</option></select>
					<br>
					<td align="right" valign="top"><span class="txt_orange"></span>
						Job Post:</td>
					<select name="key" style="width: 165"><option>-
							Select -</option>
						<option>Sales Executive</option>
						<option>Teacher</option>
						<option>Manager</option>
						<option>Accounting</option>
						<option>Technician</option>
						<option>Software Professional</option>
						<option>Software Tester</option>
						<option>IT Professional</option></select><br>
					<td align="right" valign="top"><span class="txt_orange"></span>Vacancy:</td>
					<input type="text" name="vac" value=""><br>
					<td align="right" valign="top"><span class="txt_orange"></span>Skills Required</td>
					<input type="text" name="skill" value=""><br>
					<td align="right" valign="top"><span class="txt_orange"></span>Salary :</td>
					<input type="text" name="sal" value=""><bR>
					<td align="right" valign="top"><span class="txt_orange"></span>Interview Date:</td>
					<input type="text" name="ivdt" value=""><bR>
					<td align="right" valign="top"><span class="txt_orange"></span>Interview Time:</td>
					<input type="text" name="ivt" value=""><bR>
					<td align="right" valign="top"><span class="txt_orange"></span>Interview Place:</td>
					<input type="text" name="ivp" value=""><bR>
					<td valign="top"><br> <input maxlength="255" size="30" name="userName" type="submit" value="ADD">
						<button type="reset" value="Reset">Reset</button>
						<div id="UNAME" style="width: 250px; margin-left: 205px; margin-top: -20px; _margin-left: 20px; _margin-top: 0px; position: absolute;"></div>
						<div id="ERR_UNAME" style="padding: 2px; width: 400px; display: none;"class="txt_red small_1"></div></td>
				</tr>
			</table>
		</table>
	</form>
</body>
</html>