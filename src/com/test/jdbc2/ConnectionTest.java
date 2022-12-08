package com.test.jdbc2;


import java.sql.Connection;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Program for insert the multiple student data using JDBC into   database.
public class ConnectionTest {
	Connection connection = null;

	public Connection getConnectionDetails() throws ClassNotFoundException, SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://LocalHost: 3306/mumbai","root","Root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
		
		
	}
	
	
}
