package com.polarbear.service;

import com.polarbear.mapper.UserMapper;
import com.polarbear.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author polarbear
 * @create 2020/9/11 11:57
 * @description:
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User queryById(int id){
        return userMapper.queryById(id);
    }

    @Transactional
    public void saveUser(User user){
        userMapper.saveUser(user);
    }
}
