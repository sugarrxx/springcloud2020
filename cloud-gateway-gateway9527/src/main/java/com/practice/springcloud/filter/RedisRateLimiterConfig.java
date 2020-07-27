package com.practice.springcloud.filter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author lixiaoxiang
 * @date 2020-07-21
 */
public class RedisRateLimiterConfig implements KeyResolver {

    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        return null;
    }
}
