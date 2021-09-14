package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;

@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		
		StudentDao studentDao  = new StudentDao();
		int i = studentDao.insertStudent(firstName, email, password)  ;
		
		RequestDispatcher rd = null;
		if (i == 1) {
			rd = request.getRequestDispatcher("Success.jsp");
		} else {
			rd = request.getRequestDispatcher("Fail.jsp");
		}

		rd.forward(request, response);
	}
}
