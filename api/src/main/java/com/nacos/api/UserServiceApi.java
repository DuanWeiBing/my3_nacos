package com.nacos.api;

import com.nacos.pojo.Users;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface UserServiceApi {
    @PostMapping(value = "/loginUser")
    public Users login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password);


    @PostMapping(value = "/loginUser2")
    public List<Users> login2();

}
