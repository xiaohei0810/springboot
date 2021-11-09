package com.xiaohei.springbootdemo2.impl;

import com.xiaohei.springbootdemo2.domain.UserInfo;
import com.xiaohei.springbootdemo2.persistence.UserInfoMapper;
import com.xiaohei.springbootdemo2.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/11/8 6:11 下午
 * @Version 1.0
 * @Describtion
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    @Transactional
    public String insertInfo() {
        try {
            UserInfo userInfo = new UserInfo();
            userInfo.setUsername("aaaaaaa");
            userInfo.setPassword("bbbbbbbbb");
            userInfoMapper.insert(userInfo);

            int res = 11/ 0;

            System.out.println("测试idea 第一次修改提交");

        }catch (Exception e){
            return "a";
        }

        return "b";
    }
}
