package com.wm.nacosclouddiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosCloudDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosCloudDiscoveryServerApplication.class, args);
	}

}
