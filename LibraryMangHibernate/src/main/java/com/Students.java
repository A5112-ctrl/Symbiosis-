package com;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Students {
	@Id
//	@GeneratedValue (strategy=GenerationType.AUTO)
	private int sid;
	private String sname;
	private int quantity;
	private String bname;
	private String bauthor;
//	private Book books; 
//	
//	public Book getBooks() {
//		return books;
//	}
//	public void setBooks(Book books) {
//		this.books = books;
//	}
	
	public int getSid() {
		return sid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
