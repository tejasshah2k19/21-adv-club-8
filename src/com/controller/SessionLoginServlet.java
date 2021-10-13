package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionLoginServlet")
public class SessionLoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// email - password -- check -- valid
		String email = request.getParameter("email");
		HttpSession session = request.getSession();// access session
		// add some data into session
		session.setAttribute("email",email);
		RequestDispatcher rd = request.getRequestDispatcher("SessionHome.jsp");
		rd.forward(request, response);
		

	}
}
