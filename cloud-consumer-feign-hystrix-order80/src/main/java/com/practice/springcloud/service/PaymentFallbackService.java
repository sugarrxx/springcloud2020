package com.practice.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author lixiaoxiang
 * @date 2020-03-24
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfoOk(Integer id) {
        return "PaymentFallbackService paymentInfoOk";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "PaymentFallbackService paymentInfoTimeOut";
    }
}
