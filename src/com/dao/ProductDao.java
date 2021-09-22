package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.util.DbConnection2;

public class ProductDao {

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
}
