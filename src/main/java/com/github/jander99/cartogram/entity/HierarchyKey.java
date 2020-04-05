package com.github.jander99.cartogram.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class HierarchyKey implements Serializable {

    @Column(name = "departmentNumber")
    private Long departmentNumber;

    @Column(name = "classNumber")
    private Long classNumber;

    @Column(name = "subclassNumber")
    private Long subclassNumber;

}
