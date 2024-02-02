package com.edu2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Operations {
static Scanner sc=new Scanner(System.in);
static Appliances ap=new Appliances();
	public void AddDetails() {
		
		System.out.println("Enter Product Id :");
		int pid=sc.nextInt();
		ap.setProductId(pid);
		System.out.println("Enter Product Name :");
		String pname=sc.next();
		ap.setProductName(pname);
		System.out.println("Enter Product price :");
		double pprice=sc.nextDouble();
		double gstPrice =pprice+((pprice*18)/100);
		ap.setPrice( pprice);
		ap.setGst(gstPrice);
	}

	public void SeeDetails() {
		System.out.println("-------Product Details--------");
		System.out.println("Product Id :"+ap.getProductId());
		System.out.println("Product Name :"+ap.getProductName());
		System.out.println("Product Price :"+ap.getPrice());
		System.out.println("Product Price with GST :"+ap.getGst());
		System.out.println("--------Thank You-------------");
		
	}

	public void UpdateDetails() {
		System.out.println("Press 1)update Id 2)update name 3)update price ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter New Product Id");
			ap.setProductId(sc.nextInt());
			System.out.println("Product details updated at :"+ LocalDateTime.now());
			break;
		case 2:
			System.out.println("Enter New Product Name");
			ap.setProductName(sc.next());
			System.out.println("Product details updated at :"+ LocalDateTime.now());
			break;
		case 3:
			System.out.println("Enter New Product Price");
			ap.setPrice(sc.nextDouble());
			System.out.println("Product details updated at :"+ LocalDateTime.now());
			break;
			default:
				System.out.println("Invalid Choice");
		}
	}

}
