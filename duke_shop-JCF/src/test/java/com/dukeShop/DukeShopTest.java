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
import com.dukeShop.model.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class DukeShopTest {

	private QueryExecutor executor;

	@Autowired
	private QueryExecutor queryExecutor;
	@Test
	public void 구동테스트(){
		System.out.println("구동되나?");
	}

	@Test
	public void 제품_조회테스트(){
		List<Product> queryForList=queryExecutor.queryForList("product.select",null,Product.class);
		for(Product product:queryForList){
		System.out.println(product.getPname());
		}
	}


	@Test
	public void 제품_입력테스트(){
		//Customer customer=new Customer("kk","1111","0303-330-23","lovelyjhk@dd","nkim");
				Product pro = new Product();
				//pid, pname, photo, description, price, stock
				pro.setPid("3rfk");
				pro.setPname("235");
				pro.setPrice(5000);
				pro.setStock(500);
				pro.setPhoto(".d");
				pro.setDescription("아힘들어");

				queryExecutor.update("product.insert",pro);
	}
	@Test
	public void 고객_입력테스트(){
		//Customer customer=new Customer("kk","1111","0303-330-23","lovelyjhk@dd","nkim");
		//pid, passwd, phone, email, name
		Customer custom = new Customer();
		custom.setPid("33");
		custom.setPasswd("1f");
		custom.setPhone("03s-23");
		custom.setEmail("1sk@dd");
		custom.setName("y");

		queryExecutor.update("customer.insert",custom);
	}
	@Test
	public void 고객_조회테스트(){
		List<Customer> queryForList=queryExecutor.queryForList("customer.select",null,Customer.class);
		for(Customer customer:queryForList){
			System.out.println("customer.getName()"+customer.getName());
			}
	}


	@Test
	public void 주문_조회테스트(){
		List<Orders> queryForList=queryExecutor.queryForList("order.select",null,Orders.class);
		for(Orders order:queryForList){
		System.out.println("order.getOid()"+order.getId());
		}
	}

	@Test
	public void 주문_입력테스트(){
		Orders order = new Orders();
		order.setDate("2012-12-11");
		order.setId("kkeid");
		order.setOid("5s4f5sd4f");
		order.setPid("p001");
		order.setQty(33);

		queryExecutor.update("order.insert",order);

	}
}
