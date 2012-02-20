package com.dukeShop.sql.iBatis;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Orders;
import com.dukeShop.model.Product;
import com.dukeShop.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")

public class OrderModelTest {
	private Orders orders;


	@Autowired
	private OrderService orderService;

	 @Before
	 public void 셋업(){
		 orders = new Orders();
		 orders.setOid("1015");
		 orders.setId("aaaa");
		 orders.setPid("p003");
		 orders.setQty(2);
		 orders.setDate(null);

	 }
	 @Test
	 public void 제품_조회테스트(){
		 List<Orders> allProduct = orderService.getAllProduct();
				 for(Orders orders : allProduct){
					 System.out.println(orders.getPid());
				 }
	 }
	@Test
	 public void 제품_입력테스트(){
		orderService.insertOrders(orders);
	 }
/*
	 @Test
	 public void 제품_수정테스트(){
		 orderService.updateOrders(orders);
	 }
	 @Test
	 public void 제품_삭제테스트(){
		 orderService.deleteOrders(orders);
	 }
*/

}
