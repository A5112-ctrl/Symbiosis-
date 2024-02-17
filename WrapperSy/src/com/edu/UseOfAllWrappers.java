package com.edu;


public class UseOfAllWrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer i0=a;
		System.out.println(a);
		System.out.println("int_obj :"+i0);
		
		//1. auto-boxing(primitive to objects)
		
		
		boolean b1=true;
		char c='s';
		byte bb=80;
		short s=20;
		int i =30;
		long l=40;
		float f=4.5f;
		double d= 68.0;
		
		//conversion
		
		Boolean b_obj = b1;            //wrapper classes
		Character c_obj =c;
	     Byte bb_obj=bb;
	     
	     Short s_obj = s;
	     Integer i_obj = i;
	     Long l_obj=l;
	     Float f_obj =f;
	     Double d_obj = d;
	    
	      System.out.println("*** conversion of  primitive values into objects *** ");
		   System.out.println();
		    
	    
		 System.out.println("boolean obj = "+b_obj);
		 System.out.println("character obj = "+c_obj);
		 System.out.println("Byte obj = "+bb_obj);
		 System.out.println("Short obj = "+s_obj);
		 System.out.println("Integer obj = "+i_obj);
		 System.out.println("Long obj = "+l_obj);
		 System.out.println("Float obj = "+f_obj);
		 System.out.println("Double obj = "+d_obj);
		 
		 
		 //2. autounboxing wrapper class object into primitive values 
		 
		 Boolean bo=false;
		 Character co= 'f';
            Byte bbo=19;
		     
		     Short so = 56;
		     Integer io = 45;
		     Long lo=7899l;
		     Float fo =6.9f;
		     Double do1 = 46.8;
		     
		       boolean b_val =bo;
		        char  c_val=co;
		        byte bb_val = bbo;
		       short s_val = so;
		      int i_val = io;
		       long l_val = lo;
		       
		      float f_val =fo;
		    double d_val = do1;
		     
		    System.out.println();
		    System.out.println("*** conversion of wrapper class obj into primitive values ***");
		    System.out.println();
		    
		      System.out.println("boolean value = "+b_val);
		      System.out.println("caharacter value = "+c_val);
		      System.out.println("byte value = "+bb_val);
		      System.out.println("short value = "+s_val);
		      
		      System.out.println("int value = "+i_val);
		      System.out.println("long value = "+l_val);
		      System.out.println("float value = "+f_val);
		      System.out.println("double value = "+d_val);
		  }

}

/*
 output:
 
 *** conversion of  primitive values into objects *** 

boolean obj = true
character obj = s
Byte obj = 80
Short obj = 20
Integer obj = 30
Long obj = 40
Float obj = 4.5
Double obj = 68.0

*** conversion of wrapper class obj into primitive values ***

boolean value = false
caharacter value = f
byte value = 19
short value = 56
int value = 45
long value = 7899
float value = 6.9
double value = 46.8 */

