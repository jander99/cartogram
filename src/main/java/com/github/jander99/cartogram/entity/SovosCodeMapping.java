package com.github.jander99.cartogram.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sovos_code_mappings")
@Data
@EntityListeners(AuditingEntityListener.class)
public class SovosCodeMapping {

    @EmbeddedId
    @JsonIgnore
    private SovosCodeMappingKey id;

    @ManyToOne
    @MapsId("pc_id")
    @JoinColumn(name = "pc_id")
    @JsonManagedReference
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "productCode")
    @JsonIdentityReference(alwaysAsId = true)
    private ProductCode productCode;

    @ManyToOne
    @MapsId("gsc_id")
    @JoinColumn(name = "gsc_id")
    @JsonManagedReference
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "goodsServiceCode")
    @JsonIdentityReference(alwaysAsId = true)
    private GoodsServiceCode goodsServiceCode;

    @CreatedDate
    @JsonIgnore
    private LocalDateTime created;

    @CreatedBy
    @JsonIgnore
    private String createdBy;

    @LastModifiedDate
    @JsonIgnore
    private LocalDateTime updated;

    @LastModifiedBy
    @JsonIgnore
    private String updatedBy;

}
