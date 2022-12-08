package com.test.jdbc;

import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestUser {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		try {
			//1. Add driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. build connection
			Connection con = DriverManager.getConnection("jdbc:mysql://LocalHost: 3306/test_jdbc","root","Root");
			
			//3. Sql query
//			String sql = "insert into userInfo(firstName,city,salary) values('Nayan','Latur','5000')";
			
			//4.statement
//			Statement stmt = con.createStatement();
//			stmt.execute(sql);
			
			PreparedStatement pps = con.prepareStatement("insert into userInfo"
					+ "(firstName,city,salary) values(?,?,?)");
			System.out.print("Name :- ");
			String name = sc.next();
			System.out.print("City :- ");
			String city = sc.next();
			System.out.print("Salary :- ");
			String salary = sc.next();
			
			pps.setString(1, name);
			pps.setString(2, city);
			pps.setString(3, salary);
			
			int i= pps.executeUpdate();
			System.out.println("Record is inserted "+i);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
