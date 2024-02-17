package com.edu1;

import java.util.Scanner;

public class OperationAut {
	static Scanner sc = new Scanner(System.in);
	static UserOp usop = new UserOp();
	
	public static void getLogin() {
		System.out.println("Enetr Username ");
		String name = sc.next();

		System.out.println("Enter Password :");
		String pass = sc.next();
		System.out.println("Check");
		usop.login(name,pass);
	}

	public static void singUp() {
		System.out.println("Enter Username ");
		String name = sc.next();
		User us=new User();
		us.setName(name);
		
		System.out.println("Enter Password :");
		String pass = sc.next();
		us.setPass(pass);
		
		System.out.println("Enter Points :");
		int points=sc.nextInt();
		us.setPoints(points);
				
		usop.addUser(us);
		usop.displayUser();
		App.start();

	}

}
