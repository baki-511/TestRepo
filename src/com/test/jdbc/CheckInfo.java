package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CheckInfo {
	
	public void insertStudentData(int marks){
//		Scanner sc = new Scanner(System.in);
	
//		Connection con = null;
//		PreparedStatement pps = null;
		try {
			ContactClass conTest = new ContactClass();
			Connection con = conTest.getConnectionDetails();
//			 PreparedStatement pps = con.prepareStatement("insert into checkInfo(fname,mark) values(?,?)");
			 PreparedStatement pps = con.prepareStatement("insert into checkInfo(mark) values(?)");
			
//			pps.setString(1, name);
			pps.setInt(1, marks);
			pps.execute();
			System.out.println("Record is inserted Successfully.");
			con.close();
			pps.close();
			
//			 pps = con.prepareStatement("insert into userInfo"
//					+ "(firstName,city,salary) values(?,?,?)");
//			System.out.print("Name :- ");
//			String name = sc.next();
//			System.out.print("City :- ");
//			String city = sc.next();
//			System.out.print("Salary :- ");
//			String salary = sc.next();
//			
//			pps.setString(1, name);
//			pps.setString(2, city);
//			pps.setString(3, salary);
//			
//			int i= pps.executeUpdate();
//			System.out.println("Record is inserted "+i);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter name :- ");
//		String name = sc.next();
		System.out.println("Enter marks :- ");
		int mark = sc.nextInt();
		CheckInfo ch = new CheckInfo();
		ch.insertStudentData(mark);
		
	}
	
}
