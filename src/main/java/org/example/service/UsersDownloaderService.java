package org.example.service;

import org.example.commons.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersDownloaderService {

    private final RestTemplate template;

    public UsersDownloaderService(RestTemplate template) {
        this.template = template;
    }

    public List<User> download() {
        return Arrays.stream(template.getForObject("http://localhost:9000/profile-using-server/users", User[].class))
                .collect(Collectors.toList());
    }

}
