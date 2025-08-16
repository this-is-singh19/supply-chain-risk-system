package com.supplychain.supplier.domain.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supplychain.supplier.domain.model.Supplier;


public interface SupplierRepository extends JpaRepository<Supplier,Long> {

}
