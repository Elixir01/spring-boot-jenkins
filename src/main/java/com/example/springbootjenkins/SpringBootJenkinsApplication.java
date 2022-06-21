package com.example.springbootjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJenkinsApplication {
    static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

    @PostConstruct
    public void initt(){
        logger.info("Application is initiating.....");
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootJenkinsApplication.class, args);
        logger.info("Application is executing....");
    }

}
