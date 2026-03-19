package com.insurance.policy_service.controller;

import com.insurance.policy_service.model.Policy;
import com.insurance.policy_service.repository.PolicyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/policies")
@RequiredArgsConstructor
public class PolicyController {

    private final PolicyRepository policyRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Policy createPolicy(@RequestBody Policy policy) {
        return policyRepository.save(policy);
    }

    @GetMapping
    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }
}