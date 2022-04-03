package com.hezx.springcloud.dao;

import com.hezx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-03-31 23:02
 **/
@Mapper
public interface PaymentDao {
	
	public int create(Payment payment);
	
	public Payment getPaymentById(@Param("id") Long id);

}
