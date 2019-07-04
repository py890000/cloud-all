package com.py890000.cloud.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2019/6/29
 */

@RestController
@RefreshScope
public class TestController {
    @Value("${test}")
    private String test;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello() {
        return test;
    }
}
