package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDB {
	public static void main(String[] args) throws SQLException {
		try {
			//1. Add the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Make the connection(url,hostname,dataBase name,userName, password);
			Connection con=DriverManager.getConnection("jdbc:mysql://LocalHost:3306/test_jdbc","root","Root");
			
			//3. sql query
			String sql = "insert into userInfo(firstName,city,salary) values('Ram','Pune','1000'),"
					+ "('Nilesh','Latur','2000'),('Sukanya','Parali','5000')";
			
			//4. By statement
			Statement stmt = con.createStatement();
			stmt.execute(sql);
			
			System.out.println("Record is inserted successfully");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
