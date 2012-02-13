package com.dukeShop.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Customer;
import com.dukeShop.model.Orders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class CustomerModelTest {
	@Autowired
	 private CustomerService customerService;
	 private Customer customer;
	  @Before
	  public void 셋업(){
		  
		  customer = new Customer();

		  customer.setPid("szo3l");
		  customer.setPasswd("p003");
		  customer.setPhone("lovelyjhk3");
		  customer.setEmail("asdasdkf@");
		  customer.setName("문하늬");
	  }
	
	 @Test
	  public void 제품_입력테스트(){
	  customerService.insertCustomer(customer);
	  }
	@Test
	  public void 제품_수정테스트(){
		customerService.updateCustomer(customer);
	  }
	@Test
	  public void 제품_삭제테스트(){
		customerService.deleteCustomer(customer);
	  }
}
