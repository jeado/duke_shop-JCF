package com.dukeShop.controller;

import java.util.List;
import java.util.Map;

import jcf.sua.mvc.MciRequest;
import jcf.sua.mvc.MciResponse;
import jcf.upload.FileInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dukeShop.model.Product;
import com.dukeShop.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("test")
	public void showAllProduct(MciRequest mciRequest, MciResponse mciResponse){
		List<Product> allProduct = productService.getAllProduct();
		mciResponse.setList("pp", allProduct);
		mciResponse.setViewName("index");
	}

	@RequestMapping("insertProduct")
	public void inserProduct(MciRequest mciRequest, MciResponse mciResponse){
		Map<String, Object> param = mciRequest.getParam();
		System.out.println(param);
		mciResponse.setViewName("fileView");
	}

	@RequestMapping("viewFile")
	public void viewFile(MciRequest mciRequest, MciResponse mciResponse){
		String pid = mciRequest.getParam("pid");

		mciResponse.setDownloadFile(new FileInfo("tempdir", "duke3.jpg"));

	}

	@RequestMapping("showMeAFile")
	public void show(MciRequest mciRequest, MciResponse mciResponse){
		mciResponse.setViewName("fileView");
	}

}
