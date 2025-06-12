package com.quesssystems.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping
    public String getMessage() {
        return "Hello from private controller";
    }

    @GetMapping("/admin")
    public String getAdminMessage() {
        return "Hello admin";
    }
}
