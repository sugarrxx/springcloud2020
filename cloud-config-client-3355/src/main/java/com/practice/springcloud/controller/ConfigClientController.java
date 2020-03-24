package com.practice.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaoxiang
 * @date 2020-03-25
 */
@RestController
@RefreshScope
public class ConfigClientController {

    // 要访问的3344上的信息

    @Value("${config.info}")
    private String configInfo;

    // 请求地址

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
