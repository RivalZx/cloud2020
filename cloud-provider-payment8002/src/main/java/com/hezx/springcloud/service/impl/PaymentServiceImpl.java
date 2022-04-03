package com.hezx.springcloud.service.impl;

import com.hezx.springcloud.dao.PaymentDao;
import com.hezx.springcloud.entities.Payment;
import com.hezx.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-03-31 23:14
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Resource
	PaymentDao paymentDao;
	
	@Override
	public int create(Payment payment) {
		return paymentDao.create(payment);
	}
	
	@Override
	public Payment getPaymentById(Long id) {
		return paymentDao.getPaymentById(id);
	}
}
