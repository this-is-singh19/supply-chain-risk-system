package com.supplychain.supplier.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supplychain.supplier.domain.model.RiskProfile;

public interface RiskProfileRepository extends JpaRepository<RiskProfile,Long> {

}
