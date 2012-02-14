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
	private QueryExecutor dao;

	public List<Customer> getAllCustomer() {

		return dao.queryForList("customer.select", null, Customer.class);

	}
	public List<Customer> findCustomer(Map<String, String> map) {
		
		return dao.queryForList("customer.find",map,Customer.class);
		
		
		
	}
	public void insertCustomer(Customer customer) {
		dao.update("customer.insert", customer);
	}

	public void updateCustomer(Customer customer) {
		dao.update(CustomerQuery.update, customer);
	}

	public void deleteCustomer(Customer customer) {
		dao.update(CustomerQuery.delete, customer);
	}
}
