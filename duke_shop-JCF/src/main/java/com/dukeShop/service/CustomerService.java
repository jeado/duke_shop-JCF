package com.dukeShop.service;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.springframework.stereotype.Service;

import com.dukeShop.model.Customer;

@Service
public class CustomerService {
	private QueryExecutor dao;

	List<Customer> getAllCustomer() {

		return dao.queryForList("customer.select", null, Customer.class);

	}

	void insertCustomer(Customer customer) {
		dao.update("customer.insert", customer);
	}

	void updateCustomer(Customer customer) {
		dao.update("customer.update", customer);
	}

	void deleteCustomer(Customer customer) {
		dao.update("customer.delete", customer);
	}
}
