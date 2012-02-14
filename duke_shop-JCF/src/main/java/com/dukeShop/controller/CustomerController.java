package com.dukeShop.controller;

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

	//이 customercontoller는 customerserivce를 사용한다는 명시로
	// 프레임웍에서 객체를 생성하여 만들어 준다
	@Autowired
	private CustomerService customerService;


	//.action을 적지 않아도 이 곳으로 연결 시킨다
	@RequestMapping("join")
	public void showJoinView (MciRequest mciRequest, MciResponse mciResponse){
		mciResponse.setViewName("join_member");

	}

	@RequestMapping("joinCustomer")
	public void joinMember (MciRequest mciRequest, MciResponse mciResponse){
		//Map<String, Object> param = mciRequest.getParam();

		Customer param = mciRequest.getParam(Customer.class);

		customerService.insertCustomer(param);
		System.out.println("환영합니다");

		String param3 = mciRequest.getParam("phone");
		System.out.println("------------------------------------------------------");

		System.out.println(param);
		System.out.println("------------------------------------------------------");

		//System.out.println(param2);
		System.out.println("------------------------------------------------------");

		System.out.println(param3);
		System.out.println("------------------------------------------------------");

		//mciResponse.set("member", param, Map.class);
		mciResponse.set("member", param);
		mciResponse.setViewName("join_member_proc");

	}

}
