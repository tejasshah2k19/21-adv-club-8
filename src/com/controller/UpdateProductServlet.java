package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDao;

@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productName = request.getParameter("productName");
		float price = Float.parseFloat(request.getParameter("price"));
		int qty = Integer.parseInt(request.getParameter("qty"));
		int productId = Integer.parseInt(request.getParameter("productId"));
		ProductDao productDao = new ProductDao();
		productDao.updateProduct(productName,price,qty,productId);
		
		response.sendRedirect("ListProductServlet"); //
	}	

}
