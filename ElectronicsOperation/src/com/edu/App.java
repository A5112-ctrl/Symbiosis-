package com.edu;

import java.util.Scanner;

public class App {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Press 1)Add Items 2)See Items 3)Update Items");
	int ch=sc.nextInt();
	switch(ch) {
	case 1:
		Opearations.setItems();
		break;
	case 2:
		
		break;
	case 3:
		break;
		
	}
}
}
