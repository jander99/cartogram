package com.github.jander99.cartogram.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
public class GoodsServiceCode {

    @Id
    private Integer goodsServiceCode;

    private String description;

    private LocalDateTime created;

    private String createdBy;

    private LocalDateTime updated;

    private String udpatedBy;

    @OneToMany(mappedBy = "gsc")
    Set<SovosCodeMapping> sovosCodeMappings;
}
