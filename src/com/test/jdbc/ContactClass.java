package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ContactClass {
	Connection connection = null; 
	public Connection getConnectionDetails()  {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://LocalHost:3306/test_jdbc","root","Root");
							}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return connection;
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection = DriverManager.getConnection("jdbc:mysql://LocalHost:3306/test_jdbc","root","Root");
//		return connection;
	}
}
