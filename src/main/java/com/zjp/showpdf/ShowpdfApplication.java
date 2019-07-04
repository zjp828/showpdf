package com.zjp.showpdf;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
@MapperScan(basePackages = "com.zjp.showpdf.dao")
@Slf4j
public class ShowpdfApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =SpringApplication.run(ShowpdfApplication.class, args);
        log.info("该服务的名称是：{}",context.getEnvironment().getProperty("spring.application.name"));
        log.info("该服务的启动端口是：{}",context.getEnvironment().getProperty("server.port"));
    }

}
