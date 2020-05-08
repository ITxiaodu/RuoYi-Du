package com.du.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UController {

    @GetMapping("/home")
    public String home(){
        System.out.println("home");
        return "myHome";
    }

}
