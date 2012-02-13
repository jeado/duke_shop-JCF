package com.dukeShop.model;

import java.io.Serializable;


public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;
//pid, passwd, phone, email, name
	private String pid;
	private String passwd;
	private String phone;
	private String email;
	private String name;
	//custom.setPid("d54");
	//custom.setPasswd("1ㅂ");
	//custom.setPhone("030ㅇㄹ-23");
	//custom.setEmail("loㅋk@dd");
	//custom.setName("바2");

	public Customer(){}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
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
	public Customer(String pid, String passwd, String phone, String email,
			String name) {
		super();
		this.pid = pid;
		this.passwd = passwd;
		this.phone = phone;
		this.email = email;
		this.name = name;
	}





}
