package com.itheima.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix = "person")

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

        System.out.println("aaaaaaaaaa");
        return "springboot 访问成功! name=" + username + ",age=" + password;

    }

}
