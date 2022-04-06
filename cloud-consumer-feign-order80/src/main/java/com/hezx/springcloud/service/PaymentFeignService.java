package com.hezx.springcloud.service;

import com.hezx.springcloud.entities.CommonResult;
import com.hezx.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-03 16:42
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
	
	@GetMapping(value = "/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
	
	@GetMapping(value = "/payment/feign/timeout")
	public String paymentFeignTimeout();
}
