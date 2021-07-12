package com.wm.nacos.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: wangm
 * @date: 2021/6/23 11:15
 * @Description
 */
@FeignClient("alibaba-nacos-discovery-server")
@RequestMapping("/test")
public interface Client {

    @GetMapping("/hello")
    String hello(@RequestParam(name = "name") String name);

}
