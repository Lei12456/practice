package com.briup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/** 
* @author 作者 angel: 
* @version 创建时间：2020年5月19日 下午9:19:28 
* 类说明 
*/
@Service
public class HelloService {
	  @Autowired
	  RedisTemplate redisTemplate;
	  
	  public void hello() {
	       ValueOperations ops = redisTemplate.opsForValue();
	        ops.set("k1", "v1");
	        Object k1 = ops.get("k1");
	        System.out.println(k1);
	    }
}
