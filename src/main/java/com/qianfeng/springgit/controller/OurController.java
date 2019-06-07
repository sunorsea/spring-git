package com.qianfeng.springgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author rhb
 * @version 1.0
 * @Date 2019/6/7
 */
@Controller
@RequestMapping("our")
public class OurController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
