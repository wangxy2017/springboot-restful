package com.wxy.demo.controller;

import com.wxy.demo.core.CommonResponse;
import com.wxy.demo.entity.User;
import com.wxy.demo.service.UserService;
import com.wxy.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author wangxy
 * @Date 2019/6/20 23:14
 * @Description 用户控制层
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询用户列表
     *
     * @return
     */
    @GetMapping(value = "/list")
    public CommonResponse list() {
        List<User> list = userService.queryUserList();
        return new CommonResponse(0, "success", list);
    }
}
