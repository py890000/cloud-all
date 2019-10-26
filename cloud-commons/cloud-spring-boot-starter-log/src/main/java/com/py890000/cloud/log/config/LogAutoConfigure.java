package com.py890000.cloud.log.config;

import com.py890000.cloud.log.properties.TraceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 日志自动配置
 *
 * @author py890000
 * @date 2019/8/13
 */
@EnableConfigurationProperties(TraceProperties.class)
public class LogAutoConfigure {

}
