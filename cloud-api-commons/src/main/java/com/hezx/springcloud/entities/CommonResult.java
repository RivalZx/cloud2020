package com.hezx.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: cloud2020
 * @description: 通用返回实体类
 * @author: he-zx
 * @create: 2022-03-31 22:59
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
	private Integer code;
	private String msg;
	private T date;
	
	public CommonResult(Integer code, String msg) {
		this(code, msg, null);
	}
}
