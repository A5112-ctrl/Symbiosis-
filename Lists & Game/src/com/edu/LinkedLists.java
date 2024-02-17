package com.edu;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class LinkedLists {
	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList();
		ls.add(100);
		ls.add(200);
		ls.add(400);
		ls.add(300);
		ls.add(500);
		System.out.println(ls);
		Random rn = new Random(); // random fuction is used to generate random value
		int index = rn.nextInt(ls.size());
		System.out.println(ls.get(index));
	
		
		Random rn1 = new Random();
		Collections.shuffle(ls, rn1);	//shuffle the list items
		System.out.println(ls);
		
		Random rn2=new Random();
		int otp=rn2.nextInt(10000,99999);	//Create random no. between given boundry
		System.out.println(otp);
	}
}
