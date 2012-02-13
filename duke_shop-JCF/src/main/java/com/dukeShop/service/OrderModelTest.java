package com.dukeShop.service;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Orders;
import com.dukeShop.model.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class OrderModelTest {
	@Autowired
	 private OrderService orderService;
	 private Orders order;
	  @Before
	  public void 셋업(){
		  
		
	   order = new Orders();
	   order.setOid("p34jf");
	   order.setPid("p003");
	   order.setId("lovelyjhk3");
	   order.setQty(13);

	  }
	
	 @Test
	  public void 제품_입력테스트(){
	  orderService.insertOrder(order);
	  }
	@Test
	  public void 제품_수정테스트(){
	   orderService.updateOrder(order);
	  }
	@Test
	  public void 제품_삭제테스트(){
	   orderService.deleteOrder(order);
	  }
}
