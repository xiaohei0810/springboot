package com.xiaohei.springbootdemo2.controller;

import com.xiaohei.springbootdemo2.domain.UserInfo;
import com.xiaohei.springbootdemo2.persistence.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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

    @Autowired
    private UserInfoMapper userInfoMapper;

    @GetMapping("/get")
    public String test(){
        System.out.println("101010101001");
        return "welcome to my home2222";
    }

    @GetMapping("/get2")
    @Transactional
    public String insert(){
        try {
            UserInfo userInfo = new UserInfo();
            userInfo.setUsername("aaaaaa");
            userInfo.setPassword("bbbbbbb");
            Integer result = userInfoMapper.insert(userInfo);

            int aaaa = 1 / 0;

            System.out.println(result);
        }catch (Exception e){
            return "b";
        }
        return "a";
    }

}
