package com.guanwx.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/19 星期四 5:09
 * @Description:
 * @Version: 1.0
 */

@Slf4j
@RestController
@RequestMapping("/design")
public class TestController {

    @GetMapping("/test1/{test}")
    public String test1 (@PathVariable("test") String test) {
        log.info(test);
        System.out.println(test);
        return test;
    }
}
