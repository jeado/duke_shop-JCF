package com.dukeShop;

import java.util.List;

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

public class OrderModelTest {
	private Orders o;
	@Autowired
	private OrdersService ordersserivce;

	
	@Before
	public void 셋업() {
		o = new Orders();
		o.setPid("p001");
		o.setId("yskim");
		o.setQty(2);
	}
	
	@Test
	public void 주문_조회테스트() {
		List<Orders> allOrders = ordersserivce.getAllOrders();
	
		for(Orders p: allOrders) {
			System.out.println(p.getOid());
		}

	}

	@Test
	public void 주문_입력테스트() {
		ordersserivce.insertOrders(o);
	}

//	@Test
//	public void 주문_수정테스트() {
//		ordersserivce.updateOrders(o);
//	}
//	public void 주문_삭제테스트() {
//		ordersserivce.deleteOrders(o);
//	}

}
