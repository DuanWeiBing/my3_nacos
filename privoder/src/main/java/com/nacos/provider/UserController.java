package com.nacos.provider;

import com.nacos.api.UserServiceApi;
import com.nacos.pojo.Users;
import com.nacos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: 享学课堂-SaiLing老师
 * @老师qq: 2408524688
 * @description:
 */
@RestController
public class UserController implements UserServiceApi {
    @Autowired
    private UserService userService;
    @Override
    public Users login(String username, String password) {
        return userService.loginUser(username, password);
    }

    @Override
    public List<Users> login2() {
        return userService.selAll();
    }

//    @Override
//    public Users login2(Users users) {
//        System.out.println("**provider1提供的服务**");
//        return userService.loginUser2(users);
//    }
}
