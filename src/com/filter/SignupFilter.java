package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SignupFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Signup Filter Called.....");
		// validation --- input -- empty
		//

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("pswd");

		boolean isError = false;

		if (firstName == null || firstName.trim().length() == 0) {
			request.setAttribute("firstNameError", "Please Enter FirstName");
			isError = true;
		}

		if (email == null || email.trim().length() == 0) {
			request.setAttribute("emailError", "Please Enter Email");
			isError = true;
		}

		if (password == null || password.trim().length() == 0) {
			request.setAttribute("passwordError", "Please Enter Password");
			isError = true;
		}

		if (isError) {
			// back
			RequestDispatcher rd = request.getRequestDispatcher("FilterSignup.jsp");
			rd.forward(request, response);
		} else {

			chain.doFilter(request, response); // forward ---> servlet
		}
	}

	@Override
	public void destroy() {

	}
}
