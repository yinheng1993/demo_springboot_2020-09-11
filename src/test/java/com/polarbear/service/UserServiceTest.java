package com.polarbear.service;

import com.polarbear.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author polarbear
 * @create 2020/9/11 14:13
 * @description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void queryById(){
        User user = userService.queryById(1);
        System.out.println(user);
    }
}
