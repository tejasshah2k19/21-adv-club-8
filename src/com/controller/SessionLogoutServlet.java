package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionLogoutServlet")
public class SessionLogoutServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		//session destroy 
		
		HttpSession session = request.getSession(); 
		session.invalidate();// server --> session --> destroy 
		
		//
	    response.sendRedirect("SessionLogin.jsp");		
	
	
	}
}
