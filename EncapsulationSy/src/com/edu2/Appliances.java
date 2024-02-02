package com.edu2;

public class Appliances {
	@Override
	public String toString() {
		return "Appliances [ProductId=" + ProductId + ", ProductName=" + ProductName + ", price=" + price + ", gst="
				+ gst + "]";
	}
	private int ProductId;
	private String ProductName;
	private double price;
	private double gst;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}

}
