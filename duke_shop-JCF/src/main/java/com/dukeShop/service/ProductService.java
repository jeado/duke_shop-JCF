package com.dukeShop.service;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dukeShop.model.Product;

@Service
public class ProductService {
	@Autowired
	private QueryExecutor dao;

	public List<Product> getAllProduct() {

		return dao.queryForList("product.select", null, Product.class);

	}
	public void insertProduct(Product product) {
		dao.update("product.insert", product);
	}
	public void updateProduct(Product product) {
		dao.update("product.update", product);
	}
	public void deleteProduct(Product product) {
		dao.update("product.delete", product);
	}
 
}
