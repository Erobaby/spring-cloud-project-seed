package me.erobaby.hellomicroservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by erobaby on 2017/9/18.
 */
@RestController
public class HelloController {
    @Value("${info.name}")
    private String name;
    @Value("${info.email}")
    private String email;
    @GetMapping("/hi")
    public String hi() {
        return name + email;
    }
}
