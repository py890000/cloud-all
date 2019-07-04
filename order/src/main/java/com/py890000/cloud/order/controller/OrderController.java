package com.py890000.cloud.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jimmy on 2018/9/26
 */
@RestController
public class OrderController {

    @RequestMapping("/beginorder")
    @ResponseBody
    public String sayHello() {
        return "sucess  order" ;
    }
}
