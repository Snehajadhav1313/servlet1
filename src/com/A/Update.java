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

public class Update extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String phN = req.getParameter("phN");
		String gender = req.getParameter("gender");
		String pincode = req.getParameter("pincode");
		String add = req.getParameter("add");
		String usname = req.getParameter("usname");
		String pass = req.getParameter("pass");

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdatabase", "root", "root");

			PreparedStatement ps = con.prepareStatement(
					"update  employee set fname=?,lname=?,phN=?,username=?,gender=?,pincode=?,add=?,password=? where id = ?");

			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, phN);
			ps.setString(4, gender);
			ps.setString(5, pincode);
			ps.setString(6, add);
			ps.setString(7, usname);
			ps.setString(8, pass);
			ps.setInt(9, id);
			int result = ps.executeUpdate();

			if (result == 1) {
				req.setAttribute("succesmsg", "employee added succefully..");

			} else {
				req.setAttribute("Errmsg", "errmsg...");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		RequestDispatcher rd = req.getRequestDispatcher("Update.jsp");
		rd.forward(req, res);
	}
}
