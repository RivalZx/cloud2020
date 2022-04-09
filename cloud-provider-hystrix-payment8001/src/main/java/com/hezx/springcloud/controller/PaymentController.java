package com.hezx.springcloud.controller;

import com.hezx.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-06 23:57
 **/
@RestController
@Slf4j
public class PaymentController {
	
	@Resource
	private PaymentService paymentService;

	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping(value = "/payment/hystrix/ok/{id}")
	public String payment_OK(@PathVariable("id") Integer id) {
		return paymentService.payment_OK(id);
	}
	
	@GetMapping(value = "/payment/hystrix/timeout/")
	public String payment_Timeout() {
		return paymentService.payment_Timeout();
	}
	
}
