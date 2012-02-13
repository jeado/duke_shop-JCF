package com.dukeShop.service;
import java.util.List;

import jcf.query.core.QueryExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dukeShop.model.Orders;
import com.dukeShop.model.Product;

@Service

public class OrderService {
	@Autowired
	private QueryExecutor dao;
	public List<Orders> getAllOrders(){
	return dao.queryForList("order.select",null,Orders.class);
	 
 }
	void insertOrder(Orders order)
	{dao.update("order.insert",order);}
	
	void updateOrder(Orders order)
	{dao.update("order.update",order);}
	
	void deleteOrder(Orders order)
	{dao.update("order.delete",order);}


}