package com.wxy.demo.mapper;

import com.wxy.demo.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author wangxy
 * @Date 2019/6/20 22:46
 * @Description UserMapper.xml
 **/
@Repository
public interface UserMapper {
    /**
     * 查询用户列表
     *
     * @return
     */
    List<User> queryList();
}
