package com.supplychain.supplier.domain.mapper;

import com.supplychain.supplier.domain.dto.ComplianceRecordDto;
import com.supplychain.supplier.domain.dto.RiskProfileDto;
import com.supplychain.supplier.domain.model.ComplianceRecord;
import com.supplychain.supplier.domain.model.RiskProfile;

@Mapper(componentModel = "spring")
public interface ComplianceRecordMapper {
    ComplianceRecordDto toDto(ComplianceRecord entity);
    ComplianceRecord toEntity(ComplianceRecordDto dto);
}
