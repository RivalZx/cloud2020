package com.hezx.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-01 01:21
 **/
@Configuration
public class ApplicationContextConfig {
	
	@Bean
//	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
