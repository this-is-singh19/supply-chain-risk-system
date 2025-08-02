package com.supplychain.supplier.domain.model;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ComplianceRecord {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String complianceType;
    private String status; 
    private Date issuedDate;
    private String supplier;

}
