<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
     .fbox{
      display: flex;
      justify-content:center;
      align-items:center;
      margin-top:100px; 
     }
     input{
     margin: 12px;
     padding: 9px;}
</style>
</head>
<body>

<div class="fbox">

<h1 style="color:red">${error}</h1>

  <form action="login" method="post">

      <label>Username:</label></br>
         <input type="text" name="user" placeholder="enter username here" ></br>
      <label>password:</label></br>
          <input type="text" name="password" placeholder="enter password here" ></br>
           <input type="submit" value="login"  >
      
   </form>
</div>
</body>
</html>