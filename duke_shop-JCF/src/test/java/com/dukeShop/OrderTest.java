package com.dukeShop;

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

public class OrderTest {
	private Orders orders;


	@Autowired
	private OrderService orderService;

	private String oid;
	private String pid;
	private String id;
	private int qty;
	private String odate;
	 @Before
	 public void 셋업(){
		 orders = new Orders();
		 //orders.setOid("tesst");
		 orders.setId("d4e2");
		 orders.setPid("10");
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

	 @Test
	 public void 제품_수정테스트(){
		 orderService.updateOrders(orders);
	 }
	 @Test
	 public void 제품_삭제테스트(){
		 orderService.deleteOrders(orders);
	 }


}
