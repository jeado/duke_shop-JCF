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
	private QueryExecutor queryExcutor;

	@Test
	public void 주문_조회테스트() {
		List<Orders> queryForList = queryExcutor.queryForList("orders.select", null, Orders.class);

		for(Orders p: queryForList) {
			System.out.println(p.getPid());
		}

	}

	@Test
	public void 주문_입력테스트() {
		Orders o = new Orders();

		o.setPid("p001");
		o.setId("yskim");
		o.setQty(2);

		queryExcutor.update("orders.insert", o);
	}

	@Test
	public void 주문_수정테스트() {
		Orders o = new Orders();
		o.setOid("1100");
		o.setPid("p002");
		o.setQty(5);
		queryExcutor.update("orders.update", o);
	}
	public void 주문_삭제테스트() {
		Orders o = new Orders();
		o.setPid("1100");
		queryExcutor.update("orders.delete", o);
	}

}
