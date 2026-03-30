package com.insurance.claims_service.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "claims")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Claim {
    @Id
    private String id;
    private String policyNumber;
    private String description;
    private Double claimAmount;
    private LocalDate incidentDate;
    private String status;
}