package com.atguigu.gmalllogger.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author frank
 * @create 2020-11-03 19:18
 */
@RestController
@Slf4j
public class LogController {

    @RequestMapping("test1")
    public String test01(){
        System.out.println("1111111111");
        return "success";
    }

    @RequestMapping("test2")
    public String test02(@RequestParam("name") String nn,@RequestParam("age") int age){
        System.out.println(nn+":"+age);
        return "success";
    }
    @RequestMapping("log")
    public String getLogger(@RequestParam("logString") String logString){
        System.out.println(logString);
        log.info(logString);
        return "success";
    }
}
