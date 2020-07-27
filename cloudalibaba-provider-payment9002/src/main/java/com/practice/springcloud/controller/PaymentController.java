package com.practice.springcloud.controller;

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

    @Value("${meShowNginxLan}")
    private String conf;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos registry,serverPort: " + serverPort + "\t id" + id;
    }

    @GetMapping("/conf")
    public String getConf() {

        return conf;
    }
}