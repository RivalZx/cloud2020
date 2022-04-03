package com.hezx.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-03-31 23:15
**/
@Slf4j
@RestController
public class PaymentController {

	@Value("${server.port}")
	private String serverPort;

	@RequestMapping(value = "/payment/zk")
	public String paymentZk(){
		return "springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
	}
	
}
