package com.edu.ShopMain;

import java.util.Scanner;

public class Operations {
public static void main(String[] args) {
	System.out.println("Welcome to XYZ Shop");
	Scanner sc=new Scanner(System.in);
	int n;
	do {System.out.println("press 1)Mobile 2)Tv 3) Ac");
	System.out.println("Enter ur choice ");
	int ch=sc.nextInt();
	switch(ch) {
	case 1:
		Mobille.getDetails();
		break;
	case 2:
		Tv.getTvDetails();
		break;
	case 3:
		Ac.getAcDetails();
		break;
		
	}System.out.println("Do u want to continue (1/0)");
	 n=sc.nextInt();
	}while(n!=0);
}
}
