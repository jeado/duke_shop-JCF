package com.dukeShop.sql.iBatis;

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
@ContextConfiguration("classpath:config/applicationContext.xml")
public class CustomerModelTest {

	private Customer customer;


	@Autowired
	private CustomerService customerService;

	 @Before
	 public void 셋업(){
		 customer = new Customer();
		 customer.setId("tesst");
		 customer.setPasswd("d4e2");
		 customer.setName("10");
		 customer.setEmail("kdy");
		  customer.setPhone("123");

	 }
	 @Test
	 public void 제품_조회테스트(){
		 List<Customer> allProduct = customerService.getAllProduct();
				 for(Customer customer : allProduct){
					 System.out.println(customer.getId());
				 }
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
