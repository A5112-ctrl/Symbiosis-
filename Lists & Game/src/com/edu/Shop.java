package com.edu;

import java.util.LinkedList;
import java.util.Random;

public class Shop {
public static void main(String[] args) {
	LinkedList <String> ls=new LinkedList();
	ls.add("TV");
	ls.add("AC");
	ls.add("Mobile");
	ls.add("Better luck Next Time");
	Random rn=new Random();
	int index=rn.nextInt(ls.size());
	System.out.println(ls.get(index));
}
}
