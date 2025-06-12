package com.quesssystems.springsecurityjwt.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @SecurityRequirement(name = "bearerAuth")
    @GetMapping
    public String getMessage() {
        return "Hello from private controller";
    }

    @SecurityRequirement(name = "bearerAuth")
    @GetMapping("/admin")
    public String getAdminMessage() {
        return "Hello admin";
    }
}
