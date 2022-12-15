package org.example.controller;

import org.example.commons.entity.User;
import org.example.service.UsersDownloaderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/simple")
public class SimpleController {

    private final UsersDownloaderService usersDownloaderService;

    public SimpleController(UsersDownloaderService usersDownloaderService) {
        this.usersDownloaderService = usersDownloaderService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, I'm simple controller";
    }

    @GetMapping("/users")
    public List<User> users() {
        return usersDownloaderService.download();
    }

}
