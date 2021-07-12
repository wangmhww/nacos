package com.wm.nacos.controller;

import com.wm.nacos.config.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wangm
 * @date: 2021/6/23 11:11
 * @Description
 */
@RestController
@RequestMapping("/feign")
public class TestFeignController {

    @Autowired
    private Client client;

    @GetMapping("/test")
    public String test() {
        String result = client.hello("didi");
        return "Return: " + result;
    }
}
