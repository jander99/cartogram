package com.github.jander99.cartogram.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
public class ProductCode {

    @Id
    private Integer productCode;

    private String description;

    private LocalDateTime created;

    private String createdBy;

    private LocalDateTime updated;

    private String updatedBy;

    @OneToMany(mappedBy = "pc")
    Set<SovosCodeMapping> sovosCodeMappings;

}
