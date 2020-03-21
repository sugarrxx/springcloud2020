package com.practice.springcloud.service;

import com.practice.springcloud.entities.Payment;

/**
 * @author lixiaoxiang
 * @date 2020-03-21
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);
}
