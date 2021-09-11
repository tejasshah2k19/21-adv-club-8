package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// mysql
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/21advjava";
		String userName = "root";
		String password1 = "root";
		int i = -1;
		try {
			// load driver
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, userName, password1);

			// insert query

			// Statement , PreparedStatement* , CallableStatement
			PreparedStatement pstmt = con
					.prepareStatement("insert into student (firstName,email,password) values (?,?,?)");

			pstmt.setString(1, firstName);
			pstmt.setString(2, email);
			pstmt.setString(3, password);

			// execute

			i = pstmt.executeUpdate();// insert , delete , update

		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = null;
		if (i == 1) {
			rd = request.getRequestDispatcher("Success.jsp");
		} else {
			rd = request.getRequestDispatcher("Fail.jsp");
		}

		rd.forward(request, response);
	}
}
