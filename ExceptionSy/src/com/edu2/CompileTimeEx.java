package com.edu2;

import java.io.FileNotFoundException;

public class CompileTimeEx {
//File not found Exception
	void m1() throws FileNotFoundException,ClassNotFoundException  {
		System.out.println("ABC");
	}
	void m2()throws FileNotFoundException, ClassNotFoundException{
		m1();
		System.out.println("XYZ");
	}
	void m3() {
	try {
		m2();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		CompileTimeEx c=new CompileTimeEx();
	c.m3();
	}
}
