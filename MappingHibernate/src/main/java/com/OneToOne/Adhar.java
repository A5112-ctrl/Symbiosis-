package com.OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Adhar {

	@Id
	private int AdharNo;

	private int AdharId;
	
	@OneToOne
	@JoinColumn (name="person_id") //used to specify foreign key in relational table
	private Person person;


	@Override
	public String toString() {
		return "Adhar [AdharNo=" + AdharNo + ", AdharId=" + AdharId + ", person=" + person + "]";
	}


	public int getAdharNo() {
		return AdharNo;
	}


	public void setAdharNo(int adharNo) {
		AdharNo = adharNo;
	}


	public int getAdharId() {
		return AdharId;
	}

	public void setAdharId(int adharId) {
		AdharId = adharId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
