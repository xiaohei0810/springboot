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
@RequestMapping("/xiaoheiidea1")
public class DemoController {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @GetMapping("/get222333552222")
    public String test(){
        System.out.println("111111111111112222");
        return "welcome to my home33333";
    }

    @GetMapping("/get233333333444")
    @Transactional
    public String insert(){
        try {
            UserInfo userInfo = new UserInfo();
            userInfo.setUsername("aaaaaavvvv");
            userInfo.setPassword("cccccccc");
            Integer result = userInfoMapper.insert(userInfo);

            int aaaa = 1 / 0;

            System.out.println(result);
        }catch (Exception e){
            return "b";
        }
        return "a";
    }

}
