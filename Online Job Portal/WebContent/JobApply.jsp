<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<HTML>
<HEAD>
<h2>Job Apply </h2><br>
<TITLE>Job Apply</TITLE>
<link rel="shortcut icon" href="http://www.iconarchive.com/download/i47277/avosoft/warm-toolbar/user.ico">
</HEAD>
<BODY>
<a href="">Display Jobs</a>
<table>
    <c:forEach items='${Jobs}' var="j">

            <tr>
         <td><c:out value='${j.Location}' /></td> 
            <td><c:out value='${j.Farea}' /></td>
             <td><c:out value='${j.Jpost}' /></td>
              <td><c:out value='${j.Vacancy}' /></td>
               <td><c:out value='${j.salary}' /></td>
                <td><c:out value='${j.Idate}' /></td>
                 <td><c:out value='${j.Itime}' /></td>
                   <td><c:out value='${j.Iplace}' /></td>
                     <td><c:out value='${j.skills}' /></td>
             
        </tr>
    </c:forEach>
    </table>


</body>
</html>