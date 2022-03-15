package com.nacos.service.impl;

import com.nacos.mapper.UserMapper;
import com.nacos.pojo.Users;
import com.nacos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 享学课堂-SaiLing老师
 * @老师qq: 2408524688
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {
    //注入数据访问层mapper
    @Autowired
    UserMapper userMapper;
    @Override
    public Users loginUser(String username, String password) {
        return userMapper.selBy(username, password);
    }

    @Override
    public Users loginUser2(Users users) {
        return userMapper.selBy(users.getUsername(),users.getPassword());
    }

    @Override
    public List<Users> selAll() {
        System.out.println("进来看了");
        return userMapper.selAll();
    }
}
