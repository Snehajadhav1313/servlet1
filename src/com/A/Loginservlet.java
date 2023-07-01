package com.A;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;

public class Loginservlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		   String username = req.getParameter("username");
		   String password = req.getParameter("password");
		   
		   int count=0;
		try {
			
			   Class.forName("com.mysql.jdbc.Driver");
				
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/empdatabase","root","root");
				
				PreparedStatement ps=con.prepareStatement("select count(*) student where username=? and password=?");
				
				ps.setString(1,username);
				ps.setString(2,password);
				
				ResultSet rs =ps.executeQuery();
				rs.next();
				count = rs.getInt(1);
			   
		} catch (Exception e) {
			System.out.println(e);
		}
		   if (count==1) {
			Cookie ck =new Cookie("username", username);
			res.addCookie(ck);
			RequestDispatcher rd= req.getRequestDispatcher("Home jsp");
			rd.include(req, res);
		} else {
			req.setAttribute("Error", "wrong cred..");
			RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
			rd.include(req, res);
		}

	}

}
