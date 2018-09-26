package com.py890000.cloud.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jimmy on 2018/9/26
 */
@RestController
public class UserController {

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }
}
