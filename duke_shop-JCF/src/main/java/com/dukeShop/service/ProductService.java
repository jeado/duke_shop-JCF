package com.dukeShop.service;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dukeShop.model.Product;
import com.dukeShop.sql.groovy.ProductQuery;

@Service
public class ProductService {

	@Autowired
	private QueryExecutor dao;

	public List <Product> getAllProduct(){
		//return dao.queryForList("product.select", null, Product.class);
		return dao.queryForList(ProductQuery.selectAll, null, Product.class);

	}

	public void insertProduct (Product product){
		//dao.update("product.insert", product);
		dao.update(ProductQuery.insert, product);
	}

	public void updateProduct (Product product){
		//dao.update("product.update", product);
		dao.update(ProductQuery.update, product);
	}

	public void deleteProduct (Product product){
		//dao.update("product.delete", product);
		dao.update(ProductQuery.delete, product);
	}
}
