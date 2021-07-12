package com.wm.nacosclouddiscoveryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosCloudDiscoveryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosCloudDiscoveryClientApplication.class, args);
	}

}
