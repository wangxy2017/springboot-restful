package com.wxy.demo.service;

import com.wxy.demo.entity.User;

import java.util.List;

/**
 * @Author wangxy
 * @Date 2019/6/20 23:07
 * @Description 用户业务层
 **/
public interface UserService {
    /**
     * 查询用户列表
     *
     * @return
     */
    List<User> queryUserList();
}
