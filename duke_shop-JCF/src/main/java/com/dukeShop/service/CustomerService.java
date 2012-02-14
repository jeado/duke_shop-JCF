package com.dukeShop.service;

import java.util.List;
import java.util.Map;

import jcf.query.core.QueryExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dukeShop.model.Customer;
import com.dukeShop.sql.groovy.CustomerQuery;

@Service
public class CustomerService {

	@Autowired
	private QueryExecutor executor;

	public List<Customer> getAllCustomer(){
		return executor.queryForList("customer.select", null, Customer.class);
	}

	public List<Customer> findCustomer(Map<String,String> map){
		return executor.queryForList("customer.find", map, Customer.class);
	}

	public void insertCustomer(Customer customer){
		executor.update("customer.insert", customer);
	}
	/*
	public List<Customer> getAllCustomer(){
		return executor.queryForList("customer.select", null, Customer.class);
	}
	*/
}
