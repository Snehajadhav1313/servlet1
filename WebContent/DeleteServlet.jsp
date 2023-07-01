<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
     
     .box{
        border: 2px solid #000000	;
        height: 200px;
        width: 300px;
        display: block;
         background-image: linear-gradient(pink ,#ffff,pink ,#fff);
         text-align: center;
         margin: 40px;
         margin-left: 300px;
     }
</style>
</head>
<body>

 <div class="box">
  <h1>Deleteservlet Form</h1>
  
  
<form action="Delete"  >

      <label>Id:</label></br>
         <input type="text" name="id" placeholder="enter id here" ></br></br>
      
            <input type="submit" value="Delete"  ></br></br>
</form>
</div>

</body>
</html>