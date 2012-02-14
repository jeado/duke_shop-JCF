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
public class OrderModelTest {

	@Autowired
	private QueryExecutor queryExecutor;

	@Test
	public void 주문_조회테스트(){
		List<Orders> queryForList = queryExecutor.queryForList("orders.select", null, Orders.class);

		for (Orders order : queryForList) {
			System.out.println("["+order.getOid()+"]"+order.getId()+"가 "+order.getPid()+"를 주문");
		}
	}
	
	@Test
	public void 주문정보_입력테스트(){
		queryExecutor.update("orders.insert", new Orders(null, "p001", "haibane", 2, null));
	}
	
	@Test
	public void 주문정보_수정테스트(){
		
	}
}
