package com.ms.springboot.learning.controller;

import com.ms.springboot.learning.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/14 10:13
 * @version: v1.0
 */
@RestController
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    TestService testService;


    @GetMapping("test")
    public String test(@RequestParam("name") String name) {
        if(LOGGER.isInfoEnabled()) {
            LOGGER.info("test controller test info name : [{}]", name);
        }
        testService.info();
        testService.warn();
        testService.error();
        testService.debugger();
        try {
            testService.throwException();
        } catch (Exception e) {
            if(LOGGER.isErrorEnabled()){
                LOGGER.error("throw new runtime exception", e);
            }
        }

        return "测试日志";
    }

    @GetMapping("test/info")
    public String testInfo(@RequestParam("name") String name) {
        if(LOGGER.isInfoEnabled()) {
            LOGGER.info("test controller test info name : [{}]", name);
        }
        testService.info();
        return "测试日志";
    }

    @GetMapping("test/debug")
    public String testDebug(@RequestParam("name") String name) {
        if(LOGGER.isDebugEnabled()) {
            LOGGER.debug("test controller debug test name : [{}]", name);
        }
        testService.debugger();
        return "测试日志";
    }


    @GetMapping("test/error")
    public String testError(@RequestParam("name") String name) {
        if(LOGGER.isErrorEnabled()) {
            LOGGER.error("test controller error name : [{}]", name);
        }
        testService.error();
        return "测试日志";
    }

    @GetMapping("test/warn")
    public String testWarn(@RequestParam("name") String name) {
        if(LOGGER.isWarnEnabled()) {
            LOGGER.warn("test controller warn warn name : [{}]", name);
        }
        testService.warn();
        return "测试日志";
    }
}
