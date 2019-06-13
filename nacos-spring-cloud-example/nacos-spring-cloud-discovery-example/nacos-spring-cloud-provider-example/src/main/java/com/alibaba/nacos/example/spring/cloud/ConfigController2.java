package com.alibaba.nacos.example.spring.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config2")
@RefreshScope
public class ConfigController2 {

    @Value("${name:xrq}")
    private String ss;

    /**
     * http://localhost:8080/config/get
     */
    @RequestMapping("/get")
    public String get() {
        return ss+"dasda";
    }
}