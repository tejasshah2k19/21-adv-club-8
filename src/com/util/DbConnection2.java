package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection2 {

	// logic
	// load dirver
	// open connection using dirver manager

	public static Connection openConnection() {

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/21advclub";
		String username = "root";
		String password = "root";
		Connection con = null;
		try {
			Class.forName(driver);// load
			con = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
