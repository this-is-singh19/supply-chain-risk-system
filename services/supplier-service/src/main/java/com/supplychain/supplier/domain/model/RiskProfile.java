package com.supplychain.supplier.domain.model;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "risk_profile")
public class RiskProfile {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    private BigDecimal overallRiskScore;
    private enum RiskLevel{
        LOW,
        MEDIUM,
        HIGH,
        CRITICAL;
    }
    @Enumerated(EnumType.STRING)
    private RiskLevel riskLevel;
    private BigDecimal financialRiskScore;
    private BigDecimal operationalRiskScore;
    private BigDecimal complianceRiskScore;
    private LocalDateTime lastAssessmentDate;
    private LocalDateTime nextAssessmentDate;
    @ElementCollection
    private List<String> riskFactors;
    @ElementCollection
    private List<String> mitigationActions;
}
