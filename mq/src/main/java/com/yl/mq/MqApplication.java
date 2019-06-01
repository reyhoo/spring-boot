package com.yl.mq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.yl.mq")
@MapperScan(basePackages = "com.yl.mq.dao")
public class MqApplication  {

    public static void main(String[] args) {
        SpringApplication.run(MqApplication.class, args);
    }

}
