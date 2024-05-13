package kbpcoes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobiles {
	
	@Id
private int id ;
	@Column
private String name;

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
@Override
public String toString() {
	return "Mobiles [id=" + id + ", name=" + name + "]";
}
public Mobiles(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Mobiles() {
	super();
	// TODO Auto-generated constructor stub
}

}
