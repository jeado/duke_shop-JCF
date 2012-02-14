package com.dukeShop.model;




public class Customer{

//	private static final long serialVersionUID = 1L;

	private String id;
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

	public String getName() {
		return name;
	}


	public void setName(String name) {
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


	public Customer(String id, String passwd, String name, String email,
			String phone) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}






}
