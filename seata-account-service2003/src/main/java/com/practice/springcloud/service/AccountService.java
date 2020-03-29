package com.practice.springcloud.service;

import java.math.BigDecimal;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lixiaoxiang
 * @date 2020-03-29
 */
public interface AccountService {

    /**
     * 扣减账户余额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}