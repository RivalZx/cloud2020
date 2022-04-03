package com.hezx.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2020
 * @description:
 * @author: he-zx
 * @create: 2022-04-02 21:31
 **/
@Configuration
public class MySelfRule {
	
	/**
	 * 自定义Ribbon负载均衡规则
	 * @return
	 */
	@Bean
	public IRule myRule(){
		return new RandomRule();
	}
}
