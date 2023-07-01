package com.A;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class empData extends HttpServlet {
   

@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	String user =null;
	
	Cookie[] cks = req.getCookies();
	if (cks != null) {
	for (Cookie ck : cks) {
		
		String key = ck.getName();
		if (key.equals("userName")) {
			user = ck.getValue();
			
		}
		
	}
		
	}
	
	if (user == null) {
		req.setAttribute("Error", "Login Frist");
		RequestDispatcher rd= req.getRequestDispatcher("Login.jsp");
		rd.include(req, res);
		
	}else {
		PrintWriter pw = res.getWriter();
		pw.write("<h1>welcome  "+user+"</h1>");
		pw.write("<a href='Logout'>Logout</a>");
	}
}
}
