package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class AThread extends Thread {
	public void run() {

	}
}
//HttpServlet --- lib 

//servlet-api.jar 
public class SignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("i am inside signup servlet.....");
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("pswd");

		System.out.println(firstName);
		System.out.println(email);
		System.out.println(password);
	}

}
