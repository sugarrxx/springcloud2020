package com.practice.springcloud;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lixiaoxiang
 * @date 2020-07-22
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class NacosTest {

    @NacosInjected
    private ConfigService configService;

    @Test
    public void test() throws NacosException {
        String DATA_ID = "nacos-config-client-dev.yml";
        String DEFAULT_GROUP = "DEFAULT_GROUP";
        configService.publishConfig(DATA_ID, DEFAULT_GROUP, "this is new content");
    }

}
