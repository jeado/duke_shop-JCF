package com.dukeShop.service;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dukeShop.model.Orders;
import com.dukeShop.sql.groovy.OrderQuery;

@Service
public class OrderService {
	@Autowired
	private QueryExecutor dao;

	public List <Orders> getAllOrders(){
		//return dao.queryForList("orders.select", null, Orders.class);

		return dao.queryForList(OrderQuery.selectAll, null, Orders.class);

	}

	public void insertOrders (Orders orders){
		//dao.update("orders.insert", orders);
		dao.update(OrderQuery.insert, orders);
	}

	public void updateOrders (Orders orders){
		dao.update("orders.update", orders);
	}

	public void deleteOrders (Orders orders){
		dao.update("orders.delete", orders);
	}
}
