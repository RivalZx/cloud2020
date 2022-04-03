package com.hezx.springcloud.service;

import com.hezx.springcloud.entities.Payment;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-03-31 23:13
 **/
public interface PaymentService {
	public int create(Payment payment);
	
	public Payment getPaymentById(Long id);
}
