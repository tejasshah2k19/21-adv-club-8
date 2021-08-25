package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateSalaryServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String basicSalary = request.getParameter("basicSalary");

		boolean isError = false;
		if (userName == null || userName.trim().length() == 0) {
			isError = true;
			request.setAttribute("userNameError", "Please Enter UserName");
		}
		if (basicSalary == null || basicSalary.trim().length() == 0) {
			isError = true;
			request.setAttribute("basicSalaryError", "Please Enter basic salary");
		}

		RequestDispatcher rd = null;
		if (isError == true) {
			rd = request.getRequestDispatcher("InputEmployeeDetail.jsp");
		} else {

			int bs = Integer.parseInt(basicSalary);
			int bonus = (int) (bs * 0.10);
			int pf = (int) (bs * 0.12);
			int totalSalary = bs + bonus - pf;
			rd = request.getRequestDispatcher("EmployeeSalary.jsp");
			request.setAttribute("userName", userName);
			request.setAttribute("bs",bs);
			request.setAttribute("bonus", bonus);
			request.setAttribute("pf", pf);
			request.setAttribute("ts", totalSalary);
			
			
		}
		rd.forward(request, response);

	}

}
