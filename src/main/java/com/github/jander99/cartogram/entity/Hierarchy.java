package com.github.jander99.cartogram.entity;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hierarchies")
@Data
public class Hierarchy {

    @EmbeddedId
    @JsonUnwrapped
    private HierarchyKey id;

    private String departmentName;

    private String className;

    private String subclassName;
}
