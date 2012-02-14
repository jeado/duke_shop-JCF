package com.dukeShop;

import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Customer;
import com.dukeShop.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration("classpath:config/applicationContext.xml")
@ContextConfiguration("classpath:config/applicationContext-Groovy.xml")

public class CustomerModelTest {
	private Customer c;
	@Autowired
	private CustomerService customerservice;

	@Before
	public void 셋업() {
		c = new Customer();
		c.setUserId("ab");
		c.setName("aggg");
		c.setPassword("111");
		c.setPhone("0000");
		c.setEmail("email");
	}
	
	@Test
	public void 고객_조회테스트() { // Groovy를 이용.
		
		List<Customer> allCustomer = customerservice.getAllCustomer();
		for(Customer c : allCustomer){
			System.out.println(c.getName());
		}
	}
	@Test
	public void 고객_입력테스트() {
		customerservice.insertCustomer(c);
	}

	@Test
	public void 고객_수정테스트() {
		customerservice.updateCustomer(c);
	}
	@Test
	public void 고객_삭제테스트() {
		customerservice.deleteCustomer(c);
	}

}
