package com.wm.nacosclouddiscoveryserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wangm
 * @date: 2021/6/21 15:14
 * @Description
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello" + name;
    }
}
