package com.tka.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IPLUtility {
	
	private static final String path="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/java_advance_batch433_db";
	private static final String username="root";
	private static final String password="Dhiraj192695";
		
	public static Connection getConnection() {
		
		try {
			Class.forName(path);
			return DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void closeConnection(ResultSet rs, PreparedStatement pst, Connection conn) {

	    try {
	        if(rs != null) rs.close();
	        if(pst != null) pst.close();
	        if(conn != null) conn.close();
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}
}
