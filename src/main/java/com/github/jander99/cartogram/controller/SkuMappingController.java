package com.github.jander99.cartogram.controller;

import com.github.jander99.cartogram.entity.SkuMapping;
import com.github.jander99.cartogram.repository.SkuMappingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@Slf4j
public class SkuMappingController {

    SkuMappingRepository skuMappingRepository;

    public SkuMappingController(SkuMappingRepository skuMappingRepository) {
        this.skuMappingRepository = skuMappingRepository;
    }

    @GetMapping(path = "/api/v1/sku-mappings")
    public ResponseEntity<List<SkuMapping>> getAllSkus() {

        return ResponseEntity.ok(StreamSupport.stream(skuMappingRepository.findAll().spliterator(), false).collect(Collectors.toList()));
    }

}
