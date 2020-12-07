package com.zhao.activilearn;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.zhao"})
@MapperScan(basePackages = {"com.zhao"})
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ActivilearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivilearnApplication.class, args);
    }

}
