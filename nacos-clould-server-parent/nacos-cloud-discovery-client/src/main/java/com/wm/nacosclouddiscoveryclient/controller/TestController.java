package com.wm.nacosclouddiscoveryclient.controller;

import com.wm.nacosclouddiscoveryclient.handler.BalancerClientHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: wangm
 * @date: 2021/6/21 15:27
 * @Description
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

//    private static String SERVICE_ID = "alibaba-nacos-discovery-server";
//    @Autowired
//    BalancerClientHandler balancerClientHandler;

    @GetMapping("/gethello")
    public String gethello() {
        // 通过spring cloud common中的负载均衡接口选取服务提供节点实现接口调用
        String url = "/test/hello?name=" + "didi";
//        String result = (String) balancerClientHandler.handler(SERVICE_ID, url, String.class);
        String result = restTemplate.getForObject("http://alibaba-nacos-discovery-server/test/hello?name=didi", String.class);
        return "Invoke : " + url + ", return : " + result;
    }
}
