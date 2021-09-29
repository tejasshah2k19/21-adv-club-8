package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

	public void addProduct(String productName, float price, int qty) {

		try (Connection con = DbConnection2.openConnection();
				PreparedStatement pstmt = con
						.prepareStatement("insert into products (name,price,qty) values (?,?,?)");) {

			pstmt.setString(1, productName);
			pstmt.setFloat(2, price);
			pstmt.setInt(3, qty);

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
	public void updateProduct(String productName, float price, int qty,int productId) {

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
	public ResultSet getAllProducts() {
		try {
			Connection con = DbConnection2.openConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from products");
			ResultSet rs = pstmt.executeQuery();
			return rs;
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
