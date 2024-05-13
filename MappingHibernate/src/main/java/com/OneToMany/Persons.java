package com.OneToMany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Persons {
	@Id
	private int pid;
	private int Contactnum;
	
	@OneToMany(mappedBy="person")
	private	List <Contacts> c=new ArrayList<Contacts>();

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getContactnum() {
		return Contactnum;
	}

	public void setContactnum(int contactnum) {
		this.Contactnum = contactnum;
	}

	public List<Contacts> getC() {
		return c;
	}

	public void setC(List<Contacts> c) {
		this.c = c;
	}
	


	
}
