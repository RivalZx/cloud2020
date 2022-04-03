package com.hezx.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: cloud2020
 * @description: payment实体类
 * @author: he-zx
 * @create: 2022-03-31 22:57
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {
	private Long id;
	private String serial;
}
