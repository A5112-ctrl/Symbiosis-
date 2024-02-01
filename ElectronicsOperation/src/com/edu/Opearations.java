package com.edu;

import java.util.Scanner;

public class Opearations {
	static Scanner sc=new Scanner(System.in);
	public static void setItems() {
		System.out.println("Press 1) Add Details 2)See Details");
	int ch=sc.nextInt();
	Tv tv=new Tv();
	switch(ch) {
	case 1:
		tv.AddTvDetails();
		break;
	case 2:
		tv.SeeTvDeatils();
		break;
	}
		
	}

}
