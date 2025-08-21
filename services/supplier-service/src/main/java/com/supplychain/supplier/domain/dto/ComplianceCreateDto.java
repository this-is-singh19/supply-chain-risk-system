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
public class ComplianceCreateDto {
    private Long supplierId;
    private String complianceType;
    private String standard;
    private String status;
    private String certificateNumber;
    private String issuingAuthority;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private LocalDate nextAuditDue;
}
