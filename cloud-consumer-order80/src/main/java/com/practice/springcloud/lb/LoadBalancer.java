package com.practice.springcloud.lb;

import java.util.List;
import org.springframework.cloud.client.ServiceInstance;

/**
 * @author lixiaoxiang
 * @date 2020-03-23
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
