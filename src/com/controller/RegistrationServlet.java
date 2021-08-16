package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String hobby[] = request.getParameterValues("hobby");
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("FirstName : "+firstName);
		out.print("<br>Email : "+email);
		out.print("<br>Password : "+password);
		out.print("<br>Gender : "+gender);
		out.print("<br>City : "+city);
		out.print("<br>Hobby: ");
		for(int i=0;i<hobby.length;i++) {
			out.print(hobby[i]+" ");
		}
		
		out.print("</body></html>");
		
		
		
		
		
	}
}
