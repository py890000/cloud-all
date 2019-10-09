package com.py890000.cloud.getway.config;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.web.reactive.result.view.ViewResolver;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2019/7/6
 */
@Configuration
public class GatewayConfiguration {

    private final List<ViewResolver> viewResolvers;
    private final ServerCodecConfigurer serverCodecConfigurer;

    public GatewayConfiguration(ObjectProvider<List<ViewResolver>> viewResolversProvider,
                                ServerCodecConfigurer serverCodecConfigurer) {
        this.viewResolvers = viewResolversProvider.getIfAvailable(Collections::emptyList);
        this.serverCodecConfigurer = serverCodecConfigurer;
    }

//    @Bean
//    @Order(Ordered.HIGHEST_PRECEDENCE)
//    public SentinelGatewayBlockExceptionHandler sentinelGatewayBlockExceptionHandler() {
//        // Register the block exception handler for Spring Cloud Gateway.
//        return new SentinelGatewayBlockExceptionHandler(viewResolvers, serverCodecConfigurer);
//    }

//    @Bean
//    @Order(-1)
//    public GlobalFilter sentinelGatewayFilter() {
//        return new SentinelGatewayFilter();
//    }
//


    @PostConstruct
    public void doInit() {
     //   initGatewayRules();
    }

    /**
     * 配置限流规则
     */
//    private void initGatewayRules() {
//
//        Set<ApiDefinition> definitions = new HashSet<>();
//        ApiDefinition api1 = new ApiDefinition("user_route111")
//                .setPredicateItems(new HashSet<ApiPredicateItem>() {{
//                    add(new ApiPathPredicateItem().setPattern("/sayHello"));
//                }});
//
//        ApiDefinition api2 = new ApiDefinition("another_customized_api")
//                .setPredicateItems(new HashSet<ApiPredicateItem>() {{
//                    add(new ApiPathPredicateItem().setPattern("/ahas"));
//                }});
//        definitions.add(api1);
//        definitions.add(api2);
//        Set<GatewayFlowRule> rules = new HashSet<>();
//        rules.add(new GatewayFlowRule("user_route111")
//                .setCount(1)
//                .setIntervalSec(1)
//        );
//        GatewayRuleManager.loadRules(rules);
//        GatewayApiDefinitionManager.loadApiDefinitions(definitions);
//    }


    private void initCustomizedApis() {

    }
}
