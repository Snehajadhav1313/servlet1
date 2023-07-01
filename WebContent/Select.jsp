<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.box {
	border: 2px solid black;
	height: 40%;
	width: 250px;
	background: #dcdcdc;
	margin-left: 10px;
	margin-right: 20px;
	padding: 20px;
}

.label {
	margin: 50px;
	text-align: center;
}
</style>
</head>
<body>
	<h1 style="color: Red;">${succesmsg}</h1>
	<h1 style="color: Red;">${errmsg}</h1>

	<h1>SelectServlet data</h1>

	<form action="select" method="get">

		<label>Id:</label></br> 
		<input type="text" name="id" ></br>
		</br> <input type="submit" value="Select"></br>
		</br>
		</form>


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

			
				<tr>

					<td>${id}</td>
					<td>${fname}</td>
					<td>${lname}</td>
					<td>${phN}</td>
					<td>${gender}</td>
					<td>${pincode}</td>
					<td>${add}</td>
					<td>${pass}</td>
					<td>${usname}</td>
				</tr>
		
		</table>


</body>
</html>