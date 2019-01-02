package com.Hudic.BookSystem.sys.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * BookSystem
 * Created by Makkah at 2019/1/2 15:26
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SysAuth {
    public static void main(String[] args) {
        SpringApplication.run(SysAuth.class, args);
    }
}
