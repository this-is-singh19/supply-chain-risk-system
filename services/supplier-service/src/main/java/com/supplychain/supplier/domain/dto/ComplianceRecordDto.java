package com.supplychain.supplier.domain.dto;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComplianceRecordDto {
    private Long id;
    private Long supplierId;
    private String supplierName;               // Joined field for convenience
    private String complianceType;            // ISO_CERTIFICATION, REGULATORY, etc.
    private String standard;                   // "ISO 9001", "SOX", etc.
    private String status;                     // COMPLIANT, NON_COMPLIANT, etc.
    private String certificateNumber;
    private String issuingAuthority;
    private LocalDate issueDate;
    private LocalDate expiryDate;             // Add this field
    private LocalDate nextAuditDue;
}
