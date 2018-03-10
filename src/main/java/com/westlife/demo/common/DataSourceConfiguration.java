package com.westlife.demo.common;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月15日 下午4:33:12 
 * @version 1.0 
 * @parameter
 *单数据源配置
 */
@Configuration
@MapperScan(basePackages = "com.westlife.*.mapper")
public class DataSourceConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "jdbc.ds")
    public DataSource readDataSource() {
        return new DruidDataSource();
    }
}
