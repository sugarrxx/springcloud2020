package com.practice.springcloud.controller;

import com.practice.springcloud.entities.CommonResult;
import com.practice.springcloud.entities.Payment;
import com.practice.springcloud.service.PaymentService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaoxiang
 * @date 2020-03-21
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功, serverPort: " + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****插入结果：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功, serverPort: " + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录, 查询ID：" + id, null);
        }
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }
}
