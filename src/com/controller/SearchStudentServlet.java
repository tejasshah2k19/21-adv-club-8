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

@WebServlet("/SearchStudentServlet")
public class SearchStudentServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String studentName = request.getParameter("studentName");
		StudentDao stdDao = new StudentDao();

		ResultSet rs = stdDao.getStudentByName(studentName);
		request.setAttribute("rs", rs);
		
		RequestDispatcher rd = request.getRequestDispatcher("ListAllStudents.jsp"); 
		
		rd.forward(request, response);
		
	}
}
