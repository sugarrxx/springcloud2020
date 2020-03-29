package com.practice.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.practice.springcloud.entities.CommonResult;

/**
 * @author lixiaoxiang
 * @date 2020-03-29
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException1(BlockException exception) {
        return new CommonResult(444, exception.getClass().getCanonicalName() + "自定义处理1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, exception.getClass().getCanonicalName() + "自定义处理2");
    }
}
