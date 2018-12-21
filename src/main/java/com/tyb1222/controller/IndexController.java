package com.tyb1222.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ContextLoaderListener;

@Controller
public class IndexController {

    @RequestMapping("/hello")
    public String hello(){
        return "index";
    }
}
