package com.edu.ShopMain;

import java.util.Scanner;

public class Tv implements MyShop{
static Scanner sc=new Scanner(System.in);
	@Override
	public void getProduct() {
		System.out.println("Product : Tv");
		
	}

	@Override
	public void getName() {
		System.out.println("Name: Tv");
		
	}

	@Override
	public void getPrice() {
		System.out.println("Price : 10000");
		
	}

	@Override
	public void getCatagory() {
		System.out.println("Category :Tv");
		
	}
	public void TvInfo() {
		System.out.println("TV Info");
	}
	public static void getTvDetails() {
		System.out.println("Press 1)Soni 2) LG ");
		System.out.println("Enter ur choice :");
		int ch=sc.nextInt();
		int n;
		do{
			switch (ch) 
			{
		case 1:
			Soni.getSoniDetails();
			break;
		case 2:
			LG.getLGDetails();
			break;
	
			}
			System.out.println("Do u want to continue (1/0)");
			 n=sc.nextInt();
		}while(n!=0);

}	
class Soni extends Tv{

	public static void getSoniDetails() {
		System.out.println("Soni");
		Tv t1=new Tv();
		t1.getCatagory();
		t1.getName();
		t1.getPrice();
		t1.getProduct();
		t1.TvInfo();
	}
	
}
class LG extends Tv{

	public static void getLGDetails() {
		System.out.println("LG");
		Tv t1=new Tv();
		t1.getCatagory();
		t1.getName();
		t1.getPrice();
		t1.getProduct();
		t1.TvInfo();
		
	}
}
}