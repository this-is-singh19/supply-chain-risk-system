package com.supplychain.supplier.domain.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComplianceSummaryDto {
    private Long id;
    private Long supplierId;
    private String supplierName;
    private String complianceType;
    private String status;
    private LocalDate expiryDate;
    private boolean isExpiringSoon; 
}
