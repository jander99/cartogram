package com.github.jander99.cartogram.entity;

import org.springframework.beans.factory.annotation.Value;

public interface SkuMappingView {

    @Value("#{target.sku}")
    Long getSku();

    @Value("#{target.productCode.productCode}")
    String getProductCode();

    @Value("#{target.hierarchy.departmentName + ' / ' + target.hierarchy.className + ' / ' + target.hierarchy.subclassName}")
    String getHierarchy();

}
