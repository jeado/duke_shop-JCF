package com.dukeShop;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.*;
import com.dukeShop.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")

public class ProductModelTest {

	private Product product;

	@Autowired
	private ProductService productService;

	@Before
	public void 셋업(){
		product = new Product ();
		product.setPid("p007");
		product.setPname("안밝은셔츠");
		product.setPhoto("images/s1.jpg");
		product.setDescription("바보");
		product.setPrice(20000);
		product.setStock(10000);
	}

	@Test
	public void 제품_조회테스트(){
		List <Product> allProduct = productService.getAllProduct();
		System.out.println("-----------제품 정보 조회 -----------------");
		for (Product p: allProduct){
			System.out.println(p.getPid());
		}

	}

	@Test
	public void 제품_입력테스트(){
		productService.insertProduct(product);
	}

	@Test
	public void 제품_수정테스트(){
		productService.updateProduct(product);
	}

	@Test
	public void 제품_삭제테스트(){
		productService.deleteProduct(product);
	}


}
