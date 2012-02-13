package com.dukeShop.service;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.springframework.stereotype.Service;

import system.dao.CommonDao;

import com.dukeShop.model.Orders;

@Service
public class OrdersService {
	private QueryExecutor dao;

	List<Orders> getAllOrders() {

		return dao.queryForList("orders.select", null, Orders.class);

	}
	void insertOrders(Orders orders) {
		dao.update("orders.insert", orders);
	}
	void updateOrders(Orders orders) {
		dao.update("orders.update", orders);
	}
	void deleteOrders(Orders orders) {
		dao.update("orders.delete", orders);
	}
}
