package com.hezx.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-01 18:39
 **/
@RestController
@Slf4j
public class PaymentController {
	
	@Value("${server.port}")
	private String serverPort;
	
	@RequestMapping(value = "/payment/consul")
	public String paymentConsul(){
		return "springcloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
	}
	
}
