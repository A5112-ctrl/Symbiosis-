package com.edu;

public class Student {
private int sid;
private String name;
private String branch;

public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid=sid;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getbranch() {
	return branch;
}
public void setbranch(String branch) {
	this.branch=branch;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", branch=" + branch + "]";
}
public static void main(String[] args) {
	System.out.println("-----------Students Details----------");
	Student s1=new Student();
	s1.setName("Anuja");
	s1.setSid(31);
	s1.setbranch("CSE");
	System.out.println(s1);
	
	Student s2=new Student();
	s2.setSid(32);
	s2.setName("Shree");
	s2.setbranch("Mech");
	System.out.println(s2);
}

}

