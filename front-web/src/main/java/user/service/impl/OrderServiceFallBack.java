package user.service.impl;

import org.springframework.stereotype.Component;
import user.service.OrderService;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2019/10/9
 */
@Component
public class OrderServiceFallBack implements OrderService {

    public String beginorder() {
        return "error";
    }


}
