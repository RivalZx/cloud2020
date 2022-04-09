package com.hezx.springcloud.controller;

import com.hezx.springcloud.service.OrderHystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-07 14:26
 **/
@RestController
public class OrderHystrixController {
	
	@Resource
	private OrderHystrixService orderHystrixService;
	
	@GetMapping("/consumer/payment/hystrix/ok/{id}")
	public String paymentInfo_OK(@PathVariable("id") Integer id){
		return orderHystrixService.payment_OK(id);
	}
	
	@GetMapping("/consumer/payment/hystrix/timeout/")
	public String paymentInfo_Timeout(){
		return orderHystrixService.payment_Timeout();
	}
}
