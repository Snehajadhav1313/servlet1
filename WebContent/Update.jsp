<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
         .box{
               border: 2px solid black;
                height: 40%;
              width: 250px;
                background: #B0E0E6	; 
                margin-left: 10px;
                margin-right: 20px;
                padding:20px;
    }
   label{
      text-align: center;
    }

</style>
</head>
<body>

<h1 style="color: Red;">${succesmsg}</h1>
<h1 style="color: Red;">${Errmsg}</h1>

 <div class="box">
  <h1>Updata Form</h1>
  
  
<form action=update method="post" >
      <label>Id</label></br>
      <input type="text"name="id"></br>

      <label>Firstname:</label></br>
         <input type="text" name="fname" placeholder="enter Firstname here" ></br>
      <label>Lastname:</label></br>
          <input type="text" name="lname" placeholder="enter lastname here" ></br>
      <label>Phone:</label></br>
          <input type="number" name="phN"></br>
      <label>Address:</label></br>
          <input type="text" name="add"  ></br>
      <label>UserName:</label></br>  
          <input type="text" name="usname"  placeholder="enter username here" ></br>
      <label>Gender:</label></br>
              <input type="radio" value="male"  name="gender" >Male</br>
              <input type="radio" value="female"  name="gender" >Female</br>
      <label>Pincode:</label></br>  
          <input type="text" name="pincode"  placeholder="enter pincode here" maxlength="6" ></br>
      <label>Password:</label></br>
            <input type="password" name="pass"  placeholder="enter password here" ></br>
        <label>Re-Password:</label> </br>
             <input type="password" name="rpass"  placeholder="enter password here" ></br>
    
            <input type="submit" value="Updata"  >
</form>
</div>


</body>
</html>