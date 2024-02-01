package com.edu.ShopMain;

import java.util.Scanner;

public class Mobille implements MyShop{
	static Scanner sc=new Scanner(System.in);
	@Override
	public void getProduct() {
		System.out.println("Product : Mobile");
		
	}

	@Override
	public void getName() {
		System.out.println("Name:Mobile");
		
	}
	@Override
	public void getPrice() {
		System.out.println("Price : 10000");
		
	}

	@Override
	public void getCatagory() {
		System.out.println("Category :Mobile");
	}
	public static void mobileInfo() {
		System.out.println("HAHAHAHA");
	}
	public static void getDetails() {
		System.out.println("Press 1)Apple 2) RedMi ");
		System.out.println("Enter ur choice :");
		int ch=sc.nextInt();
		switch (ch) {
		case 1:
			Apple.getAppleDetails();
			break;
		case 2:
			RedMi.getRedMiDetails();
			break;
		}	
	}
}
class Apple extends Mobille{
	
	public static void getAppleDetails() {
		System.out.println("Apple");
		Mobille m1=new Mobille();
		m1.getCatagory();
		m1.getName();
		m1.getPrice();
		m1.getProduct();
		Mobille.mobileInfo();
	}
	
}
class RedMi extends Mobille{
	public static void getRedMiDetails(){
		System.out.println("RedMi");
		Mobille m1=new Mobille();
		m1.getCatagory();
		m1.getName();
		m1.getPrice();
		m1.getProduct();
		Mobille.mobileInfo();
	}
}
