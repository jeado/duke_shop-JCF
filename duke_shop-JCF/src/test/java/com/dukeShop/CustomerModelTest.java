package com.dukeShop;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Customer;
import com.dukeShop.model.Product;
import com.dukeShop.service.CustomerService;
import com.dukeShop.service.ProductService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class CustomerModelTest {
	@Autowired
	private QueryExecutor queryExecuor;

	private Customer customer;

	@Autowired
	private CustomerService customerService;




	@Before
	public void 셋업(){
		customer = new Customer();
		customer.setId("ddddf");
		customer.setPasswd("12345");
		customer.setName("skskskk");
		customer.setEmail("dfdfdf");
		customer.setPhone("010-52356713444");
	}
	@Test
	public void 제품_조회테스트() {
		List<Customer> allCustomer = customerService.getAllCustomer();
		for(Customer customer : allCustomer) {
			System.out.println(customer.getId());
		}
	}

	@Test
	public void 제품_입력테스트() {
		customerService.insertCustomer(customer);
	}

	@Test
	public void 제품_수정테스트() {
		customerService.updateCustomer(customer);
	}

	@Test
	public void 제품_삭제테스트() {
		customerService.deleteCustomer(customer);
	}







}
