package com.supplychain.supplier.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupplierCreateDto {
    private String supplierCode;
    private String companyName;
    private String legalName;
    private String email;
    private String phone;
    private String country;
    private String region;
    private String supplierType;
    private String businessRegistrationNumber;
    private String taxId;
}
