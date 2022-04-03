package com.hezx.springcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-01 18:16
 **/
@RestController
public class OrderZkController {
	
	public static final String INVOKE_URL = "http://cloud-provider-payment";
	
	@Resource
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/consumer/payment/zk", method = RequestMethod.GET)
	public String paymentInfo(){
		return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
	}
}
