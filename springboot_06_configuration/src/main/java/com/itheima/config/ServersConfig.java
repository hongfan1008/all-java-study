package com.itheima.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@Data
@ConfigurationProperties(prefix = "servers")
public class ServersConfig {
    private String ipAddress;
    private int port;
    private long timeout;
}
