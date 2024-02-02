package com.edu2;

import java.util.Scanner;

public class MainApp {
 public static void main(String[] args) {
	 Operations op=new Operations();
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Press 1) Add Details \t2)See Datils \t3)Update Details ");
	int ch=sc.nextInt();
	switch(ch) {
	case 1:
		op.AddDetails();
		break;
	case 2:
		op.SeeDetails();
		break;
	case 3:
		op.UpdateDetails();
		break;
	default :
			System.out.println("Invalid choice");
	}
	}
 }
}
