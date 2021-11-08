package com.xiaohei.springbootdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiaohei
 */
@SpringBootApplication
public class SpringBootDemo2Application {

    public static void main(String[] args) {
        // 测试可以自动合并冲突的情况
        SpringApplication.run(SpringBootDemo2Application.class, args);
    }

}
