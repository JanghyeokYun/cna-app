package com.example.lsis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    private String message;

    public WelcomeController(@Value("${welcome.message}") String welcomeMessage) {
        this.message = welcomeMessage;
    }

    @GetMapping("/")
    public String hello(){
        return message;
    }
}
