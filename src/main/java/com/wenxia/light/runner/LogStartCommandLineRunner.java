package com.wenxia.light.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author zhouw
 * @Description
 * @Date 2019-08-02
 */
@Component
public class LogStartCommandLineRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(LogStartCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("很好，轻量级Eureka注册中心启动成功！");
    }
}
