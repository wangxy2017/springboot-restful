package com.wxy.demo.service;

import com.wxy.demo.entity.User;
import com.wxy.demo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author wangxy
 * @Date 2019/6/20 23:11
 * @Description TODO
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void TestQueryUserList(){
        List<User> list = userService.queryUserList();
        log.info("查询用户列表：{}",list);
    }
}
