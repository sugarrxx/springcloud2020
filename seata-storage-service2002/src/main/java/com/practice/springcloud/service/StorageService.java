package com.practice.springcloud.service;

/**
 * @author lixiaoxiang
 * @date 2020-03-29
 */
public interface StorageService {

    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}