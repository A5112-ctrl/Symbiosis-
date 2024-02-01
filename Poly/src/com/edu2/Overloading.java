package com.edu2;

class first {
	public void m1() {
		System.out.println("No parameter");
	}
	public void m1(int a) {//local parameter accesible only in curly bracket/method
		System.out.println("Int paramter  :"+a);
	}
	public void m1(String a) {
		System.out.println("String paramter  :"+a);
	}
	public void m1(int a,int b) {
		System.out.println("multi paramter with int  :"+a+" "+b);
	}
	public void m1(float a,float b) {
		System.out.println("multi paramter with float :"+a+" "+b);
	}
	
}
public class Overloading {
public static void main(String[] args) {
	first f1=new first();
	f1.m1();
	f1.m1(10);
	f1.m1("anuja");
	f1.m1(12,20);
	f1.m1(1.2f,20.3f);
}
}
