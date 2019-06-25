package com.wxy.demo.config;

import com.wxy.demo.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;

/**
 * @Author wangxy
 * @Date 2019/6/20 22:51
 * @Description 配置包扫描
 **/
@SpringBootConfiguration
@MapperScan(basePackageClasses = UserMapper.class)
public class MapperConfiguration {
}
