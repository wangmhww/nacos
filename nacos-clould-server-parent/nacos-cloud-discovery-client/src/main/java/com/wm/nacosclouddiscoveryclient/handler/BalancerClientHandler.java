package com.wm.nacosclouddiscoveryclient.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author: wangm
 * @date: 2021/6/21 15:33
 * @Description
 */
@Component
public class BalancerClientHandler {

//    @Autowired
//    LoadBalancerClient loadBalancerClient;
//
//    public  Object handler(String serviceId, String url, Class returnClass) {
//        ServiceInstance serviceInstance = loadBalancerClient.choose(serviceId);
//        String absoluteUrl = serviceInstance.getUri() + url;
//        RestTemplate restTemplate = new RestTemplate();
//        Object result = restTemplate.getForObject(absoluteUrl, returnClass);
//        return result;
//    }
}
