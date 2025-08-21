package com.supplychain.supplier.domain.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RiskProfileSummaryDto {
    private Long id;
    private Long supplierId;
    private String supplierName;               // Joined from Supplier
    private BigDecimal overallRiskScore;
    private String riskLevel;
    private LocalDateTime lastAssessmentDate;
}
