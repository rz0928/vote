package com.example.vote;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;


@SpringBootTest
class VoteApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(DigestUtils.md5DigestAsHex("ruizhi".getBytes()).toUpperCase());
    }

}
