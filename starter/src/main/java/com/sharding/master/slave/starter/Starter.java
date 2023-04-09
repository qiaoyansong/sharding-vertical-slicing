package com.sharding.master.slave.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2022/1/25 3:20 下午
 * description：启动基类
 */
@SpringBootApplication
@ImportResource(locations = {"classpath*:service-*.xml"})
@MapperScan(basePackages = {"com.sharding.master.slave.dal.mapper"})
@ComponentScan(basePackages = "com.sharding.master.slave.*")
public class Starter {

    public static void main(String[] args) {
        System.out.println("-----springboot start-----");
        SpringApplication.run(Starter.class, args);
    }
}
