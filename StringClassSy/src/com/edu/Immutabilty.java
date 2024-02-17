package com.edu;

public class Immutabilty {
	int x;

	Immutabilty(int x) {
		this.x = x;
	}

	public Immutabilty change(int x) {
		if (this.x == x) {
			return this;
		} else {
			return new Immutabilty(x);
		}
	}

	@Override
	public String toString() {
		return "[x=" + x + "]";
	}

	public static void main(String[] args) {
		Immutabilty obj = new Immutabilty(10);
		System.out.println(" Before :" + obj);
		System.out.println(obj.change(80));
		System.out.println(" After :" + obj);

	}
}
