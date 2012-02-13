package com.dukeShop;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Customer;
import com.dukeShop.model.Orders;
import com.dukeShop.model.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class DukeShopTest {
	@Autowired
	private QueryExecutor queryExcutor;

	@Test
	public void 구동테스트() {
		System.out.println("구동되나?");
	}

	@Test
	public void 조회테스트() {
		List<Product> queryForList = queryExcutor.queryForList("product.select", null, Product.class);

		for(Product p: queryForList) {
			System.out.println(p.getPname());
		}

	}

	@Test
	public void 조회테스트2() {
		List<Orders> queryForList = queryExcutor.queryForList("orders.select", null, Orders.class);

		for(Orders p: queryForList) {
			System.out.println(p.getPid());
		}

	}

	@Test
	public void 조회테스트3() {
		List<Customer> queryForList = queryExcutor.queryForList("customer.select", null, Customer.class);

		for(Customer p: queryForList) {
			System.out.println(p.getName());
		}

	}


}
