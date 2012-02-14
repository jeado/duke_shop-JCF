package com.dukeShop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
	private Customer c;
	
	@Autowired
	private CustomerService customerservice;

	@Before
	public void 셋업() {
		c = new Customer();
		c.setId("qwe");
		c.setPhone("0000");
		c.setEmail("email");
		c.setName("agqwegg");
		c.setPasswd("111");	
	}
	
	@Test
	public void 고객_조회테스트() {
		List<Customer> allCustomer = customerservice.getAllCustomer();

		for(Customer c: allCustomer) {
			System.out.println(c.getName());
		}

	}

	@Test
	public void 고객검색테스트()
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "shin");
		List<Customer> findCustomer = customerservice.findCustomer(map);
		
		for(Customer c : findCustomer)
		{
			System.out.println(c.getId());
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
