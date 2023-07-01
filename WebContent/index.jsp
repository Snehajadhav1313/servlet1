<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
   .box{
      border: 2px solid #000000;
      height: 100px;
      width: 100%;
     
   }
   ul{   list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
   }
   
 li{
    border: 1px solid  #800000	;
     float: left;
     margin: 20px;}
     li a:hover {
  background-color: #00FA9A		;
}

li a {
  display: block;
  padding: 8px;
  background-color: #dddddd;
}
 }  
   </style>
</head>
<body>
<div class="box">
<ul>

      <li><a href="Registerservlet.jsp">Insertdata</a></li>
      
       <li ><a href="DeleteServlet.jsp">Deletedata</a></li>

      <li><a href="Update.jsp">Update</a></li>

      <li><a href="selectall">SelectAll</a></li>
     
      <li><a href="Select.jsp">Selectdata</a></li>
      
            <li><a href="login.jsp">Login</a></li>
      
      </ul>
</div>

</body>
</html>