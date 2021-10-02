package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.ProductBean;
import com.util.DbConnection2;

public class ProductDao {

	public void deleteProduct(int productId) {

		try (Connection con = DbConnection2.openConnection();
				PreparedStatement pstmt = con.prepareStatement("delete from products  where productId =  ? ");) {

			pstmt.setInt(1, productId);

			int i = pstmt.executeUpdate();
			if (i == 1) {
				System.out.println("product removed");
			} else {
				System.out.println("product deletion failed...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void addProduct(ProductBean productBean) {

		try (Connection con = DbConnection2.openConnection();
				PreparedStatement pstmt = con
						.prepareStatement("insert into products (name,price,qty) values (?,?,?)");) {

			pstmt.setString(1, productBean.getProductName());
			pstmt.setFloat(2, productBean.getPrice());
			pstmt.setInt(3, productBean.getQty());

			int i = pstmt.executeUpdate();
			if (i == 1) {
				System.out.println("product added");
			} else {
				System.out.println("product addition failed...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateProduct(String productName, float price, int qty, int productId) {

		try (Connection con = DbConnection2.openConnection();
				PreparedStatement pstmt = con
						.prepareStatement("update products set name = ? , price = ? ,qty = ? where productId = ? ");) {

			pstmt.setString(1, productName);
			pstmt.setFloat(2, price);
			pstmt.setInt(3, qty);
			pstmt.setInt(4, productId);
			int i = pstmt.executeUpdate();
			if (i == 1) {
				System.out.println("product update");
			} else {
				System.out.println("product updation failed...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<ProductBean> getAllProducts() {
		try {
			Connection con = DbConnection2.openConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from products");
			ResultSet rs = pstmt.executeQuery(); // memory --- db

			ArrayList<ProductBean> products = new ArrayList<>();

			while (rs.next()) {
				
				String productName = rs.getString("name");
				float price = rs.getFloat("price");
				int qty = rs.getInt("qty");
				
				ProductBean productBean = new ProductBean();
				
				productBean.setProductId(rs.getInt("productId"));
				productBean.setProductName(productName);
				productBean.setPrice(price);
				productBean.setQty(qty);
				
				products.add(productBean);
				
			}
			rs.close();
			return products;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public ResultSet getProductById(int productId) {
		try {
			Connection con = DbConnection2.openConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from products where productId  = ?");
			pstmt.setInt(1, productId);
			ResultSet rs = pstmt.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
