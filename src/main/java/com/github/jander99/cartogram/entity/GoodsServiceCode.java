package com.github.jander99.cartogram.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "goods_service_codes")
@Data
public class GoodsServiceCode {

    @Id
    private Integer goodsServiceCode;

    private String description;

    @JsonIgnore
    private LocalDateTime created;

    @JsonIgnore
    private String createdBy;

    @JsonIgnore
    private LocalDateTime updated;

    @JsonIgnore
    private String udpatedBy;

    @OneToMany(mappedBy = "goodsServiceCode")
    @JsonBackReference
    @JsonIgnore
    Set<SovosCodeMapping> sovosCodeMappings;
}
