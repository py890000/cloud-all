package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import user.service.OrderService;
import user.service.UserService;

/**
 * Created by jimmy on 2018/9/26
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello() {
        return userService.sayUserHello();
    }

    @RequestMapping("/sayOrder")
    @ResponseBody
    public String sayOrder() {
        return orderService.beginorder();
    }




}
