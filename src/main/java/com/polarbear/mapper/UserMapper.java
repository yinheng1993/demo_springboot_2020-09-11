package com.polarbear.mapper;

import com.polarbear.pojo.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author polarbear
 * @create 2020/9/11 13:33
 * @description:
 */
//@Mapper
public interface UserMapper extends Mapper<User> {
    public User queryById(int id);
    public void saveUser(User user);
}
