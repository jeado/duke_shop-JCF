package com.dukeShop;

import jcf.query.core.QueryExecutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Customer;
import com.dukeShop.model.Orders;
import com.dukeShop.model.Product;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

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
	public void 조회테스트(){
		java.util.List<Product> queryForList = queryExecutor.queryForList("product.select" ,null, Product.class);

		for(Product product : queryForList){
			System.out.println(product.getPname());
		}
}

	@Test
	public void 조회테스트2(){
		java.util.List<Orders> queryForList = queryExecutor.queryForList("Orders.select" ,null, Orders.class);

			for(Orders order : queryForList){
				System.out.println(order.getPid());
			}

	}

	@Test
	public void 조회테스트3(){
		java.util.List<Customer> queryForList = queryExecutor.queryForList("Customer.select" ,null, Customer.class);

			for(Customer customer : queryForList){
				System.out.println(customer.getId());
			}

	}

}
