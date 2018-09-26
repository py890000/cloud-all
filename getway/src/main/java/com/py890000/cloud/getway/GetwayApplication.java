package com.py890000.cloud.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Import(AdditionalRoutes.class)
public class GetwayApplication {
//	@Bean
//	public RouteLocator customRouteLocator(ThrottleGatewayFilter throttle) {
//		return Routes.locator()
//					 .route("test")
//					 .uri("http://httpbin.org:80")
//					 .predicate(host("**.abc.org").and(path("/image/png")))
//					 .addResponseHeader("X-TestHeader", "foobar")
//					 .and()
//					 .route("test2")
//					 .uri("http://httpbin.org:80")
//					 .predicate(path("/image/webp"))
//					 .add(addResponseHeader("X-AnotherHeader", "baz"))
//					 .and()
//					 .build();
//	}


	public static void main(String[] args) {
		SpringApplication.run(GetwayApplication.class, args);
	}



}
