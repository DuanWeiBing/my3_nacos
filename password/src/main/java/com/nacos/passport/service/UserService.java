package com.nacos.passport.service;

import com.nacos.api.UserServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author: 享学课堂-SaiLing老师
 * @老师qq: 2408524688
 * @description: 远程服务本地化
 *
 * @FeignClient("user-service")通过指定服务名称订阅远程服务
 * FeignClient底层发送的是http请求
 * http://user-service/loginUser?username=小丽&password=123
 */
@FeignClient("user-service")
public interface UserService extends UserServiceApi {
}
