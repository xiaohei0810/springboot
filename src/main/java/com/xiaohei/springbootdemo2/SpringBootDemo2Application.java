package com.xiaohei.springbootdemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiaohei
 */
@SpringBootApplication
//@MapperScan("com.xiaohei.springbootdemo2.persistence")
public class SpringBootDemo2Application {

    public static void main(String[] args) {
        // 测试可以自动合并冲突的情况10101010
        SpringApplication.run(SpringBootDemo2Application.class, args);
    }

}
