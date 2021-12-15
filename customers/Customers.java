package com.customers;

public class Customers {

	private int customerid;
	private String username;
	private String password;
	private String address;
	private int mobilenumber;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	@Override
	public String toString() {
		return "Customers [customerid=" + customerid + ", username=" + username + ", password=" + password
				+ ", address=" + address + ", mobilenumber=" + mobilenumber + "]";
	}
	public Customers(int customerid, String username, String password, String address, int mobilenumber) {
		super();
		this.customerid = customerid;
		this.username = username;
		this.password = password;
		this.address = address;
		this.mobilenumber = mobilenumber;
	}
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
