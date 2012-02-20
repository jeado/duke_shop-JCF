package com.dukeShop.sql.iBatis;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class CustomerModelTest {
	@Autowired
	private QueryExecutor queryExecutor;

	@Test
	 public void 고객_입력테스트(){
		 Customer customer = new Customer();
		 customer.setId("1sdf245");
		 customer.setPasswd("1234");
		 customer.setPhone("010");
		 customer.setEmail("kdytajo");
		 customer.setName("대연이");

		 queryExecutor.update("customer.insert", customer);

	 }

	 @Test
	 public void 고객_조회테스트(){
		 List<Customer> queryForList = queryExecutor.queryForList("customer.select", null, Customer.class);
		 for(Customer customer : queryForList)
		 {
			 System.out.println(customer.getName());
		 }
	 }
	 @Test
	 public void 고객_수정테스트(){
		 Customer customer = new Customer();
		 customer.setId("aa3s4c");
		 
		 queryExecutor.update("customer.update", customer);

	 }
	 @Test
	 public void 고객_삭제테스트(){
		 Customer customer = new Customer();
		 customer.setId("123");
		 queryExecutor.update("customer.delete", customer);

	 }
	 

}
