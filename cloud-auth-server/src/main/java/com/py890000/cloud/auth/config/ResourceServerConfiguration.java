package com.py890000.cloud.auth.config;

import com.py890000.cloud.oauth2.client.config.DefaultSecurityHandlerConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2019/11/13
 */
@Configuration
@Import(DefaultSecurityHandlerConfig.class)
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {


    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.stateless(true);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {

        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.AuthorizedUrl authorizedUrl = setHttp(http)
                .authorizeRequests()
                .antMatchers("/oauth/token","/actuator/**",
                        "/*/v2/api-docs",
                        "/swagger/api-docs",
                        "/swagger-ui.html",
                        "/swagger-resources/**",
                        "webjars/**",
                        "/webjars/**",
                        "/druid/**","/error").permitAll()
                .antMatchers(HttpMethod.OPTIONS).permitAll()
                .anyRequest();
        setAuthenticate(authorizedUrl);

        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                .and()
                .httpBasic().disable()
                .headers()
                .frameOptions().disable()
                .and()
                .csrf().disable();
    }
    public HttpSecurity setAuthenticate(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.AuthorizedUrl authorizedUrl) {
        return authorizedUrl.authenticated().and();
    }
    public HttpSecurity setHttp(HttpSecurity http) {
        return http;
    }

}
