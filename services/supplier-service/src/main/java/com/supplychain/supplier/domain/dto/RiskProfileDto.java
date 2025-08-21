package com.supplychain.supplier.domain.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RiskProfileDto {
    private Long id;
    private Long supplierId;                    // Reference to supplier
    private BigDecimal overallRiskScore;
    private String riskLevel;                   // LOW, MEDIUM, HIGH, CRITICAL
    private BigDecimal financialRiskScore;
    private BigDecimal operationalRiskScore;
    private BigDecimal complianceRiskScore;
    private BigDecimal geopoliticalRiskScore;   // If you add this
    private LocalDateTime lastAssessmentDate;
    private LocalDateTime nextAssessmentDate;
    private List<String> riskFactors;
    private List<String> mitigationActions;
}
