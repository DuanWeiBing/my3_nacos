package com.nacos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 享学课堂-SaiLing老师
 * @老师qq: 2408524688
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient   //开启nacos的服务注册功能
@MapperScan("com.nacos.mapper")
public class ProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class,args);
    }
}
