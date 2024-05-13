package kbp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity  //class name 
public class mobile {
	
	@Id  //create column with primary key
	private int id;
	@Column (name="name")   //create column name
	private String name;
	public mobile(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "mobile [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
