package com.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;

@WebServlet("/ViewStudentServlet")
public class ViewStudentServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int studentId = Integer.parseInt(request.getParameter("studentId"));
		
		StudentDao studentDao = new StudentDao();
		
		ResultSet rs = studentDao.getStudentById(studentId);
		request.setAttribute("rs", rs);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("ViewStudent.jsp");
		rd.forward(request, response);
		

	}
}
