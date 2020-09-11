package com.polarbear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author polarbear
 * @create 2020/9/10 15:57
 * @description:
 */
@SpringBootApplication
@MapperScan("com.polarbear.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        System.out.println("项目启动成功");
    }
}

