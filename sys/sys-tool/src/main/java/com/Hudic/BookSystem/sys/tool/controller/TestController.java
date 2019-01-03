package com.Hudic.BookSystem.sys.tool.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookSystem
 * Created by Makkah at 2019/1/3 9:55
 */

@RestController
public class TestController {
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    String test() {
        return "Hello, it's " + System.currentTimeMillis() + ", " + System.nanoTime();
    }
}
