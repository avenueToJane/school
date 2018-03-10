/**
 * 
 */
package com.westlife.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月20日 上午11:26:33 
 * @version 1.0 
 * @parameter
 *
 */

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select() // 为当前包路径
				.apis(RequestHandlerSelectors
			    .basePackage("com.westlife.demo"))
				.paths(PathSelectors.any())
				.build();
	}

	// 构建 api文档的详细信息函数
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder() // 页面标题
				.title("Spring Boot 测试使用 Swagger2 构建RESTful API")
				.termsOfServiceUrl("http://localhost/")			 
				.contact("westlife") // 创建人
				.version("1.0") // 版本号 			
				.description("部署信息：172.0.0.1:8081")//描述
				.build();
	}

}
