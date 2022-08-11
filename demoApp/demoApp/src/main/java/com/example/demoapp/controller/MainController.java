package com.example.demoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    //start page mapping
    @GetMapping("/")
    public String start() {
        return "Hello world";
    }


}
