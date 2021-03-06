package com.hezx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-07 14:23
 **/
@SpringBootApplication
@EnableFeignClients
public class OrderHystrixMain80 {
	public static void main(String[] args) {
		SpringApplication.run(OrderHystrixMain80.class, args);
	}
}
