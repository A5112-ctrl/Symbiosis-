package com.edu1;

import java.util.ArrayList;

public class Operation {
	public static void main(String args[]) {
		ArrayList list=new ArrayList();
		Product pd = new Product("Orange",100);
		Product pd1 = new Product("Apple",120);
		Product pd2=new Product("Mango",200);
		Product pd3=new Product("Cherry",500);
		Product pd4=new Product("Guava",400);

		Cart cart=new Cart();
		cart.addItems(pd);
		cart.addItems(pd1);
		cart.addItems(pd2);
		cart.addItems(pd3);
		cart.addItems(pd4);
		System.out.println("--------Adding Elements -----------------------");
		cart.displayItems();
		cart.removeItems(pd4);
		System.out.println("-----------Removing By pd-----------------");
		cart.displayItems();
		System.out.println("----After Removing Element by name---------");
		cart.RemoveItems("Guava");
		cart.displayItems();
	}

}
