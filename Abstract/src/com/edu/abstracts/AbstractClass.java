package com.edu.abstracts;

abstract class Shape {
	abstract void area();

	void display() {
		System.out.println("Display method");
	}
}

class Rectangle extends Shape {
	@Override
	void area() {
		int l = 4, b = 6, area;
		area = l * b;
		System.out.println("Area of Rectangle "+area);
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// Shape s =new Shape(); error object creation is not possible
	Rectangle r=new Rectangle();
	r.display();
	}
}


//super keyword always used in first line of a class
//final mathod  cannot override NOT INHERITED
//abstract method must be ovverride