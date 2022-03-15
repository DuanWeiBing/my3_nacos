package com.nacos.service;

import com.nacos.pojo.Users;

import java.util.List;

/**
 * @author: 享学课堂-SaiLing老师
 * @老师qq: 2408524688
 * @description:
 */
public interface UserService {
    public Users loginUser(String username, String password);

    public Users loginUser2(Users users);
    public List<Users> selAll();
}
