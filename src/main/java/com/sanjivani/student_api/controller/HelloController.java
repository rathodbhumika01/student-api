package com.sanjivani.student_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjivani.student_api.model.Greeting;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public Greeting hello() {
        return new Greeting("Hello from Spring Boot!");
    }

    @GetMapping("/api/welcome")
    public Greeting welcome() {
        return new Greeting("Welcome, Bhumi Rathod!");
    }
}