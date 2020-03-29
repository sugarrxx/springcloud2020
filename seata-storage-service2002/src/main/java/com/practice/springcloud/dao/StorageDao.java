package com.practice.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lixiaoxiang
 * @date 2020-03-29
 */
@Mapper
public interface StorageDao {

    /**
     * 减库存
     */
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);
}