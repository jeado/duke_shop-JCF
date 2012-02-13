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
	private QueryExecutor queryExecutor;

	@Test
	public void 구동테스트(){
		System.out.println("구동되나?");
	}

	@Test
	public void 제품_조회테스트(){
		List<Product> queryForList = queryExecutor.queryForList("product.select",null, Product.class);

		for (Product product : queryForList) {

			System.out.println(product.getPname());
		}
	}

	@Test
	public void 고객_조회테스트(){
		List<Customer> queryForList = queryExecutor.queryForList("customer.select", null, Customer.class);

		for (Customer customer : queryForList) {
			System.out.println(customer.getName());
		}
	}

	@Test
	public void 주문_조회테스트(){
		List<Orders> queryForList = queryExecutor.queryForList("orders.select", null, Orders.class);

		for (Orders order : queryForList) {
			System.out.println(order.getId());
		}
	}
}
