package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public static void main(String[] args) {
		DbConnection.openConnection();
	}
	public static void openConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/21advclub";
		String userName = "root";
		String password = "root";
		Connection con = null;
		try {
			Class.forName(driver);//load driver 
			con = DriverManager.getConnection(url,userName,password);
		} catch (Exception e) {
			System.out.println("EX => "+ e.getMessage());
		}
		if(con == null) {
			System.out.println("db not connected");
		}else {
			System.out.println("db connected");
		}
	}
}
