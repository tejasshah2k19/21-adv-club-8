package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;

@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productName = request.getParameter("productName");
		float price = Float.parseFloat(request.getParameter("price"));
		int qty = Integer.parseInt(request.getParameter("qty"));

		
		ProductBean productBean = new ProductBean();
		productBean.setProductName(productName);
		productBean.setPrice(price);
		productBean.setQty(qty);
		
		
		
		ProductDao productDao = new ProductDao();
		productDao.addProduct(productBean);
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("index.html");
		rd.forward(request, response);
		
	}
}
