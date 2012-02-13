package com.dukeShop.service;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import system.dao.CommonDao;

import com.dukeShop.model.Orders;

@Service
public class OrdersService {
	@Autowired
	private QueryExecutor dao;

	public List<Orders> getAllOrders() {

		return dao.queryForList("orders.select", null, Orders.class);

	}
	public void insertOrders(Orders orders) {
		dao.update("orders.insert", orders);
	}
	public void updateOrders(Orders orders) {
		dao.update("orders.update", orders);
	}
	public void deleteOrders(Orders orders) {
		dao.update("orders.delete", orders);
	}
}
