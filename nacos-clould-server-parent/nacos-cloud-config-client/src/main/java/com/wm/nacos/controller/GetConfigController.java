package com.wm.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wangm
 * @date: 2021/6/23 11:38
 * @Description
 */
@RestController
@RequestMapping("/test")
@RefreshScope
public class GetConfigController {

    @Value("${didispace.title:}")
    private String title;

    @Value("${actuator:}")
    private String actuator;

    @Value("${level:}")
    private String level;

    @GetMapping("/hello")
    public String hello() {
        return title + "actuator:" + actuator + " Log Level ：" + level;
    }
}
