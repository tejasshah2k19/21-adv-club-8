package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionCartQtyServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int productId = Integer.parseInt(request.getParameter("productId"));

		HttpSession session = request.getSession();
	
		ArrayList<Integer> cart = (ArrayList<Integer>) session.getAttribute("cart");
		// 1 1 2 3 1 3  2
		int index = cart.indexOf(productId); 
		cart.remove(index);
		
		response.sendRedirect("SessionViewMyCart.jsp");
		//
	}

}
