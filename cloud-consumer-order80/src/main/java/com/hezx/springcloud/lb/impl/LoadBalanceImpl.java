package com.hezx.springcloud.lb.impl;

import com.hezx.springcloud.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-03 16:01
 **/
@Service
public class LoadBalanceImpl implements LoadBalancer {
	
	private AtomicInteger atomicInteger = new AtomicInteger(0);
	
	public final int getAndIncrement(){
		int current;
		int next;
		
		do {
			current = atomicInteger.get();
			next = current >= Integer.MAX_VALUE ? 0 : current + 1;
		} while (!this.atomicInteger.compareAndSet(current, next));
		
		return next;
	}
	
	@Override
	public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
		int index = getAndIncrement() % serviceInstances.size();
		return serviceInstances.get(index);
	}
}
