package com.ManyToManyBus;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class BusDriver {

	@Id
	private int did;
	private String dname;
	
	@ManyToMany(mappedBy="busdriver",cascade=CascadeType.ALL)
	//cascade.All --->it will automaticaly save child data ..only we have to save parent data
	//fetch FetchType.Eager
	private List<Bus>bus;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Bus> getBus() {
		return bus;
	}
	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}
}
