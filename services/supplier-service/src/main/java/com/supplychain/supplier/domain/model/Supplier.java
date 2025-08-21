package com.supplychain.supplier.domain.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL)
    private List<RiskProfile> riskProfiles;
    
    private String supplierCode;
    private String companyName;
    private String legalName;
    private String email;
    private String phone;
    private String country;
    private String region;
    private enum SupplierType {
        MANUFACTURER, 
        DISTRIBUTOR, 
        SERVICE_PROVIDER;
    }
    @Enumerated(EnumType.STRING)
    private SupplierType supplierType;
    private String businessRegistrationNumber;
    private String taxId;
    private enum Status{
        ACTIVE, 
        INACTIVE, 
        SUSPENDED,
        UNDER_REVIEW;
    }
    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDateTime onboardingDate;
    private String businessRegistrationNumber;
    private String taxId;
}
