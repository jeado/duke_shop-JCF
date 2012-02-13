package com.dukeShop.service;
import java.util.List;

import jcf.query.core.QueryExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dukeShop.model.Customer;
import com.dukeShop.model.Orders;
import com.dukeShop.model.Product;

@Service

public class ProductService {
	@Autowired
	private QueryExecutor dao;
	public List<Product> getAllProduct(){
	return dao.queryForList("product.select",null,Product.class);
	 
 }
	void insertProduct(Product product)
	{dao.update("product.insert",product);}
	
	void updateProduct(Product product)
	{dao.update("product.update",product);}
	
	void deleteProduct(Product product)
	{dao.update("product.delete",product);}


	
	
	public List<Customer> getAllCustomer(){
	return dao.queryForList("customer.select",null,Customer.class);
	 
 }
	void insertCustomer(Customer customer)
	{dao.update("customer.insert",customer);}
	

	
	
	
	
	
}
