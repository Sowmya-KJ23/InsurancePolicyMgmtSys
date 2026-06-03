package com.insurance.claims_service.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.insurance.claims_service.model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClaimsRepository extends JpaRepository<Claim, Long> {

    // Custom method: Find all claims belonging to one policy
    List<Claim> findByPolicyId(Long policyId);
}