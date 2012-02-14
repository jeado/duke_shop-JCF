package com.dukeShop;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dukeShop.model.Customer;
import com.dukeShop.service.CustomerService;
import com.dukeShop.sql.groovy.CustomerQuery;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class CustomerModelTest {

	private Customer customer;

	@Autowired
	private CustomerService customerService;

	@Before
	public void 셋업(){
		customer = new Customer();
		customer.setId("ddd");
		customer.setPasswd("1234");
		customer.setEmail("ddd");
		customer.setName("ddd");
		customer.setPhone("111");

	}

	/*@Test
	public void 고객_조회테스트(){
		List<Customer> queryForList = customerService.getAllCustomer();

		for (Customer customer : queryForList) {
			System.out.print(customer.getId()+" : ");
			System.out.println(customer.getPasswd());
		}
	}*/

	@Test
	public void 고객_조회테스트(){
		List<Customer> queryForList = customerService.getAllCustomer();

		for (Customer customer : queryForList) {
			System.out.print(customer.getId()+" : ");
			System.out.println(customer.getPasswd());
		}
	}

	@Test
	public void 고객검색_테스트(){

		Map<String,String> map = new HashMap<String,String>();
		map.put("id", "ddd");
		map.put("passwd","1234");
		List<Customer> queryForList = customerService.findCustomer(map);

		for (Customer customer : queryForList) {
			System.out.println(customer.getId());
		}
	}

	@Test
	public void 고객_삽입테스트(){
		customerService.insertCustomer(customer);
	}

	@Test
	public void 고객_수정테스트(){
		customerService.updateCustomer(customer);
	}

	@Test
	public void 고객_삭제테스트(){
		customerService.deleteCustomer(customer);
	}
}
