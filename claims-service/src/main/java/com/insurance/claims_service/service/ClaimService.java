package com.insurance.claims_service.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.insurance.claims_service.dto.PolicyDTO;
import com.insurance.claims_service.exception.ResourceNotFoundException;
import com.insurance.claims_service.model.Claim;
import com.insurance.claims_service.repository.*;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClaimService {
    private final ClaimsRepository claimsRepository;
    private final RestTemplate restTemplate;
    @Value("${services.policy-service.url}")
    private String policyServiceUrl;

    public Claim createClaim(Long policyId, Claim claim) {
        String policyUrl = policyServiceUrl + "/" + policyId;
        try {
            PolicyDTO policy = restTemplate.getForObject(policyUrl, PolicyDTO.class);
            if (policy == null) {
                throw new ResourceNotFoundException("Policy not found on the network");
            }
            return claimsRepository.save(claim);
        } catch (Exception e) {
            throw new ResourceNotFoundException("Policy service is down or policy Id is invalid");
        }
    }

}
