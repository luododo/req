package com.ithr.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author com.hr.Text
 * @date 2020/3/25 - 13:36
 */
@RestController
public class HelloController {

    @RequestMapping("info")
    public  String info(){
        return "hello git01";

    }
    //开发提交
}
