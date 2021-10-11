package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EmailValidatorFilter implements Filter {

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String email = request.getParameter("email");
		boolean isError = false; 
		
		if(email.contains("@") && email.contains(".")) {
			chain.doFilter(request, response);//go ahead 
		}else {
			request.setAttribute("emailError", "Invalid Email");
			RequestDispatcher rd = request.getRequestDispatcher("FilterSignup.jsp");
			rd.forward(request, response);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}
}
