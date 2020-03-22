package com.practice.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lixiaoxiang
 * @date 2020-03-23
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        // 随机
        return new RandomRule();
    }
}