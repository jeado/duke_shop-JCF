package com.dukeShop;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Customer;
import com.dukeShop.model.Orders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class OrdersModelTest {
	@Autowired
	private QueryExecutor queryExecuor;
	
	@Test
	public void 주문테스트(){

		List<Orders> queryForList =queryExecuor.queryForList("orders.select" , null ,  Orders.class );

		for(Orders orders : queryForList){

			System.out.println(orders.getOdate()); 


		}
	}

	@Test
	public void 주문_입력테스트(){

		Orders orders  =  new Orders();
	    
		orders.setPid("p003");
		orders.setQty(3);
		orders.setId("abc");
	
		queryExecuor.update("orders.insert" , orders);
		
	}

	@Test
	public void 주문_수정테스트(){

		Orders orders  =  new Orders();

		orders.setPid("p001");
		orders.setQty(1000);
		
		queryExecuor.update("orders.update" , orders);


	}

	@Test
	public void 주문_삭제테스트(){

		Orders orders  =  new Orders();

		orders.setPid("p001");
		
	
		queryExecuor.update("orders.delete" , orders);


	}













}
