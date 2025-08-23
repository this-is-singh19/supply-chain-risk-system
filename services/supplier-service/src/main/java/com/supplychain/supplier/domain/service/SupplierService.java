package com.supplychain.supplier.domain.service;

import com.supplychain.supplier.domain.model.Supplier;
import com.supplychain.supplier.domain.repository.SupplierRepository;
import com.supplychain.supplier.kafka.SupplierEventProducer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
    private final SupplierRepository repository;
    private final SupplierEventProducer producer;

    public SupplierService(SupplierRepository repository, SupplierEventProducer producer) {
        this.repository = repository;
        this.producer = producer;
    }

    public List<Supplier> getAll() {
        return repository.findAll();
    }

    public Supplier getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Supplier create(Supplier supplier) {
        Supplier saved = repository.save(supplier);
        producer.sendEvent("SUPPLIER_CREATED", saved);
        return saved;
    }

    public Supplier update(Long id, Supplier supplier) {
        Supplier existing = getById(id);

        existing.setSupplierCode(supplier.getSupplierCode());
        existing.setCompanyName(supplier.getCompanyName());
        existing.setLegalName(supplier.getLegalName());
        existing.setEmail(supplier.getEmail());
        existing.setPhone(supplier.getPhone());
        existing.setCountry(supplier.getCountry());
        existing.setRegion(supplier.getRegion());
        existing.setSupplierType(supplier.getSupplierType());
        existing.setBusinessRegistrationNumber(supplier.getBusinessRegistrationNumber());
        existing.setTaxId(supplier.getTaxId());
        existing.setStatus(supplier.getStatus());
        existing.setOnboardingDate(supplier.getOnboardingDate());

        Supplier updated = repository.save(existing);
        producer.sendEvent("SUPPLIER_UPDATED", updated);
        return updated;
    }

    public void delete(Long id) {
        Supplier supplier = getById(id);
        repository.deleteById(id);
        producer.sendEvent("SUPPLIER_DELETED", supplier);
    }
}
