package com.insurance.policy_service.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.insurance.policy_service.exception.ResourceNotFoundException;
import com.insurance.policy_service.model.Policy;
import com.insurance.policy_service.repository.PolicyRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class PolicyService {

    private final PolicyRepository policyRepository;

    @Transactional(readOnly = true)
    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public Policy createPolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    @Transactional(readOnly = true)
    public Policy getPolicyByNumber(String policyNumber) {
        return policyRepository.findByPolicyNumber(policyNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Policy number " + policyNumber + " does not exist."));

    }

    @Transactional(readOnly = true)
    public Policy getPolicyById(Long id) {
        return policyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Policy not found with id: " + id));
    }
}
