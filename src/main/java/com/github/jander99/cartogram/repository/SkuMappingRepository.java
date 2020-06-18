package com.github.jander99.cartogram.repository;

import com.github.jander99.cartogram.entity.SkuMapping;
import com.github.jander99.cartogram.entity.SkuMappingView;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkuMappingRepository extends PagingAndSortingRepository<SkuMapping, Long> {
    SkuMappingView findBySku(Long sku);
}
