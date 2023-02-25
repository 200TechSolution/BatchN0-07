<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.tech.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Success Page</title>
</head>
<body>
<form action="">

<table border="3" style="background: lightblue">
<tr bgcolor="pink">
<td>Sid</td>
<td>Sname</td>
<td>Address</td>
<td>Email</td>
<td>UserName</td>
<td>Password</td>
</tr>

<tr>
<c:forEach items="${data}" var="stu">
<td><c:out value="${stu.sid}"></c:out></td>
<td><c:out value="${stu.sname}"></c:out></td>
<td><c:out value="${stu.addrs}"></c:out></td>
<td><c:out value="${stu.email}"></c:out></td>
<td><c:out value="${stu.userName}"></c:out></td>
<td><c:out value="${stu.password}"></c:out></td>


</tr>
</c:forEach>
</table>

</form>
</body>
</html>