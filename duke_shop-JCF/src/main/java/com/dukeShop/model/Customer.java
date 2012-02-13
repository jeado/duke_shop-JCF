package com.dukeShop.model;

import java.io.Serializable;


public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;

	private String id;
	private String passwd;
	private String name;
	private String email;

	public Customer() {
		super();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getpasswd() {
		return passwd;
	}


	public void setpasswd(String passwd) {
		this.passwd = passwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Customer(String userId, String password, String name,String email) {
		super();
		this.id = userId;
		this.passwd = password;
		this.name = name;
		this.email=email;
	}




}
