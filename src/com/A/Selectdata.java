package com.A;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;

public class Selectdata extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdatabase", "root", "root");

			PreparedStatement ps = con.prepareStatement("select * from employee where id=?");
    
			ps.setInt(1, id);
			
			ResultSet rd = ps.executeQuery();
			
			rd.next();
			
			req.setAttribute("id",rd.getInt(1));
			req.setAttribute("fname",rd.getString(2));
			req.setAttribute("lname",rd.getString(3));
			req.setAttribute("phN",rd.getString(4));
			req.setAttribute("gender",rd.getString(5));
			req.setAttribute("pincode",rd.getString(6));
			req.setAttribute("add",rd.getString(7));
			req.setAttribute("usname",rd.getString(8));
			req.setAttribute("pass",rd.getString(9));
			RequestDispatcher rde = req.getRequestDispatcher("Select.jsp");
			rde.forward(req, res);
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		
	}

}
