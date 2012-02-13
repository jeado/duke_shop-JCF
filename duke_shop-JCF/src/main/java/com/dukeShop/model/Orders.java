package com.dukeShop.model;

import java.io.Serializable;

public class Orders implements Serializable {

	private static final long serialVersionUID = 1L;
	private static String oid;
	private static String pid;
	private String id;
	private int qty;
	private String date;

	public Orders() {
	}

	public Orders(String oid, String pid, String id, int qty, String date) {
		super();
		this.oid = oid;
		this.pid = pid;
		this.id = id;
		this.qty = qty;
		this.date = date;
	}

	public String getOid() {
		return oid;

	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public static String getPid() {
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
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


}
