package user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2019/9/24
 */
@FeignClient(name = "user")
public interface UserService {

    @GetMapping("/sayHello")
    String sayUserHello();
}
