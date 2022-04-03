package com.hezx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-01 18:14
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain {
	public static void main(String[] args) {
		SpringApplication.run(OrderZkMain.class, args);
	}
}
