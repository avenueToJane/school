package com.westlife.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;


/**
 * 
 * @author westlife
 * @date 创建时间：2017年12月15日 下午4:32:07
 * @version 1.0
 * @parameter springboot启动器
 */
// 开启缓存
@EnableCaching
@SpringBootApplication
public class Application extends SpringBootServletInitializer implements CommandLineRunner{
	protected static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		logger.info("SpringBoot开始加载");
		SpringApplication.run(Application.class, args);
		logger.info("SpringBoot加载完毕");
	}

	// Java EE应用服务器配置，
	// 如果要使用tomcat来加载jsp的话就必须继承SpringBootServletInitializer类并且重写其中configure方法
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	// springboot运行后此方法首先被调用
	// 实现CommandLineRunner抽象类中的run方法
	@Override
	public void run(String... args) throws Exception {
		System.out.println("springboot启动完成！");
	}
}
