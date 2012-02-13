package com.dukeShop.model;

import java.io.Serializable;


public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;

	private String id;
	private String passwd;
	private String phone;
	private String email;
	private String name;

	public Customer() {
	}

	public Customer(String id, String passwd, String phone, String email, String name) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.phone = phone;
		this.email = email;
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



}
