package com.edu1;

public class Operations {
private String  username;
private String pwd;
private int points;
public int getPoints() {
	return points;
}
public void setPoints(int points) {
	this.points = points;
}
Operations(){
	
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Override
public String toString() {
	return "Operations [username=" + username + ", pwd=" + pwd + "]";
}
public Operations(String username,String pwd) {
	super();
	this.username = username;
	this.pwd = pwd;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;

}



}
