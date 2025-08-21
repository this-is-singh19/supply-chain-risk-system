package com.supplychain.supplier.domain.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RiskAssessmentDto {
    private Long id;
    private String supplierName;
    private String riskLevel;
    private String assessmentDate;
    private String assessedBy;
}
