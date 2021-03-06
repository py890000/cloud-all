package com.py890000.cloud.core.config;


import com.py890000.cloud.core.resolver.ClientArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * 公共配置类, 一些公共工具配置
 *
 * @author py890000
 * @date 2018/8/25
 */
public class LoginArgResolverConfig implements WebMvcConfigurer {
//    @Lazy
//    @Autowired
//    private UserService userService;
    /**
     * Token参数解析
     *
     * @param argumentResolvers 解析类
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        //注入用户信息
       // argumentResolvers.add(new TokenArgumentResolver(userService));
        //注入应用信息
        argumentResolvers.add(new ClientArgumentResolver());
    }
}
