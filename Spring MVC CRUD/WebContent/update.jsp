<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Update Page</title>
</head>
<body>
<form action="reg">
<pre>
Student Id:      <input type="hidden" name="sid" value="${data.sid}">

Student Name:    <input type="text" name="sname" value="${data.sname}">

Student Address: <input type="text" name="addrs" value="${data.addrs}">

Student UserName:<input type="text" name="userName" value="${data.userName}">

Student Password:<input type="text" name="password" value="${data.password}">

Student Email:   <input type="text" name="email" value="${data.email}">

<input type="submit" value="UPDATE" style="background: lightblue">

</pre>
</form>
</body>
</html>