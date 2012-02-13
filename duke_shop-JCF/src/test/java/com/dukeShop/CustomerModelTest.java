package com.dukeShop;

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
	private QueryExecutor queryExecuor;
	
	@Test
	public void 고객테스트(){

		List<Customer> queryForList =queryExecuor.queryForList("customer.select" , null ,  Customer.class );

		for(Customer customer : queryForList){

			System.out.println(customer.getId());


		}
	}

	@Test
	public void 고객정보_입력테스트(){

		Customer customer  =  new Customer();

		customer.setId("abc");
		customer.setPasswd("1111");
		customer.setName("김윤희또라");
		customer.setEmail("abcd");
		customer.setPhone("010-5236-1593");

		queryExecuor.update("customer.insert" , customer);


	}


	@Test
	public void 고객정보_수정테스트(){

		Customer customer  =  new Customer();

		customer.setId("abc");
		customer.setEmail("bbb");
		
		queryExecuor.update("customer.update" , customer);


	}

	@Test
	public void 고객정보_삭제테스트(){

		Customer customer  =  new Customer();

		customer.setId("moon");
		
	
		queryExecuor.update("customer.delete" , customer);


	}

	
	










}
