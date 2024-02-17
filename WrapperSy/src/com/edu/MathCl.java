package com.edu;

public class MathCl {

	public static void main(String[] args) {
		double a=12.4566;
		double b=25;
		System.out.println("Max: "+Math.min(a, b));
		System.out.println("Min :"+Math.max(a, b));
		System.out.println("Absolute :"+Math.abs(a));
		System.out.println("Squareroot:"+Math.sqrt(b));
		System.out.println("Round of :"+Math.ceil(a));
		System.out.println("Near int value :"+Math.floor(a));
		System.out.println("Cuberoot:"+Math.cbrt(a));
		System.out.println("Power (Square) :"+Math.pow(b,2));
		System.out.println("Round of :"+Math.round(a));
	}
}
/*
output Max: 12.4566
Min :25.0
Absolute :12.4566
Squareroot:5.0
Round of :13.0
Near int value :12.0
Cuberoot:2.3181053695386136
Power :625.0
Round of :12

*/