package com.py890000.cloud.getway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jimmy on 2018/7/5
 */
@RestController
public class HelloGetWayController {
    @Value("${getway.hello}")
    private String hello;

    @GetMapping("/hello")
    public String from() {
        return this.hello;
    }
}
