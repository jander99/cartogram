package com.github.jander99.cartogram.repository;

import com.github.jander99.cartogram.entity.SkuMapping;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkuMappingRepository extends PagingAndSortingRepository<SkuMapping, Long> {
}
