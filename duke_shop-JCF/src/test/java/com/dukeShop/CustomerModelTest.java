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
import com.dukeShop.service.CustomerService;
import com.dukeShop.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")

public class CustomerModelTest {

	private Customer customer;

	@Autowired
	private CustomerService customerService;

	@Before
	public void 셋업(){
		customer = new Customer();
		customer.setId("axzcd");
		customer.setPasswd("2222");
		customer.setEmail("andycloudy@msn.com");
		customer.setName("sumin");
		customer.setPhone("4332377");
	}


	@Test
	public void 고객_입력테스트(){
		customerService.insertCustomer(customer);
	}

	@Test
	public void 고객_수정테스트(){
		customerService.updateCustomer(customer);
	}

	@Test
	public void 고객_삭제테스트(){
		customerService.deleteCustomer(customer);
	}

	@Test
	public void 고객_조회테스트(){
		List <Customer> allCustomer = customerService.getAllCustomer();
	System.out.println("-----------고객 정보 조회 -----------------");
	for (Customer c: allCustomer){
		System.out.println(c.getName());
		}

	}
}
