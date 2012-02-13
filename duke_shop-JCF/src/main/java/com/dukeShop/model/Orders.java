package com.dukeShop.model;

import java.io.Serializable;

public class Orders implements Serializable {

	private static final long serialVersionUID = 1L;
	private String oid;
	private String pid;
	private String id;
	private int qty;
	private String odate;
	private int price;

	public Orders() {
	}

	public Orders(String oid, String pid, String id, int qty, String date) {
		super();
		this.oid = oid;
		this.pid = pid;
		this.id = id;
		this.qty = qty;
		this.odate = date;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getDate() {
		return odate;
	}

	public void setDate(String date) {
		this.odate = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}