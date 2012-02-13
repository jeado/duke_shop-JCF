package com.dukeShop.model;

import java.io.Serializable;


public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;

	private String cid;
	private String passwd;
	private String name;
	private String email;
	private String phone;


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Customer() {
		super();
	}


	public String getUserId() {
		return cid;
	}


	public void setUserId(String userId) {
		this.cid = userId;
	}


	public String getPassword() {
		return passwd;
	}


	public void setPassword(String password) {
		this.passwd = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Customer(String userId, String password, String name) {
		super();
		this.cid = userId;
		this.passwd = password;
		this.name = name;
	}




}
