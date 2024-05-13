package com.ManyToManyBus;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Bus {

	@Id
	private int bid;
	private String bname;
	
	@ManyToMany
	//(mappedBy="bus")
	private List<BusDriver> busdriver;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public List<BusDriver> getBusdriver() {
		return busdriver;
	}

	public void setBusdriver(List<BusDriver> busdriver) {
		this.busdriver = busdriver;
	}
}
