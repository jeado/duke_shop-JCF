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
	  orders.setOid("1021");
	  orders.setPid("p002");
	  orders.setId("yskim");
	  orders.setQty(2);
	  orders.setOdate(null);

	 }
	 @Test
	 public void 제품_조회테스트() {
	  List<Orders> allProduct = ordersService.getAllOrders();
	  for(Orders orders : allProduct) {
	   System.out.println(orders.getPid());
	  }
	 }

	 @Test
	 public void 제품_입력테스트() {
		 ordersService.insertOrders(orders);
	 }
/*
	 @Test
	 public void 제품_수정테스트() {
		 productService.updateProduct(product);
	 }

	 @Test
	 public void 제품_삭제테스트() {
		 productService.deleteProduct(product);
	 }
	 */












}
