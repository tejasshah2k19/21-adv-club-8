package com.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDao;

@WebServlet("/EditProductServlet")
public class EditProductServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int productId = Integer.parseInt(request.getParameter("productId"));

		ProductDao productDao = new ProductDao();
		ResultSet rs = productDao.getProductById(productId);
		request.setAttribute("rs", rs);
		
		RequestDispatcher rd = request.getRequestDispatcher("EditProduct.jsp");
		rd.forward(request, response);
	}
}
