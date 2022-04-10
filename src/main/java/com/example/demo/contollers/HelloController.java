package com.example.demo.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/student")
    public String index() {
        return "Greetings from Spring Boot";
    }
}
