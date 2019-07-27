package com.wenxia.light;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author zhouw
 * @Description
 * @Date 2019-07-27
 */
@EnableEurekaServer
@SpringBootApplication
public class LightEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LightEurekaServerApplication.class, args);
    }
}
