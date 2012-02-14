package com.dukeShop;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.*;
import com.dukeShop.service.OrderService;
import com.dukeShop.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext-Groovy.xml")

public class OrderModelTest {
	private Orders orders;

	@Autowired
	private OrderService orderService;

	@Before
	public void 셋업(){
		orders = new Orders ();
		orders.setId("aaaa");
		orders.setPid("p005");
		orders.setQty(5);
	}


	@Test
	public void 주문_입력테스트(){
		orderService.insertOrders(orders);

	}

//	@Test
//	public void 주문_수정테스트(){
//		orderService.updateOrders(orders);
//	}

//	@Test
//	public void 주문_삭제테스트(){
//		orderService.deleteOrders(orders);
//	}

	@Test
	public void 주문_조회테스트(){
		List <Orders> allOrders = orderService.getAllOrders();
	System.out.println("-----------주문 정보 조회 -----------------");
	for (Orders o: allOrders){
		System.out.println(o.getId());
	}
	}
}
