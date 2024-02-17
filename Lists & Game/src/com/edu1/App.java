package com.edu1;

import java.util.Scanner;
public class App {
	
static Scanner sc=new Scanner(System.in);
public static void start() {
	System.out.println("Press \n1)Login\n2)Sign Up ");
	switch(sc.nextInt()) {
	case 1:
		OperationAut.getLogin();
		break;
	case 2:
		OperationAut.singUp();
		break;
	default:
		System.out.println("Invalid ");
	}
}
public static void main(String[] args) {
	start();
}
}
