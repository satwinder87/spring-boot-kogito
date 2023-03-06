package com.example.kogito.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping(value = "ping")
    public String ping(){
        return "Pong";
    }
}
