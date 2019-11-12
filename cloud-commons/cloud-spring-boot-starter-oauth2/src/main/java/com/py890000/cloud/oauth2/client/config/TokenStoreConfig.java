package com.py890000.cloud.oauth2.client.config;


import com.py890000.cloud.oauth2.client.store.AuthDbTokenStore;
import com.py890000.cloud.oauth2.client.store.AuthJwtTokenStore;
import com.py890000.cloud.oauth2.client.store.AuthRedisTokenStore;
import com.py890000.cloud.oauth2.client.store.ResJwtTokenStore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * token存储配置
 *
 * @author zlt
 */
@Configuration
public class TokenStoreConfig {
    @Configuration
    @ConditionalOnProperty(prefix = "zlt.oauth2.token.store", name = "type", havingValue = "db")
    @Import(AuthDbTokenStore.class)
    public class JdbcTokenConfig {
    }

    @Configuration
    @ConditionalOnProperty(prefix = "zlt.oauth2.token.store", name = "type", havingValue = "redis", matchIfMissing = true)
    @Import(AuthRedisTokenStore.class)
    public class RedisTokenConfig {
    }

    @Configuration
    @ConditionalOnProperty(prefix = "zlt.oauth2.token.store", name = "type", havingValue = "authJwt")
    @Import(AuthJwtTokenStore.class)
    public class AuthJwtTokenConfig {
    }

    @Configuration
    @ConditionalOnProperty(prefix = "zlt.oauth2.token.store", name = "type", havingValue = "resJwt")
    @Import(ResJwtTokenStore.class)
    public class ResJwtTokenConfig {
    }
}
