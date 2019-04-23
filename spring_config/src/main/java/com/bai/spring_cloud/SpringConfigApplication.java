package com.bai.spring_cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableConfigServer
public class SpringConfigApplication {

    public static void main(String[] args) {
        System.out.println(112);
        SpringApplication.run(SpringConfigApplication.class, args);
    }

}
