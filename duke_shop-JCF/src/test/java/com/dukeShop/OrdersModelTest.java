package com.dukeShop;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Orders;
import com.dukeShop.service.OrdersService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")

public class OrdersModelTest {

	@Autowired
	private OrdersService ordersService;

	private Orders orders;

	@Before
	public void 셋업(){
		orders = new Orders();
//		orders.setOid(orders_sequence.nextVal());
		orders.setPid("P015");
		orders.setId("woori");
		orders.setQty(5);
		orders.setDate("2012년2월13일");
		orders.setPrice(25000);
	}

	@Test
	public void 주문_입력테스트(){

		ordersService.insertOrders(orders);
	}

	@Test
	public void 주문_조회테스트(){
		List<Orders> allOrders = ordersService.getAllOrders();

		for(Orders orders : allOrders){
			System.out.println(orders.getPid());
		}
	}
}
