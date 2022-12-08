package com.test.jdbc2;

import java.sql.Connection;  
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInput {
	public void getUserInput(String name, String city, String salary) {
		
		try {
			ConnectionTest test = new ConnectionTest();
			Connection con = test.getConnectionDetails();
			PreparedStatement pps = con.prepareStatement("insert into programmer(programmer_name, programmer_city, programmer_salary) values(?,?,?)");
			pps.setString(1, name);
			pps.setString(2, city);
			pps.setString(3, salary);
			pps.execute();
			con.close();
			pps.close();
			
			System.out.println("Succcessfully Executed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
