package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		String choice = request.getParameter("choice");// add sub mul
		int ans = 0;
		if (choice.equals("add")) {
			ans = n1 + n2;
		} else if (choice.equals("sub")) {
			ans = n1 - n2;
		} else if (choice.equals("mul")) {
			ans = n1 * n2;
		}

		

		response.setContentType("text/html");
		
		
		PrintWriter out = response.getWriter();
		
		
		out.print("<html><body>");
		out.print("ans = "+ans);
		out.print("</body></html>");
		
		
		
		
		
		
		
		
		
		
		
	}
}
