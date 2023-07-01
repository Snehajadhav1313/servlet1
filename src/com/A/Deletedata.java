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

public class Deletedata  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  int id=Integer.parseInt(req.getParameter("id"));
	 
	    try {
		  
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/empdatabase","root","root");
			
			PreparedStatement ps=con.prepareStatement("delete from employee where id=?");
			ps.setInt(1, id);
		
			
			int result = ps.executeUpdate();
			
			if (result ==1) {
				req.setAttribute("succesmsg","employee added succefully..");
				
			}else {
				req.setAttribute("errmsg","errmsg...");
			}
		
	} catch (Exception e) {
		System.out.println(e);
	}
	  
	  RequestDispatcher rd= req.getRequestDispatcher("DeleteServlet.jsp");
	  rd.forward(req, res);
	}
}

