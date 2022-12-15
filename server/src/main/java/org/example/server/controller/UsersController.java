package org.example.server.controller;

import org.example.commons.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping
    public List<User> users() {
        return List.of(
                new User()
                        .id(1L)
                        .name("some-name"),
                new User()
                        .id(2L)
                        .name("some-name2")
        );
    }

}
