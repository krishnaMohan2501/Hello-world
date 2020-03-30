package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/index")
public class HelloController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello mootiiiii";
    }
}
