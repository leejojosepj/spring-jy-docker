package com.jy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    @GetMapping("/season4")
    public String getMessage4() {
        return "Welcome to spring4";
    }
}
