package com.dukeShop;

import jcf.query.core.QueryExecutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class DukeShopTest {

	@Autowired
	private QueryExecutor queryExecutor;

	@Test
	public void 구동테스트(){
		System.out.println("구동되나?");
	}



}
