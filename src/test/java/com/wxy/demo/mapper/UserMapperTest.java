package com.wxy.demo.mapper;

import com.wxy.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author wangxy
 * @Date 2019/6/20 22:57
 * @Description UserMapper测试
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void TestQueryList() {
        List<User> list = userMapper.queryList();
        log.info("查询用户列表：{}", list);
    }
}
