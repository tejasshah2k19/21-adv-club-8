package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.DbConnection;

public class StudentDao {

	public int insertStudent(String firstName, String email, String password) {
		int i = -1;
		try {

			Connection con = DbConnection.openConnection();

			// insert query

			// Statement , PreparedStatement* , CallableStatement
			PreparedStatement pstmt = con
					.prepareStatement("insert into student (firstName,email,password) values (?,?,?)");

			pstmt.setString(1, firstName);
			pstmt.setString(2, email);
			pstmt.setString(3, password);

			// execute

			i = pstmt.executeUpdate();// insert , delete , update

		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;

	}

	public ResultSet getAllStudents() {
		ResultSet rs = null;
		try {
			Connection con = DbConnection.openConnection();
			// insert query
			// Statement , PreparedStatement* , CallableStatement
			PreparedStatement pstmt = con.prepareStatement("select * from student");
			// execute
			rs = pstmt.executeQuery();// select

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

}
