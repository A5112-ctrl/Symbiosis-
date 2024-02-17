package com.edu;

public class UnBoxing {
public static void main(String[] args) {
	 Integer ii=new Integer(3);    //the process of conversion from  wrapper class into primitive types is called auto-unboxing
	    
	    int i=ii.intValue();          //before java 5.0 we have to explicitly convert wrapper class object into primitive  using intValue()
	    
	    int j=ii;      ////autounboxing comes into existence from java 5.0 and it is done automatically by the java compiler
	
	    System.out.println(ii);
	    System.out.println(i);
	    System.out.println(j);
	    
}

}
/*
output:
3
3
3    */
