package com.hexaware.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	
	/*
	 * Method to connect with DB
	 */
	static public Connection conn = null;
	//static public PreparedStatement pstmt = null;
	public static Connection getDBConnection() {
		try {
			//step 1:
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2:
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexawarepget2022", 
	                "root", 
	                "root");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
