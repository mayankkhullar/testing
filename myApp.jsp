<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@page import="java.util.*" %>
<%@page import="java.io.*" %>
<%@page import = "java.sql.*" %>
<%@page import ="foo.*" %>
<%@page import="javax.servlet.http.*,javax.servlet.*"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import = "foo.employess"%>


<html>
<body>
<b>SQL result</b>
<table>

<c:forEach items = "${lISt}" var = "item">
<tr>
<td><c:out value="${item.firstname}"/></td>
<td><c:out value="${item.lastname}"/></td>
<td><c:out value = "${item.id }"/></td>
</c:forEach>
</table>
</body>
</html>
