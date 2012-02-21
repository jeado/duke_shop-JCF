package com.dukeShop.sql.iBatis;

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

	private Customer customer;


	@Autowired
	private CustomerService customerService;

	 @Before
	 public void 셋업(){
		 customer = new Customer();
		 customer.setId("0333");
		 customer.setPasswd("ds4e2");
		 customer.setName("10");
		 customer.setEmail("kdy");
		 customer.setPhone("123");
	 }
	 @Test
	 public void 고객_조회테스트(){
		 List<Customer> allProduct = customerService.getAllProduct();
				 for(Customer customer : allProduct){
					 System.out.println(customer.getId());
				 }
	 }
	 @Test
	 public void 고객_검색테스트(){

		 Map<String, String> map = new HashMap<String, String>();
		 map.put("id", "아이디");
		customerService.findCustomers(map);
		List<Customer> findCustomer = customerService.findCustomers(null);
		for(Customer customer : findCustomer)
		{
			System.out.println(customer.getName());
		}
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

}
