package com.Hudic.BookSystem.sys.tool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * BookSystem
 * Created by Makkah at 2019/1/3 9:42
 */
@EnableDiscoveryClient
@EnableSwagger2
@SpringBootApplication
public class SysTool {
    public static void main(String[] args) {
        SpringApplication.run(SysTool.class, args);
    }
}
