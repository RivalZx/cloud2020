package com.hezx.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-07 14:24
 **/
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT")
public interface OrderHystrixService {
	
	@GetMapping(value = "/payment/hystrix/ok/{id}")
	public String payment_OK(@PathVariable("id") Integer id);
	
	@GetMapping(value = "/payment/hystrix/timeout/")
	public String payment_Timeout();
}
