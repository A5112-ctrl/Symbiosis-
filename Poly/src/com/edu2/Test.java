package com.edu2;

public class Test {
	Test() {
		System.out.println("Default overloading");
	}
     Test(int a) {
		System.out.println("Parameter  overloading");
	}
     Test(int a,float b){
    	 System.out.println("Multi parameter ");
     }
     
	
public static void main(String[] args) {
	
	System.out.println("Constructors can be overloaded");
Test t1=new Test();
Test t2=new Test(10);
Test t3=new Test(12,3.6f);
	

}
}
