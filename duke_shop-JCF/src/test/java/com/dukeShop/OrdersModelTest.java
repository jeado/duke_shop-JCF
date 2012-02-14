package com.dukeShop;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Customer;
import com.dukeShop.model.Orders;
import com.dukeShop.service.OrdersService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class OrdersModelTest {

	private Orders orders;

	@Autowired
	private OrdersService ordersService;
	
	@Before
	public void 셋업(){
		orders = new Orders();
		orders.setId("kim");
		orders.setQty(3);
		orders.setPid("p001");
	}

	@Test
	public void 주문_조회테스트(){
		List<Orders> queryForList = ordersService.getAllOrders();
		for (Orders orders : queryForList) {
			System.out.print(orders.getOid()+" : ");
			System.out.print(orders.getPid()+" : ");
			System.out.println(orders.getQty());
		}
	}

	@Test
	public void 주문_삽입테스트(){

		ordersService.insertOrders(orders);

	}

	@Test
	public void 주문_수정테스트(){
		ordersService.updateOrders(orders);
	}

	@Test
	public void 주문_삭제테스트(){
		ordersService.deleteOrders(orders);
	}



}
