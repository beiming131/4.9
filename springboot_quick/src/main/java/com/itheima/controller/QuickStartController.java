package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix="person")
public class QuickStartController {

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    private String username;


    private Integer password;

    @RequestMapping("/quick")
    @ResponseBody
    public String quick() {
        return "springboot 访问成功! name="+username+",age="+password;



    }
}
