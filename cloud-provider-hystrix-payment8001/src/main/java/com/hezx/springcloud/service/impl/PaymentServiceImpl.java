package com.hezx.springcloud.service.impl;

import com.hezx.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-06 23:56
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
	@Override
	public String payment_OK(Integer id) {
		return "ok!";
	}
	
	@Override
	@HystrixCommand(fallbackMethod = "payment_TimeoutHandler", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
	})
	public String payment_Timeout() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "3秒后返回";
	}
	
	public String payment_TimeoutHandler() {
		try {
			TimeUnit.SECONDS.sleep(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "5秒后返回";
	}
	
}
