package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCookieServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// fetch userName from request
		String userName = request.getParameter("userName");// admin

		Cookie cookie = new Cookie("userName", userName); // create

		cookie.setMaxAge(60 * 60 * 24);
		response.addCookie(cookie);// browser ->cookie-> set

		response.sendRedirect("AddCookie.jsp");

	}

}
