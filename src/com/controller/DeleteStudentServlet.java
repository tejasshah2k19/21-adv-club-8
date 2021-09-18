package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;

@WebServlet("/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int studentId = Integer.parseInt(request.getParameter("studentId"));

		StudentDao stdDao = new StudentDao();
		stdDao.deleteStudent(studentId);

		RequestDispatcher rd = request.getRequestDispatcher("ListStudentsServlet");
		rd.forward(request, response);

	}
}
