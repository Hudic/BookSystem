package com.Hudic.sys.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * BookSystem
 * Created by Makkah at 2019/1/2 14:54
 */
@EnableDiscoveryClient  // 需要注册到eureka中心，方便config的client端调用
@EnableConfigServer
@SpringBootApplication
public class SysConfig {
    public static void main(String[] args) {
        SpringApplication.run(SysConfig.class, args);
    }
}
