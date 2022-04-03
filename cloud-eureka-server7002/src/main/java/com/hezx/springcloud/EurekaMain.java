package com.hezx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-01 12:18
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableEurekaServer
public class EurekaMain {
	public static void main(String[] args) {
		SpringApplication.run(EurekaMain.class, args);
	}
}
