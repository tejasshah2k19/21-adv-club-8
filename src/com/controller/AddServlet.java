package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String x = request.getParameter("n1");// "50"
		String y = request.getParameter("n2");// "20"

		int n1 = Integer.parseInt(x);// "50" => 50
		int n2 = Integer.parseInt(y);// "20" => 20
		// wrapper

		int ans = n1 + n2;

		System.out.println(ans);// console....

		//
		response.setContentType("text/html");// MIME -> html , pdf, excel, audio,......

		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.print("Addition = " + ans);
		out.print("</body></html>");

	}
}
