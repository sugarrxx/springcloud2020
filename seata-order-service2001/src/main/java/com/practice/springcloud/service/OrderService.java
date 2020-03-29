package com.practice.springcloud.service;

import com.practice.springcloud.entities.Order;

/**
 * @author lixiaoxiang
 * @date 2020-03-29
 */
public interface OrderService {

    void create(Order order);
}