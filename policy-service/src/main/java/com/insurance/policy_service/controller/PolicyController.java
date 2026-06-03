package com.insurance.policy_service.controller;

import com.insurance.policy_service.model.Policy;
import com.insurance.policy_service.service.PolicyService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/policies")
@RequiredArgsConstructor
public class PolicyController {

    private final PolicyService policyService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Policy createPolicy(@RequestBody Policy policy) {
        return policyService.createPolicy(policy);
    }

    @GetMapping
    public List<Policy> getAllPolicies() {
        return policyService.getAllPolicies();
    }

    @GetMapping("/{id}")
    public Policy findById(@PathVariable Long id) {
        return policyService.getPolicyById(id);
    }

    @GetMapping("/number/{policyNumber}")
    public Policy findByNumber(@PathVariable String policyNumber) {
        return policyService.getPolicyByNumber(policyNumber);
    }
}