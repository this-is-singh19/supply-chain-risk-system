package com.supplychain.supplier.domain.mapper;

import com.supplychain.supplier.domain.dto.SupplierDto;
import com.supplychain.supplier.domain.model.Supplier;

@Mapper(componentModel = "spring")
public interface SupplierMapper {
    SupplierDto toDto(Supplier entity);
    Supplier toEntity(SupplierDto dto);
}
