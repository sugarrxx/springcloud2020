package com.practice.springcloud.service.impl;

import com.practice.springcloud.dao.AccountDao;
import com.practice.springcloud.service.AccountService;
import java.math.BigDecimal;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author lixiaoxiang
 * @date 2020-03-29
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------>account-service中扣减账户余额开始");
        //模拟超时异常，全局事务回滚
        accountDao.decrease(userId, money);
        LOGGER.info("------>account-service中扣减账户余额结束");
    }
}