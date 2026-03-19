package com.insurance.policy_service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "policies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String policyNumber;
    private String holderName;
    private String status;
    private Double premiumAmount;
}