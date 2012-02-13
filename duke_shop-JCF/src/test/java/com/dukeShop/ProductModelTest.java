package com.dukeShop;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")

public class ProductModelTest {
	@Autowired
	private QueryExecutor queryExecutor;
	
	
	@Test
	public void 제품_입력테스트(){
		Product p = new Product ();
		p.setPid("p006");
		p.setPname("밝은셔츠");
		p.setPhoto("images/s1.jpg");
		p.setDescription("바보");
		p.setPrice(20000);
		p.setStock(10000);
		queryExecutor.update("product.insert", p);
	}
	
	@Test
	public void 제품_수정테스트(){
		Product p = new Product ();
		p.setPid("p006");
		p.setPname("밝은셔츠");
		p.setPhoto("images/s1.jpg");
		p.setDescription("바보");
		p.setPrice(40000000);
		p.setStock(10000);
		queryExecutor.update("product.insert", p);
	}
	
	@Test
	public void 제품_삭제테스트(){
		Product p = new Product ();
		p.setPid("p006");
		queryExecutor.update("product.delete", p);
	}
	
	@Test
	public void 제품_조회테스트(){
		List <Product> queryForList = queryExecutor.queryForList("product.select", null, Product.class);
	
	for (Product p: queryForList){
		System.out.println(p.getPname());
	}
	
	}
}
