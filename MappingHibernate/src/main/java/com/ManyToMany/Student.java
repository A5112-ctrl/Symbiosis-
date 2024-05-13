package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	private int sid;
	private String name;
	private int marks;
	
	@ManyToMany
	
	    
	private List<Cources>cource=new ArrayList<Cources>();

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public List<Cources> getCource() {
		return cource;
	}

	public void setCource(List<Cources> cource) {
		this.cource = cource;
	}

}
