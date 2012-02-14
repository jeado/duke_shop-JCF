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


	//요청을 받아 들이는...
	//index.action으로 들어오는 요청을 처리
	@RequestMapping("index.action")
	public void showAllProduct(MciRequest mcirequest, MciResponse mciResponse){
		List <Product> allProduct = productService.getAllProduct();

		//화면쪽에 allProduct를 보내겠다 - pp라는 이름으로
		mciResponse.setList("pp", allProduct);
		//화면의 jsp 이름은 index 이다
		//
		mciResponse.setViewName("index");
	}

	@RequestMapping("insertProduct")
	public void insertProduct(MciRequest mciRequest, MciResponse mciResponse){
		Map<String, Object> param = mciRequest.getParam();
		System.out.println(param);
		mciResponse.setViewName("fileView");
	}

	@RequestMapping ("viewFile")
	public void viewFile (MciRequest mciRequest, MciResponse mciResponse){
		Map<String, Object> param = mciRequest.getParam();
		mciResponse.setDownloadFile(new FileInfo("tempdir", "maruko_2.jpg"));

	}

	@RequestMapping ("showMeAFile")
	public void show(MciRequest mciRequest, MciResponse mciResponse){
		mciResponse.setViewName("fileView");

	}


}
