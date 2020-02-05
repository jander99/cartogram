package com.github.jander99.cartogram.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class SovosCodeMappingKey implements Serializable {

    @Column(name = "pc_id")
    private Long pcId;

    @Column(name = "gsc_id")
    private Long gscId;
}
