package user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import user.service.impl.OrderServiceFallBack;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2019/7/4
 */
@FeignClient(name = "order",fallback = OrderServiceFallBack.class)
public interface OrderService {

    @GetMapping("/beginorder")
    String beginorder();
}
