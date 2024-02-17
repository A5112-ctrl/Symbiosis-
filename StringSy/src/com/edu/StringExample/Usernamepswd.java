package com.edu.StringExample;

import java.util.Scanner;

public class Usernamepswd {
	
	private static String uname;
	private static int upwd;
	public void  input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username :");
		 uname=sc.next();
		 
		 System.out.println("Enter Password :");
		 upwd=sc.nextInt();
	}
/**equalsIgnorecase is not case sensitive
	equals == is case sensitive
	**/
	public void CheckUser() {
		if (uname.equalsIgnoreCase("Anuja")) {
			System.out.println("Valid User");
		}
		else {
			System.out.println("Invalid user");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}






/*import java.util.Scanner;

public class LoginValidation {
private static String uname,upass;
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		uname = sc.next();
		
		System.out.println("Enter password");
		upass = sc.next();
	}
	//equalsIgnoreCase->not case sensitive
	//equals ->case sensitive
	
	public static void checkUser() {
		System.out.println("No of chars "+uname.length());
		if(uname.equalsIgnoreCase("admin") && upass.equals("admin123")) {
			System.out.println("Valid user");
		}
		else {
			System.out.println("Invalid user");
		}
	}

	public static void main(String[] args) {
		
	//	LoginValidation ob = new LoginValidation();
		LoginValidation.input();
		LoginValidation.checkUser();

	}

}*/
