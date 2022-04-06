package com.hezx.springcloud;

import org.aspectj.weaver.ast.Or;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-03 16:41
 **/
@SpringBootApplication
//使用feign
@EnableFeignClients
public class OrderFeignMain80 {
	public static void main(String[] args) {
		SpringApplication.run(OrderFeignMain80.class, args);
	}
}
