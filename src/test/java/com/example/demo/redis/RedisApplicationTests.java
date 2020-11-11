package com.example.demo.redis;

import com.example.demo.redis.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class RedisApplicationTests {
    @Resource
    private RedisUtil redisUtil;

    @Test
    void contextLoads() {
        redisUtil.set("name","wangrui");
        System.out.println(redisUtil.get("name"));
    }

}
