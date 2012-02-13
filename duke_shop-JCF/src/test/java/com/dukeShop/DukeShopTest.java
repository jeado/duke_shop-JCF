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
	
	@Test
	public void 고객_입력테스트(){
		Customer customer = new Customer ();
		customer.setId("bbbbbbbb");
		customer.setPasswd("1111");
		customer.setEmail("andycloudy@msn.com");
		customer.setName("sumin");
		customer.setPhone("4332377");
		queryExecutor.update("customer.insert", customer);
	}
	
	@Test
	public void 고객_삭제테스트(){
		Customer customer = new Customer ();
		customer.setId("bbbbbbbb");
		queryExecutor.update("customer.delete", customer);
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
	public void 주문_입력테스트(){
		Orders o = new Orders ();
		o.setId("aaaa");
		o.setOid("40");
		o.setPid("p005");
		o.setOdate("20120213");
		o.setQty(5);
		
		queryExecutor.update("orders.insert", o);
	}
	
	@Test
	public void 주문_삭제테스트(){
		Orders o = new Orders ();
		o.setId("aaaa");
		queryExecutor.update("orders.delete", o);
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
