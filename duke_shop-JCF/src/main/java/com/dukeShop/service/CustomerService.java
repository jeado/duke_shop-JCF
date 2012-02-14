package com.dukeShop.service;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dukeShop.model.Customer;
import com.dukeShop.sql.groovy.CustomerQuery;

@Service
public class CustomerService {

	@Autowired
	private QueryExecutor dao;

	public List <Customer> getAllCustomer(){
		//iBatis 사용 (xml 찾아가서 봐야 함)
		//return dao.queryForList("customer.select", null, Customer.class);

		//Groovy 사용
		//(selectAll 선택 & f3 누르면 해당 쿼리문의  Groovy 파일로 이동)
		return dao.queryForList(CustomerQuery.selectAll, null, Customer.class);
	}

	public void insertCustomer (Customer customer){
		//dao.update("customer.insert", customer);

		dao.update(CustomerQuery.insert, customer);
	}

	public void updateCustomer (Customer customer){
		//dao.update("customer.update", customer);
		dao.update(CustomerQuery.update, customer);
	}

	public void deleteCustomer (Customer customer){
		//dao.update("customer.delete", customer);
		dao.update(CustomerQuery.delete, customer);
	}
}
