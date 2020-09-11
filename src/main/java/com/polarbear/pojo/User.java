package com.polarbear.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author polarbear
 * @create 2020/9/11 10:52
 * @description:
 */
@Data
@Table(name = "tb_user")
public class User {
    //id
    @Id
    //开启主键自动回填
    @KeySql(useGeneratedKeys = true)
    private int id;
    //name
    private String name;

}
