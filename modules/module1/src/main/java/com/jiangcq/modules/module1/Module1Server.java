package com.jiangcq.modules.module1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * BookSystem
 * Created by Makkah at 2018/12/14 15:05
 */
@EnableDiscoveryClient
@EnableSwagger2
@SpringBootApplication
public class Module1Server {
    public static void main(String[] args) {
        SpringApplication.run(Module1Server.class);
    }
}
