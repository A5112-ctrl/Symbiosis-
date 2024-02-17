package com.edu;
class Anuja extends RuntimeException{
public  Anuja() {
	super("My");
}
}

public class CustomeEx {
public static void main(String[] args) {
	try {
		//linear
		throw new Anuja();
		//bug
	}catch(RuntimeException e) {
		System.out.println("Handled");
		
	} 
}
}
