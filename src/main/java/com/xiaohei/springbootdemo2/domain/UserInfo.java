package com.xiaohei.springbootdemo2.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * @description (user_info)表实体类
 * @author 高玉津
 * @date 2021-11-08 18:04:34
 */
 
@TableName(value = "user_info")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo{
    @TableField(value = "uuid")
    private Integer uuid;
    
    @TableField(value = "username")
    private String username;
    
    @TableField(value = "password")
    private String password;








    





    
}