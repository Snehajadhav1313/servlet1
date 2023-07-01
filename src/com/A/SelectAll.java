package com.A;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectAll extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdatabase", "root", "root");

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("SELECT * from employee");

			ArrayList<EmployeeData> userList = new ArrayList<>();

			while (rs.next()) {
	           int  id = rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String gender = rs.getString(4);
				String phN = rs.getString(5);
				String pincode = rs.getString(6);
				String add = rs.getString(7);
				String pass = rs.getString(8);
				String usname = rs.getString(9);

				EmployeeData e = new EmployeeData(id, fname, lname, phN, gender, pincode, add, pass, usname);
				
				userList.add(e);

			}
			req.setAttribute("userList", userList);

			RequestDispatcher rd = req.getRequestDispatcher("SelectAll.jsp");
			rd.forward(req, res);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
