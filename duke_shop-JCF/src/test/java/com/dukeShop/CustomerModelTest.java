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
	private QueryExecutor queryExcutor;

	@Test
	public void 고객_조회테스트() {
		List<Customer> queryForList = queryExcutor.queryForList("customer.select", null, Customer.class);

		for(Customer p: queryForList) {
			System.out.println(p.getName());
		}

	}
	@Test
	public void 고객_입력테스트() {
		Customer c = new Customer();
		c.setUserId("aaaqwe");
		c.setName("aggg");
		c.setPassword("111");
		c.setPhone("0000");
		c.setEmail("email");
		queryExcutor.update("customer.insert", c);
	}

	@Test
	public void 고객_수정테스트() {
		Customer c = new Customer();
		c.setName("gggggg");
		c.setEmail("aeytew");
		c.setPhone("151255");
		queryExcutor.update("customer.update", c);
	}
	@Test
	public void 고객_삭제테스트() {
		Customer c = new Customer();
		c.setUserId("aa");
		queryExcutor.update("customer.delete", c);
	}

}
