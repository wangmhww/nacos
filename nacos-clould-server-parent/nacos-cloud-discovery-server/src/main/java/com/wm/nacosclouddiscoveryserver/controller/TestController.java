package com.wm.nacosclouddiscoveryserver.controller;

import com.wm.common.properities.CommonProperities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @author: wangm
 * @date: 2021/6/21 15:14
 * @Description
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private CommonProperities commonProperities;

    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello" + name;
    }

    @PostConstruct
    public void init() {
        System.out.println("commonProperities================"+ commonProperities.getName());
    }
}
