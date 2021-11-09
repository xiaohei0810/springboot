package com.xiaohei.springbootdemo2.service;

import com.xiaohei.springbootdemo2.domain.UserInfo;
import com.xiaohei.springbootdemo2.persistence.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (UserInfo)表服务接口
 *
 * @author 高玉津
 * @since 2021-11-08 18:04:37
 */
@Service
public interface UserInfoService{

    String insertInfo();
}