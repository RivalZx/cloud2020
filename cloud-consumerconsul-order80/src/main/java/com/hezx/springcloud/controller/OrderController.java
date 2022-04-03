package com.hezx.springcloud.controller;

import com.hezx.springcloud.entities.CommonResult;
import com.hezx.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-01 01:23
 **/
@RestController
@Slf4j
public class OrderController {
	
//	public static final String PAYMENT_URL = "http://localhost:8001";
	public static final String PAYMENT_URL = "http://cloud-provider-payment";
	
	@Resource
	private RestTemplate restTemplate;
	
	@GetMapping("/consumer/consul")
	public String orderConsul(){
		return restTemplate.getForObject(PAYMENT_URL + "/payment/consul", String.class);
	}

}
