package com.edu;

import java.util.ArrayDeque;

public class DequeueOp {
public static void main(String[] args) {
	ArrayDeque <Integer>ad =new ArrayDeque();
	ad.add(100);
	ad.add(200);
	ad.add(500);
	ad.add(100);
	ad.add(800);
	System.out.println(ad);
	ad.addFirst(50);
	System.out.println(ad);
	ad.addLast(1000);
	System.out.println(ad);
	ad.removeFirst();
	System.out.println(ad);
	ad.removeLast();
	System.out.println(ad);
	ad.remove(200);
	System.out.println(ad);
	
	
}
}
