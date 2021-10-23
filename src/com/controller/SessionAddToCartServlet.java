package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionAddToCartServlet")
public class SessionAddToCartServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int productId = Integer.parseInt(request.getParameter("productId"));
		HttpSession session = request.getSession();
		session.setAttribute("productId", productId);

//		if (productId == 1) {
//			// iphone
//		} else if (productId == 2) {
//			// legion y540
//		} else if (productId == 3) {
//			// lg oven
//		}
		response.sendRedirect("SessionHome.jsp");
	}
}
