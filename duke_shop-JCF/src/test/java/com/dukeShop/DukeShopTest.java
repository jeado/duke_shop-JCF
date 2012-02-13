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
public class DukeShopTest {

	@Autowired
	private QueryExecutor queryExecutor;
	
	@Test
	public void 구동테스트 (){
		System.out.println("구동되나?");
	}
	
	@Test
	public void 제품_조회테스트(){
		List <Product> queryForList = queryExecutor.queryForList("product.select", null, Product.class);
	
	for (Product p: queryForList){
		System.out.println(p.getPname());
	}
	
	}
	
	@Test
	public void 고객_조회테스트(){
		List <Customer> queryForList = queryExecutor.queryForList("customer.select", null, Customer.class);
	System.out.println("-----------고객 정보 조회 -----------------");
	for (Customer c: queryForList){
		System.out.println(c.getName());
	}
	
	}
	
	@Test
	public void 주문_조회테스트(){
		List <Orders> queryForList = queryExecutor.queryForList("orders.select", null, Orders.class);
	System.out.println("-----------주문 정보 조회 -----------------");
	for (Orders o: queryForList){
		System.out.println(o.getId());
	}
	
	}
}
