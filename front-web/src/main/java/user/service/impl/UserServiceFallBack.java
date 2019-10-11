package user.service.impl;

import org.springframework.stereotype.Component;
import user.service.UserService;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2019/10/9
 */
@Component
public class UserServiceFallBack implements UserService {
    @Override
    public String sayUserHello() {
        return "error";
    }
}
