package com.xiaohei.springbootdemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/10/20 4:05 下午
 * @Version 1.0
 * @Describtion
 */
@RestController
@RequestMapping("/xiaohei")
public class DemoController {

    @GetMapping("/get")
    public String test(){
        System.out.println("4444444444");
        return "welcome to my home";
    }

}
