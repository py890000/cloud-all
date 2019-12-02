package com.py890000.cloud.auth.config;

import com.py890000.cloud.mybatis.config.DefaultMybatisPlusConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zlt
 * @date 2018/12/10
 */
@Configuration
@MapperScan({"com.py890000.cloud.auth.mapper*"})
public class MybatisPlusConfig extends DefaultMybatisPlusConfig {
}
