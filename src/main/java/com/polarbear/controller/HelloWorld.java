package com.polarbear.controller;

import com.polarbear.pojo.User;
import com.polarbear.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @Author polarbear
 * @create 2020/9/10 15:57
 * @description:
 */
@RestController
public class HelloWorld {
    @Value("${polarbear1.value}")
    private String value1;
    @Value("${polarbear2.value}")
    private String value2;

    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserService userService;
    @RequestMapping("hello")
    public String hello(){
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(dataSource);
        return "hello springboot";
    }

    @RequestMapping("/queryById/{id}")
    public User queryById(@PathVariable int id){
        return userService.queryById(id);
    }
}
