package com.practice.springcloud.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lixiaoxiang
 * @date 2020-03-29
 */
@Configuration
@MapperScan({"com.practice.springcloud.dao"})
public class MyBatisConfig {

}