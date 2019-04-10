<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.niit.JobBean.TotalApplication"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<HTML>
<HEAD>
<TITLE>Job Apply</TITLE>
<link rel="shortcut icon"
	href="http://www.iconarchive.com/download/i47277/avosoft/warm-toolbar/user.ico">
	
<style >

a.two:link {color:#ff0000;}
a.two:visited {color:#0000ff;}
a.two:hover {font-size:150%;}

#myInput {
  background-image: url('/css/searchicon.png'); /* Add a search icon to input */
  background-position: 10px 12px; /* Position the search icon */
  background-repeat: no-repeat; /* Do not repeat the icon image */
  width: 100%; /* Full-width */
  font-size: 16px; /* Increase font-size */
  padding: 12px 20px 12px 40px; /* Add some padding */
  border: 1px solid #ddd; /* Add a grey border */
  margin-bottom: 12px; /* Add some space below the input */
}

#myTable {
  border-collapse: collapse; /* Collapse borders */
  width: 100%; /* Full-width */
  border: 1px solid #ddd; /* Add a grey border */
  font-size: 18px; /* Increase font-size */
}

#myTable th, #myTable td {
  text-align: left; /* Left-align text */
  padding: 12px; /* Add padding */
}

#myTable tr {
  /* Add a bottom border to all table rows */
  border-bottom: 1px solid #ddd; 
}

#myTable tr.header, #myTable tr:hover {
  /* Add a grey background color to the table header and on hover */
  background-color: #f1f1f1;
}input[type=button], input[type=submit], input[type=reset] {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}




</style>
<script >
function myFunction() {
  // Declare variables 
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");

  // Loop through all table rows, and hide those who don't match the search query
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[5];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    } 
  }
}

</script>
</HEAD>
<BODY>

<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for Skills..">
	<table border="1" width="500" align="center" id="myTable">
		<tr class="header">
			<th style="width:60%;" ><b>Company</b></th>
			<th style="width:60%;"><b>JobPost</b></th>
			<th style="width:60%;"><b>E-MAil</b></th>
			<th style="width:60%;"><b>Full Name</b></th>
			<th style="width:60%;"><b>Mobile Num</b></th>
			<th style="width:60%;"><b>Skills</b></th>
			<th style="width:60%;"><b>Applied</b></th>
			<th style="width:60%;"><b>Approved</b></th>
				<th style="width:60%;"><b>Resume</b></th>
			<th hidden style="width:60%;"><b>JobId</b></th>
			<th style="width:60%;"><b>Approve Applicant</b></th>
		</tr>
		<%
			List<TotalApplication> J = (List<TotalApplication>) request.getAttribute("TotalJobs");
		if(J!=null){
			for (TotalApplication j : J) {
		%>
		<tr>
			<td><%=j.getCompanyName()%></td>
			<td><%=j.getJobPost()%></td>
			<td><%=j.getEmail()%></td>
			<td><%=j.getFullName()%></td>
			<td><%=j.getMobileNo()%></td>
			<td><%=j.getSkills()%></td>
			<td><%=j.getApplied()%></td>
			<td><%=j.getApproved()%></td>
			<td><form action="DownloadResume" method="post"><a  href="DownloadResume?id=<%=j.getEmail()%>">Download</a></form></td>
			<td hidden ><input type="text" name="jobid" value=<%=j.getId()%> readonly></td>
			<td><form action="UpdateApplications" method="post"><a class="two" href="UpdateApplications?id=<%=j.getJobPost()%>&comp=<%=j.getCompanyName()%>">YES</a></form></td>
		</tr>
		<%}}%>
	</table>
<!--  	<div style="text-align:center;"><input type="Submit" value="APPROVE"></div>-->	</form>

</body>
</html>