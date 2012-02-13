package com.dukeShop;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Orders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")

public class OrdersModelTest {

	@Autowired
	private QueryExecutor queryExcutor;

	@Test
	public void 주문_입력테스트(){

		Orders orders = new Orders();
//		orders.setOid(orders_sequence.nextVal());
		orders.setPid("P015");
		orders.setId("woori");
		orders.setQty(5);
		orders.setDate("2012년2월13일");
		orders.setPrice(25000);

		queryExcutor.update("orders.insert", orders);
//		queryExcutor.queryForList("",null,Orders.class);
	}

	@Test
	public void 주문_조회테스트(){
		List<Orders> queryForListOrders = queryExcutor.queryForList("orders.select", null, Orders.class);

		for(Orders orders : queryForListOrders){
			System.out.println(orders.getId());
		}
	}
}
