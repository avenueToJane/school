package com.westlife.demo.service;

import org.springframework.stereotype.Component;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import javax.annotation.Resource;
/**
 * StringRedisTemplate、RedisTemplate这两个模板来介绍，其中StringRedisTemplate继承自RedisTemplate，
 *            只能操作键值都是String类型的数据。在实际开发中建议使用RedisTemplate<K,V>。
 *            查询源码可知RedisTemplate默认使用JdkSerializationRedisSerializer序列化，
 *            而StringRedisTemplate则使用StringRedisSerializer
 * @author  westlife
 * @date 创建时间：2017年12月15日 下午4:34:31 
 * @version 1.0 
 * @parameter
 *
 */
@Component
public class RedisService {
	protected static final Logger logger = LoggerFactory.getLogger(RedisService.class);
	/**
	 * StringRedisTemplate模板 ValueOperations这个接口的实现类为:DefaultValueOperations.
	 * 在RedisTemplate中，已经提供了一个工厂方法:opsForValue()。 (如果为空，会创建一个对象，不为null则直接返回对象)
	 * 这个方法会返回一个默认的操作类。另外，我们可以直接通过注解
	 * 
	 * @Resource(name = “redisTemplate”)来进行注入。
	 */
	@Resource(name = "redisTemplateB")
	StringRedisTemplate stringRedisTemplate;/// 注入模板类 StringRedisTemplate继承RedisTemplate模板
	
	@Resource(name = "redisTemplateB") 
	ValueOperations<String, String> valOpsStr;//健值只能为string类型的
	
	@Resource(name = "redisTemplateB")
	RedisTemplate<Object, Object> redisTemplate;
	
	@Resource(name = "redisTemplate")
    ValueOperations<Object, Object> valOpsObj;//健值可以为object类型的 /** 根据指定key获取String

	public String getStr(String key) {
		return valOpsStr.get(key);
	}

	/**
	 * 设置Str缓存
	 * 
	 * @param key
	 * @param val
	 */
	public void setStr(String key, String val) {
		valOpsStr.set(key, val);
	}

	/**
	 * 删除指定key
	 * 
	 * @param key
	 */
	public void del(String key) {
		stringRedisTemplate.delete(key);
	}

	/**
	 * ===================================================================================================
	 * 根据指定o获取Object
	 * 
	 * @param o
	 * @return
	 */
	public Object getObj(Object o) {
		return valOpsObj.get(o);
	}

	/**
	 * 设置obj缓存
	 * 
	 * @param o1
	 * @param o2
	 */
	public void setObj(Object o1, Object o2) {
		valOpsObj.set(o1, o2);
	}

	/**
	 * 删除Obj缓存
	 * 
	 * @param o
	 */
	public void delObj(Object o) {
		redisTemplate.delete(o);
	}
	/**
	 * 清空所有redis缓存
	 * 
	 * @param o
	 */
	public void flushDB() {
		redisTemplate.execute(new RedisCallback() {
			@Override
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				 connection.flushDb();
				return "ok";
			}
			
		});
    }
     
}