package com.jiangcq;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer     // 用来指定该项目为Eureka的服务注册中心
@SpringBootApplication  // SpringBoot启动类注解，启动类需有main方法
public class EurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class);
    }
}