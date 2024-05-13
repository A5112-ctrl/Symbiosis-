package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity

public class Cources {

	@Id
	private int cid;
	private String Cname;
	private int Cduration;
	
	@ManyToMany(mappedBy="cource")
	
	private List<Student>student=new ArrayList<Student>();

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public int getCduration() {
		return Cduration;
	}

	public void setCduration(int cduration) {
		Cduration = cduration;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
}
