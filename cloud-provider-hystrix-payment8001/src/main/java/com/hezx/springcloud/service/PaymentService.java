package com.hezx.springcloud.service;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-06 23:55
 **/
public interface PaymentService {
	
	public String payment_OK(Integer id);
	
	public String payment_Timeout();
	
}
