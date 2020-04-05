package com.github.jander99.cartogram.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="sku_mappings")
@Data
public class SkuMapping {

    @Id
    private Long sku;

    @OneToOne
    @JoinColumns(value = {
            @JoinColumn(name = "departmentNumber", referencedColumnName = "departmentNumber"),
            @JoinColumn(name = "classNumber", referencedColumnName = "classNumber"),
            @JoinColumn(name = "subclassNumber", referencedColumnName = "subclassNumber")
    })
    private Hierarchy hierarchy;

    @OneToOne
    @JoinColumn(name = "goodsServiceCode", referencedColumnName = "goodsServiceCode")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "goodsServiceCode")
    @JsonIdentityReference(alwaysAsId = true)
    private GoodsServiceCode goodsServiceCode;

    @OneToOne
    @JoinColumn(name = "productCode", referencedColumnName = "productCode")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "productCode")
    @JsonIdentityReference(alwaysAsId = true)
    private ProductCode productCode;

}
