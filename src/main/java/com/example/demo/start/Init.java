package com.example.demo.start;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Order(value = 1)
public class Init implements CommandLineRunner {
    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        log.info("开始初始化...");
        initRedis();
        log.info("初始化完成!");
    }

    private void initRedis() {
        log.info("开始初始化Redis数据...");
        log.info("Redis数据初始化完成!");
    }
}
