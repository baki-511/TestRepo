package com.test.jdbc2;

import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :- ");
		String name = sc.nextLine();
		
		System.out.println("Enter city :- ");
		String city = sc.nextLine();
		
		System.out.println("Enter salary :- ");
		String salary = sc.nextLine();
		
		UserInput inp = new UserInput();
		inp.getUserInput(name, city, salary);
	}
}
