package com.dukeShop.controller;

import java.util.List;

import jcf.sua.mvc.MciRequest;
import jcf.sua.mvc.MciResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dukeShop.model.Product;
import com.dukeShop.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productservice;
	
	@RequestMapping("index.action")
	public void showAllProduct(MciRequest mciRequest, MciResponse mciResponse) {
		List<Product> allProduct = productservice.getAllProduct();
		mciResponse.setList("pp",allProduct);
		mciResponse.setViewName("index");
	}
	
}
