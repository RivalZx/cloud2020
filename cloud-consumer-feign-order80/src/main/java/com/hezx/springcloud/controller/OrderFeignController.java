package com.hezx.springcloud.controller;

import com.hezx.springcloud.entities.CommonResult;
import com.hezx.springcloud.entities.Payment;
import com.hezx.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-03 16:48
 **/
@RestController
public class OrderFeignController {
	
	@Resource
	PaymentFeignService paymentFeignService;
	
	@GetMapping(value = "/consumer/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
		return paymentFeignService.getPaymentById(id);
	}
	
	@GetMapping(value = "/consumer/payment/feign/timeout")
	public String paymentFeignTimeout(){
		return paymentFeignService.paymentFeignTimeout();
	}
}
