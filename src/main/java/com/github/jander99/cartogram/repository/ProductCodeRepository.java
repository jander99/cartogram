package com.github.jander99.cartogram.repository;

import com.github.jander99.cartogram.entity.ProductCode;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCodeRepository extends PagingAndSortingRepository<ProductCode, Long> {
}
