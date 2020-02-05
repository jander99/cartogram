package com.github.jander99.cartogram.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class SovosCodeMapping {

    @EmbeddedId
    private SovosCodeMappingKey id;

    @ManyToOne
    @MapsId("pc")
    @JoinColumn(name = "pc_id")
    private ProductCode pc;

    @ManyToOne
    @MapsId("gsc_id")
    @JoinColumn(name = "gsc_id")
    private GoodsServiceCode gsc;

    private LocalDateTime created;

    private String createdBy;

    private LocalDateTime updated;

    private String updatedBy;

}
