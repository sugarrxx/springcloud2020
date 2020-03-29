package com.practice.springcloud.service.impl;

import com.practice.springcloud.dao.StorageDao;
import com.practice.springcloud.service.StorageService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author lixiaoxiang
 * @date 2020-03-29
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    /**
     * 减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        storageDao.decrease(productId, count);
    }
}