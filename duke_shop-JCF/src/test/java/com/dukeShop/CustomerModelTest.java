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

public class CustomerModelTest {
	@Autowired
	private QueryExecutor queryExecutor;
	
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
	public void 고객_수정테스트(){
		Customer customer = new Customer ();
		customer.setId("bbbbbbbb");
		customer.setPasswd("111111111");
		customer.setEmail("andycloudy@naver.com");
		customer.setName("phasoot");
		customer.setPhone("4330000");
		queryExecutor.update("customer.update", customer);
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
}
