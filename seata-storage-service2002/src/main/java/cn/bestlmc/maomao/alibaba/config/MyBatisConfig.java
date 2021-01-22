package cn.bestlmc.maomao.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"cn.bestlmc.maomao.alibaba.dao"})
public class MyBatisConfig {
}
