package com.edu1;

public class Product {
	private String Pname;
	private int price;
	public Product(String pname, int price) {
		super();
		Pname = pname;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [Pname=" + Pname + ", price=" + price + "]";
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
