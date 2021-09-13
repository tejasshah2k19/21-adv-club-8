package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListStudentsServlet")
public class ListStudentsServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/21advjava";
		String userName = "root";
		String password1 = "root";

		try {
			// load driver
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, userName, password1);

			// insert query

			// Statement , PreparedStatement* , CallableStatement
			PreparedStatement pstmt = con.prepareStatement("select * from student");

			// execute

			ResultSet rs = pstmt.executeQuery();// select
			request.setAttribute("rs", rs);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("ListAllStudents.jsp");
		rd.forward(request, response);

	}
}
