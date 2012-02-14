package com.dukeShop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jcf.query.core.QueryExecutor;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Customer;
import com.dukeShop.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class CustomerModelTest {


	@Autowired
	private CustomerService customerService;
	private Customer customer;

	@Before
	public void 셋업(){
		customer = new Customer();
		customer.setEmail("haibane84@gmail.com");
		customer.setId("haibanee");
		customer.setName("jeado");
		customer.setPasswd("nullsss");
		customer.setPhone("00000000");

	}

	@Test
	public void 고객_조회테스트(){
		List<Customer> allCustomer = customerService.getAllCustomer();
		for (Customer customer : allCustomer) {

			System.out.println(customer.getId());
		}
	}

	@Test
	public void 고객검색_테스트(){

		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "haibane");
		List<Customer> findCustomer = customerService.findCustomer(null);

		for (Customer customer : findCustomer) {
			System.out.println(customer.getName());
		}

	}

	@Test
	public void 고객정보_입력테스트(){
		customerService.insertCustomer(customer);
	}

	@Test
	public void 고객정보_수정테스트(){

	}

	public void 고객정보_삭제테스트(){

	}

}
