package com.unicom.shop.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by zhangyq on 2017/9/24.
 */
@SpringBootApplication(scanBasePackages = "com.unicom.shop.common")
@MapperScan("com.unicom.shop.common.mapper")
@EnableCaching
@ServletComponentScan
public class CommonApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CommonApplication.class, args);
    }
}
