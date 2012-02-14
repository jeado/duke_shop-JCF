package com.dukeShop.model;




public class Customer{

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





	public String getCid() {
		return cid;
	}


	public void setCid(String cid) {
		this.cid = cid;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Customer(String cid, String passwd, String name, String email,
			String phone) {
		super();
		this.cid = cid;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}






}
