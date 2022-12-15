package org.example.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Profile("test")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, I'm test profile controller";
    }

}
