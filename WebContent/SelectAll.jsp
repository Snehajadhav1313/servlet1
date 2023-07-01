<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<h1>SelectServlet data</h1>
	<table border="1px solid ">
		<tr>
			<th>id</th>
			<th>fname</th>
			<th>lname</th>
			<th>phN</th>
			<th>gender</th>
			<th>pincode</th>
			<th>add</th>
			<th>pass</th>
			<th>usname</th>
		</tr>

		<c:forEach var="user" items="${userList}">
			<tr>
				<td>${user.id}</td>
				<td>${user.fname}</td>
				<td>${user.lname}</td>
				<td>${user.phN}</td>
				<td>${user.gender}</td>
				<td>${user.pincode}</td>
				<td>${user.add}</td>
				<td>${user.pass}</td>
				<td>${user.usname}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>