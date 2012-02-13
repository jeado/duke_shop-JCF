package com.dukeShop;

import java.util.List;

import jcf.query.core.QueryExecutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")

public class OrderModelTest {
	@Autowired
	private QueryExecutor queryExecutor;
	
	@Test
	public void 주문_입력테스트(){
		Orders o = new Orders ();
		o.setId("aaaa");
		o.setPid("p005");
		o.setOdate("20120213");
		o.setQty(5);
		
		queryExecutor.update("orders.insert", o);
	}
	
	@Test
	public void 주문_수정테스트(){
		Orders o = new Orders ();
		o.setId("aaaa");
		o.setOid("40");
		o.setPid("p005");
		o.setOdate("20120213");
		o.setPhoto("images/s1.jpg");
		o.setPrice(1000);
		o.setQty(7);
		
		queryExecutor.update("orders.update", o);
	}
	
	@Test
	public void 주문_삭제테스트(){
		Orders o = new Orders ();
		o.setId("aaaa");
		queryExecutor.update("orders.delete", o);
	}
	
	@Test
	public void 주문_조회테스트(){
		List <Orders> queryForList = queryExecutor.queryForList("orders.select", null, Orders.class);
	System.out.println("-----------주문 정보 조회 -----------------");
	for (Orders o: queryForList){
		System.out.println(o.getId());
	}
	}
}
