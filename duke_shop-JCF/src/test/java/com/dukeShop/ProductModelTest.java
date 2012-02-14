package com.dukeShop;

import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Product;
import com.dukeShop.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class ProductModelTest {
	
	private Product p;
	
	@Autowired
	private ProductService productservice;
	
	@Before
	public void 셋업() {
		p=new Product();
		p.setPid("p007");
		p.setPname("똥색셔츠");
		p.setPhoto("images/s1.jpg");
		p.setDesc("똥색 셔츠입니다.");
		p.setPrice(10000);
		p.setStock(30);
	}

	@Test
	public void 제품_조회테스트() {
		List<Product> allProduct = productservice.getAllProduct();

		for(Product p: allProduct) {
			System.out.println(p.getPname());
		}
	}
	
	@Test
	public void 제품_입력테스트() {
		productservice.insertProduct(p);
	}

	@Test
	public void 제품_수정테스트() {
		productservice.updateProduct(p);
	}
	@Test
	public void 제품_삭제테스트() {
		productservice.deleteProduct(p);
	}


}
