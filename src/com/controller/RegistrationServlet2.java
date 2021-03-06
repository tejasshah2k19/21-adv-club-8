package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

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
		
		boolean isError = false;
		String firstNamePattern = "^[a-zA-Z]+$";
		Pattern pFn = Pattern.compile(firstNamePattern);
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		} 
		else if(pFn.matcher(firstName).matches()== false ) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter Only Alphabets in FirstName");
			request.setAttribute("firstNameValue", firstName);
		}
		else {
			request.setAttribute("firstNameValue", firstName);
		}

		String emailPattern = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$";
		Pattern p = Pattern.compile(emailPattern);
		
		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		} else if (p.matcher(email).matches() == false) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Valid Email");
			request.setAttribute("emailValue", email);

		} else {
			request.setAttribute("emailValue", email);
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter Password");
		} else {
			request.setAttribute("passwordValue", password);
		}

		if (city == null || city.equals("-1")) {
			isError = true;
			request.setAttribute("cityError", "Please Select City");
		} else {
			request.setAttribute("cityValue", city);
		}

		if (hobby == null || hobby.length <= 1) {
			isError = true;
			request.setAttribute("hobbyError", "Please Select atleast two hobby");
		} else {
			String hb = "";
			for (int i = 0; i < hobby.length; i++) {
				hb = hb + hobby[i];
			}
			request.setAttribute("hobbyValue", hb);
		}

		RequestDispatcher rd = null;

		if (isError == true) {
			rd = request.getRequestDispatcher("Signup.jsp");
		} else {
			rd = request.getRequestDispatcher("PrintInfo.jsp");

			request.setAttribute("firstName", firstName);
			request.setAttribute("email", email);
			request.setAttribute("password", password);
		}
		rd.forward(request, response);
	}
}
