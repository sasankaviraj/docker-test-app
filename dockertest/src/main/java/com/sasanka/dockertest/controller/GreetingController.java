package com.sasanka.dockertest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/")
    public String greetings(){
        return "<h1>Lets start on Docker...</h1>";
    }
}
