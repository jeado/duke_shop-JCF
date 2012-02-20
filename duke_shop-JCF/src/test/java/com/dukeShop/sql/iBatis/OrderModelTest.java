package com.dukeShop.sql.iBatis;

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
	 public void 주문_입력테스트(){
		 Orders orders = new Orders();
		 orders.setOid("1042");
		 orders.setPid("p001");
		 orders.setId("1234");
		 orders.setQty(12);
		 orders.setDate("120218");
		 
		 
		 queryExecutor.update("orders.insert", orders);
		
	 }
	 
	 @Test
	 public void 주문_조회테스트(){
		 List<Orders> queryForList = queryExecutor.queryForList("orders.select", null, Orders.class);
		 for(Orders orders : queryForList)
		 {
			 System.out.println(orders.getDate());
		 }
	 }

}
