package com.nacos.passport.controller;

import com.nacos.passport.service.UserService;
import com.nacos.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: 享学课堂-SaiLing老师
 * @老师qq: 2408524688
 * @description:
 */
@Controller
public class PassportController {
    @Autowired
    private UserService userService;

    /**
     * 逐个参数
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/loginUser",produces = "text/html;charset=utf-8",method = RequestMethod.POST)
    @ResponseBody
    public String loginUser(String username,String password){
        System.out.println(username);
        System.out.println(password);
        Users user = userService.login(username, password);
        return "登录成功,欢迎"+user.getUsername();
    }

    /**
     * 整体接收参数
     * @param
     * @return
     */
    @RequestMapping(value = "/loginUser2")
    @ResponseBody
    public String loginUser2(){
        List<Users> user = userService.login2();
        return "登录成功,欢迎"+user.toString();
    }
}
