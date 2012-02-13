package com.dukeShop;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Customer;
import com.dukeShop.model.Orders;
import com.dukeShop.model.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class ProductModelTest {
	@Autowired
	private QueryExecutor queryExcutor;

	@Test
	public void 제품_조회테스트() {
		List<Product> queryForList = queryExcutor.queryForList("product.select", null, Product.class);

		for(Product p: queryForList) {
			System.out.println(p.getPname());
		}

	}
	@Test
	public void 제품_입력테스트() {
		Product p = new Product();
		p.setPid("p006");
		p.setPname("무지개셔츠");
		p.setPhoto("images/s1.jpg");
		p.setDesc("무지개색 셔츠입니다.");
		p.setPrice(10000);
		p.setStock(30);
		queryExcutor.update("product.insert", p);
	}

	@Test
	public void 제품_수정테스트() {
		Product p = new Product();
		p.setPid("1100");
		p.setPrice(20000);
		p.setStock(8);
		queryExcutor.update("product.update", p);
	}

	public void 제품_삭제테스트() {
		Product p = new Product();
		p.setPid("p006");
		queryExcutor.update("product.delete", p);
	}


}
