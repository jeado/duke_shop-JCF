package com.dukeShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dukeShop.service.OrdersService;


@Controller
public class OrdersController {
	@Autowired
	private OrdersService ordersservice;
}
