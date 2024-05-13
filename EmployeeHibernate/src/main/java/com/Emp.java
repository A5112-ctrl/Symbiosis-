package com;

import java.util.Arrays;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
public class Emp {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	@Column (name="Name")
	private String ename;
	@Column (name="Adds")
	private String address;
	//@Transient         //it will drop column from table
	private double salary;
	@Lob
	@Column(length=100000)
	@Transient  
	private byte [] image;
	@Temporal(TemporalType.DATE)  // IT WILL GIVES ONLY DATE 
	private Date joiningdate;
	
	private Certification cert;
	
	public Certification getCert() {
		return cert;
	}

	public void setCert(Certification cert) {
		this.cert = cert;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}


	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}

	
	public Emp(int eid, String ename, String address, double salary, 
			byte[] image,
			Date joiningdate) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
		this.salary = salary;
		this.image = image;
		this.joiningdate = joiningdate;
	}

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", address=" + address + ", salary=" + salary + ", image="
				+ Arrays.toString(image)
				+ ", joiningdate=" + joiningdate + "]";
	}

	
	
}
