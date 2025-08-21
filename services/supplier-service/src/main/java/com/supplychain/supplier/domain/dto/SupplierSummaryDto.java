package com.supplychain.supplier.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupplierSummaryDto implements Serializable {
    private Long id;
    private String name;
    private String contactEmail;
    private String contactPhone;
    private String country;
    private boolean active;
}
