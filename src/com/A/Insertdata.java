package com.A;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Insertdata  extends HttpServlet{


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id= Integer(req.getParameter("id"));
	  String  fname=req.getParameter("fname");
	  String  lname=req.getParameter("lname");
	  String  phN=req.getParameter("phN");
	  String  gender=req.getParameter("gender");
	  String  pincode=req.getParameter("pincode");
	  String  add=req.getParameter("add");
	  String  usname=req.getParameter("usname");
	  String  pass=req.getParameter("pass");
	  
	  try {
		  
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/empdatabase","root","root");
			
			PreparedStatement ps=con.prepareStatement("insert into employee(`id`,`fname`,`lname`,`phN`,`usname`,`gender`,`pincode`,`add`,`pass`) values(?,?,?,?,?,?,?,?,?)");
	        ps.setInt(1, id);
			ps.setString(2, fname);
			ps.setString(3, lname);
			ps.setString(4, phN);
			ps.setString(5, gender);
			ps.setString(6, pincode);
			ps.setString(7, add);
			ps.setString(8, usname);
			ps.setString(9, pass);
			
			int result = ps.executeUpdate();
			
			EmployeeData e = new EmployeeData(id, fname, lname, phN, gender, pincode, add, pass, usname);
			req.setAttribute("empData", e);

			
			if (result ==1) {
				req.setAttribute("succesmsg","employee added succefully..");
				
			}else {
				req.setAttribute("errmsg","errmsg...");
			}
		
	} catch (Exception e) {
		System.out.println(e);
	}
	  
	  RequestDispatcher rd= req.getRequestDispatcher("index.jsp");
	  rd.forward(req, res);
	}

	private int Integer(String parameter) {
		// TODO Auto-generated method stub
		return 0;
	}
}
