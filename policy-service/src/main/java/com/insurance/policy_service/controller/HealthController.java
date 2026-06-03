package com.insurance.policy_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/api/v1/health")
    public String check() {
        return "Policy Service is LIVE on Java 21";
    }
}