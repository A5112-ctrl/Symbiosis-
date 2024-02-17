package com.edu;

public class AutoBoxing {
	public static void main(String[] args) {
	
//Convert primitive data into an object called as Boxing
//int-->object
int a=6;
	Integer i =new Integer(a);
	//before java 5.0 we have explicitly convert primitive to object using valueOf()
	Integer i1=Integer.valueOf(a);
	//Autoboxing is comes into existence from 5.0 and it is done automatically done by the java compiler
	Integer i2=i;
	System.out.println("i : "+i);
	System.out.println("i1 : "+i1);
	System.out.println("i2 : "+i2);
	

}
}




//primitive to obj
//int a=10;
//Integer i=new Integer(a);
//Integer i1=Integer.valueOf(a);
//Integer i2=i;