package com.clei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @RequestMapping("/")
    public String test(){
        return "Hello World!";
    }

}
