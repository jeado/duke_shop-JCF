package com.dukeShop.controller;

import java.util.List;
import java.util.Map;

import jcf.sua.mvc.MciRequest;
import jcf.sua.mvc.MciResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dukeShop.model.Customer;
import com.dukeShop.service.CustomerService;


@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerservice;
	
	@RequestMapping("join")
	public void ShowjoinView(MciRequest mciRequest, MciResponse mciResponse) {
		mciResponse.setViewName("join_member");
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("findCustomer")
	public void findCustomer(MciRequest mciRequest,MciResponse mciResponse) {
		Map param = mciRequest.getParam();
		List<Customer> findCustomer = customerservice.findCustomer(param);
		mciResponse.setList("pp", findCustomer,Customer.class);
		
		mciResponse.setViewName("customer_list");
		
		
	}
	
	@RequestMapping("joincustomer")
	public void joinMember(MciRequest mciRequest, MciResponse mciResponse) {

		Customer param = mciRequest.getParam(Customer.class);
		System.out.println("환영합니다 "+param.getName());
		customerservice.insertCustomer(param);		
		mciResponse.set("member", param);
		mciResponse.setViewName("join_member_proc");
	}
	
}
