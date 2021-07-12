package com.wm.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosCloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosCloudConfigClientApplication.class, args);
	}

}
