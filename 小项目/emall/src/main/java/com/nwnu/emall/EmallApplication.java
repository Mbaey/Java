package com.nwnu.emall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
@MapperScan("com.nwnu.emall.dao")
@SpringBootApplication
public class EmallApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(EmallApplication.class, args);
    }

    /**
     *https://blog.csdn.net/wohaqiyi/article/details/78435308
     * tomcat启动。 maven 老下载jar包太繁琐
     *
     * https://blog.csdn.net/StartGala/article/details/70313229
     * idea maven项目如何使用lib下得jar包
     */

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EmallApplication.class);
    }
}
