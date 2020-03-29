package com.practice.springcloud.service;

import com.practice.springcloud.entities.CommonResult;
import com.practice.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author lixiaoxiang
 * @date 2020-03-29
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回，------------PaymentFallbackService",
                new Payment(id, "errorSerial"));
    }
}