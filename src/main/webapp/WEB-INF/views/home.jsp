<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  Retrieved DataBase Table is : </P>
<table border = "1">
<tr>
<c:forEach var="item" items="${list}">

<td><c:out value="${item.id}"></c:out>
</td>

<td><c:out value="${item.firstname}"></c:out>
</td>

<td><c:out value="${item.lastname}"></c:out>
</td>

</c:forEach>
</tr>
</table>
</body>
</html>
