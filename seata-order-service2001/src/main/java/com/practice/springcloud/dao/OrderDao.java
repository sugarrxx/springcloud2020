package com.practice.springcloud.dao;

import com.practice.springcloud.entities.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lixiaoxiang
 * @date 2020-03-29
 */
@Mapper
public interface OrderDao {

    /**
     * 1 新建订单
     */
    void createOrder(Order order);

    /**
     * 2 修改订单状态 从0改为1
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}