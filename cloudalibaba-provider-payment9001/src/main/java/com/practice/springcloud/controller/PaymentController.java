package com.practice.springcloud.controller;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaoxiang
 * @date 2020-03-27
 */
@RestController
@RefreshScope
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;


    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos registry,serverPort: " + serverPort + "\t id" + id;
    }

    @GetMapping("/conf/info")
    public String getConfigInfo() {

        return configInfo;
    }

    @GetMapping("/redisson")
    public String redisson() {
        RedissonClient redissonClient = Redisson.create();
        RLock lock = redissonClient.getLock("lock");
        lock.lock();

        try {
            //... 逻辑
        } finally {
            lock.unlock();
        }

        return "";
    }
}