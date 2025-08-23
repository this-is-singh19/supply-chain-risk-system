package com.supplychain.supplier.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.supplychain.supplier.domain.model.Supplier;

@Service
public class SupplierEventProducer {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public SupplierEventProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendEvent(String eventType, Supplier supplier) {
        Map<String, Object> event = new HashMap<>();
        event.put("eventType", eventType);
        event.put("supplierId", supplier.getId());
        event.put("timestamp", LocalDateTime.now().toString());
        event.put("data", supplier);

        kafkaTemplate.send("supplier-events", supplier.getId().toString(), event);
        System.out.println("📤 Published event: " + event);
    }
}
