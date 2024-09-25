package com.example.recours.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/secured-endpoint")
    public String securedEndpoint(Authentication authentication) {
        return "Authenticated User ID: " + authentication.getName();
    }
}
