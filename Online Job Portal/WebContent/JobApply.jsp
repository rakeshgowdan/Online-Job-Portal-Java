<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.niit.JobBean.Job"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<HTML>
<HEAD>
<TITLE>Job Apply</TITLE>
<link rel="shortcut icon"
	href="http://www.iconarchive.com/download/i47277/avosoft/warm-toolbar/user.ico">
	
<style >
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
}</style>
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
    td = tr[i].getElementsByTagName("td")[8];
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

function select(){
}
</script>
</HEAD>
<BODY>
<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for Skills..">
	<table border="1" width="500" align="center" id="myTable">
		<tr class="header">
			<th style="width:60%;" ><b>Location</b></th>
			<th style="width:60%;"><b>Functional Area</b></th>
			<th style="width:60%;"><b>JobPost</b></th>
			<th style="width:60%;"><b>Company</b></th>
			<th style="width:60%;"><b>Salary</b></th>
			<th style="width:60%;"><b>Interview data</b></th>
			<th style="width:60%;"><b>Interview time</b></th>
			<th style="width:60%;"><b>Interview place</b></th>
			<th style="width:60%;"><b>Skills</b></th>
			<th style="width:60%;"><b>Company-Mail</b></th>
			<th style="width:60%;"><b>Apply</b></th>
		</tr>
		<%
			List<Job> J = (List<Job>) request.getAttribute("JobList");
		if(J!=null){
			for (Job j : J) {
		%>
		<tr>
			<td><%=j.getLocation()%></td>
			<td><%=j.getFarea()%></td>
			<td><%=j.getJpost()%></td>
			<td><%=j.getVacancy()%></td>
			<td><%=j.getSalary()%></td>
			<td><%=j.getIdate()%></td>
			<td><%=j.getItime()%></td>
			<td><%=j.getIplace()%></td>
			<td><%=j.getSkills()%></td>
			<td><%=j.getCompany()%></td>
			<td><form action="AppliedJob" method="post"><a href="AppliedJob?id=<%=j.getJpost()%>&comp=<%=j.getCompany()%>">YES</a></form>
			
		</tr>
		<%}}%>
	</table>
</body>
</html>