package com.forzheng.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ForzhengConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForzhengConfigApplication.class, args);
		System.out.println("forzheng-config:启动完成");
	}
}
