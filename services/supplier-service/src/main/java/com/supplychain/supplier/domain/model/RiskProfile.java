package com.supplychain.supplier.domain.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RiskProfile {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String riskScore;
    private String lastEvaluatedAt; 
    private String supplier;
}
