package com.Hudic.BookSystem.web.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * BookSystem
 * Created by Makkah at 2019/1/2 16:58
 */
@EnableDiscoveryClient
@EnableSwagger2
@SpringBootApplication
public class WebBack {
    public static void main(String[] args) {
        SpringApplication.run(WebBack.class, args);
    }
}
