package com.controller;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CubeServlet")
public class CubeServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String n1 = request.getParameter("n1");

		boolean isError = false;

		if (n1 == null || n1.trim().length() == 0) {
			isError = true;
			request.setAttribute("n1Error", "Please Enter No1");
		} else {

			try {
				int x = Integer.parseInt(n1);// royal --
				request.setAttribute("ans", x * x * x);
			} catch (Exception e) {
				isError = true;
				request.setAttribute("n1Error", "Please Enter Valid Number");
			}
		}

		RequestDispatcher rd = request.getRequestDispatcher("InputN1.jsp");
		rd.forward(request, response);

	}
}
