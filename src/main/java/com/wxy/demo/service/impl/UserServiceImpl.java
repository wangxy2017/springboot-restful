package com.wxy.demo.service.impl;

import com.wxy.demo.entity.User;
import com.wxy.demo.mapper.UserMapper;
import com.wxy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wangxy
 * @Date 2019/6/20 23:07
 * @Description 用户业务层实现
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.queryList();
    }
}
