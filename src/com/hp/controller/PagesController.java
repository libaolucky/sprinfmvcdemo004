package com.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PagesController {
    @RequestMapping("/home")
    public String home(){
        System.out.println("请求已经进入controller 层 ");
        return "home";
    }

}
