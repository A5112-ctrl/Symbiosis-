package com.edu.ShopMain;

import java.util.Scanner;

public class Ac implements MyShop{
static Scanner sc=new Scanner(System.in);
	@Override
	public void getProduct() {
		System.out.println("Product : Ac");
		
	}

	@Override
	public void getName() {
		System.out.println("Name: Ac");
		
	}

	@Override
	public void getPrice() {
		System.out.println("Price : 10000");
		
	}

	@Override
	public void getCatagory() {
		System.out.println("Category :AC");
		
	}
	public void AcInfo() {
		System.out.println("ACCCCCCCCCC");
	}

	public static void getAcDetails() {
		System.out.println("Press 1)Whirpool 2) Swing ");
		System.out.println("Enter ur choice :");
		int ch=sc.nextInt();
		switch (ch) {
		case 1:
			Whirpool.getWhirpoolDetails();
			break;
		case 2:
			Swing.getSwingDetails();
			break;
		}
		
	}

}
class Whirpool extends Ac{

	public static void getWhirpoolDetails() {
		System.out.println("Whirpool");
		Ac a1=new Ac();
		a1.getCatagory();
		a1.getName();
		a1.getPrice();
		a1.getProduct();
		a1.AcInfo();
	}
	
}
class Swing extends Ac{

	public static void getSwingDetails() {
		System.out.println("Swing");
		Ac a1=new Ac();
		a1.getCatagory();
		a1.getName();
		a1.getPrice();
		a1.getProduct();
		a1.AcInfo();
		
	}
	
}
