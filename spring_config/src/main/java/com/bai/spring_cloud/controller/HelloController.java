package com.bai.spring_cloud.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hei")
public class HelloController {
    @RequestMapping("hei")
    public String hei(String name){
        return "client3:"+name;
    }
}
