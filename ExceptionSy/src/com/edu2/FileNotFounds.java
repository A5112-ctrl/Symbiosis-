package com.edu2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFounds {
public void m1() throws FileNotFoundException {
	FileInputStream f1=new FileInputStream("D:\\photos\\pappa\\important documents");
	//FileReader r=new FileReader(f1);
}
void m2() {
	try {
		m1();
	} catch (Exception e) {
		//e.printStackTrace();
		System.out.println("Handled");
	}
}
public static void main(String[] args) {
	FileNotFounds f=new FileNotFounds();
	f.m2();
}
}
