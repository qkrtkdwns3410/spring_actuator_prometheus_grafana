package com.monitoring.sapg.test.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestApiController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
