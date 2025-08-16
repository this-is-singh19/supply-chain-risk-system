package com.supplychain.supplier.domain.mapper;

import com.supplychain.supplier.domain.dto.RiskProfileDto;
import com.supplychain.supplier.domain.dto.SupplierDto;
import com.supplychain.supplier.domain.model.RiskProfile;

@Mapper(componentModel = "spring")
public interface RiskProfileMapper {
    RiskProfileDto toDto(RiskProfile entity);
    RiskProfile toEntity(RiskProfileDto dto);
}
