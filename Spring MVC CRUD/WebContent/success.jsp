<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.tech.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function deletedata() {
	alert("Do you want to delete data?")
	document.myform.action="delete";
	document.myform.submit();
	
}

function updatedata() {
	alert("Do you want to update data?")
	document.myform.action="edit";
	document.myform.submit();
	
}

</script>

<meta charset="ISO-8859-1">
<title>Student Success Page</title>
</head>
<body>
<form name="myform">

<table border="3" style="background: lightblue">
<tr bgcolor="pink">
<td>Select</td>
<td>Sid</td>
<td>Sname</td>
<td>Address</td>
<td>Email</td>
<td>UserName</td>
<td>Password</td>
</tr>

<tr>
<c:forEach items="${data}" var="stu">
<td><input type="radio" name="rd" value="${stu.sid}"></td>
<td><c:out value="${stu.sid}"></c:out></td>
<td><c:out value="${stu.sname}"></c:out></td>
<td><c:out value="${stu.addrs}"></c:out></td>
<td><c:out value="${stu.email}"></c:out></td>
<td><c:out value="${stu.userName}"></c:out></td>
<td><c:out value="${stu.password}"></c:out></td>


</tr>
</c:forEach>
</table>
<tr>
<td><input type="button" value="Delete" style="background: red" onclick="deletedata()"></td>
<td><input type="button" value="UPDATE" style="background: lightblue"  onclick="updatedata()"></td>

</tr>
</form>
</body>
</html>