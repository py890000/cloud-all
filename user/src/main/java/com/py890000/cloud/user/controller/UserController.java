package com.py890000.cloud.user.controller;

import com.py890000.cloud.user.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jimmy on 2018/9/26
 */
@RestController
public class UserController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello() {
        return orderService.beginorder();
    }




}
