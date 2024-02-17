package com.edu;

public class Appliances {
	private int ProductId;
	private String ProductName;
	private double price;
	private double gst;
	private int stock;
	@Override
	public String toString() {
		return "Appliances [ProductId=" + ProductId + ", ProductName=" + ProductName + ", price=" + price + ", gst="
				+ gst + ", stock=" + stock + "]";
	}
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	
	}
}
