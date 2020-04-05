package com.github.jander99.cartogram.repository;

import com.github.jander99.cartogram.entity.SovosCodeMapping;
import com.github.jander99.cartogram.entity.SovosCodeMappingKey;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SovosCodeMappingRepository extends PagingAndSortingRepository<SovosCodeMapping, SovosCodeMappingKey> {
}
