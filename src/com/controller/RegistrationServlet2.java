package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet2 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("*****RegistrationServlet2***** ");
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String hobby[] = request.getParameterValues("hobby");

		// we can store our data in request scope

		request.setAttribute("firstName", firstName);
		request.setAttribute("email", email);
		request.setAttribute("password", password);

		RequestDispatcher rd = request.getRequestDispatcher("PrintInfo.jsp");
		rd.forward(request, response);//
	}
}
