package com.hezx.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-03 15:57
 **/
public interface LoadBalancer {
	ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
