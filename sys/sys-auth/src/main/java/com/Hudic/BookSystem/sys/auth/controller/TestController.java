package com.Hudic.BookSystem.sys.auth.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookSystem
 * Created by Makkah at 2019/1/2 15:28
 */
@RestController
public class TestController {
    @Value("${app.hello}")
    String hello;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello() {
        return hello;
    }
}
