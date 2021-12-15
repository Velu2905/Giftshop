package com.user;

public class User {
	
private int Userid;
private String Username;
private String Password;
private String email;
private long mobilenumber;
public int getUserid() {
	return Userid;
}
public void setUserid(int userid) {
	Userid = userid;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(int mobilenumber) {
	this.mobilenumber = mobilenumber;
}
@Override
public String toString() {
	return "User [Userid=" + Userid + ", Username=" + Username + ", Password=" + Password + ", email=" + email
			+ ", mobilenumber=" + mobilenumber + "]";
}
public User(int userid, String username, String password, String email, int mobilenumber) {
	super();
	Userid = userid;
	Username = username;
	Password = password;
	this.email = email;
	this.mobilenumber = mobilenumber;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String username, String email,Long mobilenumber,String password) {
	super();
	Username = username;
	Password = password;
	this.email = email;
	this.mobilenumber = mobilenumber;
}

}
