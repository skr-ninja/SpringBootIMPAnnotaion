package com.springboot.annotation.springbootinterviewannotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(value = "/homepage", method = RequestMethod.GET)
    public String home() {
        System.out.println("this is home method");
        return "Home....";
    }
}
