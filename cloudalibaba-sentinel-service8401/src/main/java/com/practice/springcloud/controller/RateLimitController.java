package com.practice.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.practice.springcloud.entities.CommonResult;
import com.practice.springcloud.entities.Payment;
import com.practice.springcloud.handler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaoxiang
 * @date 2020-03-29
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommonResult byResource() {

        return new CommonResult(200, "按资源名限流", new Payment(2020L, "serial001"));
    }

    public CommonResult handleException(BlockException exception) {

        return new CommonResult(444, exception.getClass().getCanonicalName() + "\t服务不可用");
    }

    // customerBlockHandler

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler", blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerException2")
    public CommonResult customerBlockHandler() {

        return new CommonResult(200, "按自定义 名限流", new Payment(2020L, "serial001"));
    }
}
