package com.hezx.springcloud.controller;

import com.hezx.springcloud.entities.CommonResult;
import com.hezx.springcloud.entities.Payment;
import com.hezx.springcloud.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-01 01:23
 **/
@RestController
@Slf4j
public class OrderController {
	
//	public static final String PAYMENT_URL = "http://localhost:8001";
	public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
	
	@Resource
	private RestTemplate restTemplate;
	
	@Resource
	private LoadBalancer loadBalancer;
	
	@Resource
	private DiscoveryClient discoveryClient;
	
	@GetMapping("/consumer/payment/create")
	public CommonResult<Payment> create(Payment payment){
		return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
	}
	
	@GetMapping("/consumer/payment/get/{id}")
	public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
		ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
		HttpStatus statusCode = entity.getStatusCode();
		int statusCodeValue = entity.getStatusCodeValue();
		if (statusCode.is2xxSuccessful()) {
			return entity.getBody();
		} else {
			return new CommonResult<>(444, "操作失败");
		}
		
//		return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
	}
	
	@GetMapping(value = "/consumer/payment/lb")
	public String getPaymentById(){
		List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
		if (instances == null || instances.size() <= 0)
			return null;
		ServiceInstance instance = loadBalancer.instances(instances);
		URI uri = instance.getUri();
		return restTemplate.getForObject(uri + "/payment/lb", String.class);
	}
}
