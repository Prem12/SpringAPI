package com.dk.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class DemoController {

    @GetMapping("/get")
    public String getDemo(){
        return "Hello world, I am spring Demo for Jyoti";
    }
}
