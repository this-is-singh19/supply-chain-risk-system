package com.supplychain.supplier.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "compliance_records")
public class ComplianceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
    

    private enum ComplianceType{
        ISO_CERTIFICATION, 
        REGULATORY, 
        AUDIT, 
        CONTRACT;
    }
    @Enumerated(EnumType.STRING)
    private ComplianceType complianceType;
    private String standard;
    private enum Status {
        COMPLIANT, 
        NON_COMPLIANT, 
        PENDING, 
        EXPIRED;
    }
    @Enumerated(EnumType.STRING)
    private Status status;
    private String certificateNumber; 
    private String issuingAuthority;
    private LocalDate issueDate;
    private LocalDate nextAuditDue; 
}
