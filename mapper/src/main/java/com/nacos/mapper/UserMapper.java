package com.nacos.mapper;

import com.nacos.pojo.Users;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: 享学课堂-SaiLing老师
 * @老师qq: 2408524688
 * @description:
 */
@Repository
public interface UserMapper {
/*
    @Select("select * from users where username = #{param1} and password=#{param2}")
    public Users selBy(String username, String password);
    @Select("select * from users")
    public List<Users> selAll();*/

public Users selBy(String username, String password);

public List<Users> selAll();

}
