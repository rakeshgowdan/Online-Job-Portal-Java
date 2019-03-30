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
</HEAD>
<BODY>
	<table border="1" width="500" align="center">
		<tr>
			<th><b>Location</b></th>
			<th><b>Functional Area</b></th>
			<th><b>JobPost</b></th>
			<th><b>vacancy</b></th>
			<th><b>Salary</b></th>
			<th><b>Interview data</b></th>
			<th><b>Interview time</b></th>
			<th><b>Interview place</b></th>
			<th><b>Skills</b></th>
			<th><b>Apply</b></th>
		</tr>
		<%
			List<Job> J = (List<Job>) request.getAttribute("JobList");
		System.out.println(J);
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
		</tr>
		<%}}%>
	</table>
</body>
</html>