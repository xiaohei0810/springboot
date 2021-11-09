package com.xiaohei.springbootdemo2.persistence;

import com.xiaohei.springbootdemo2.domain.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * (UserInfo)表Mapper接口
 *
 * @author 高玉津
 * @since 2021-11-08 18:04:39
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}