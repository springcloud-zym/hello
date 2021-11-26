package com.ct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zym
 * @date 2021/11/25 16:50
 */
@SpringBootApplication()
@MapperScan(basePackages = {"com.ct.lightdecay.mapper"})
public class LightDecayApplication {
    public static void main(String[] args) {
        SpringApplication.run(LightDecayApplication.class,args);
    }
}
