package com.hezx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2020
 * @description: 程序入口
 * @author: he-zx
 * @create: 2022-03-31 22:36
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8001 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain8001.class, args);
	}
}
