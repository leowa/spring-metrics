package com.example.spring.metrics.springmetrics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RedisOption {
    @Value("${redis.host:localhost}")
    public String host;
    @Value("${redis.port:6379}")
    public String port;
}
