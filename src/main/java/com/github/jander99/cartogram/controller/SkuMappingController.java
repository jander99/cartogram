package com.github.jander99.cartogram.controller;

import com.github.jander99.cartogram.entity.SkuMapping;
import com.github.jander99.cartogram.entity.SkuMappingView;
import com.github.jander99.cartogram.repository.SkuMappingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Slf4j
@RestController
@RequestMapping(path="/api/v1/sku-mappings")
public class SkuMappingController {

    SkuMappingRepository skuMappingRepository;

    public SkuMappingController(SkuMappingRepository skuMappingRepository) {
        this.skuMappingRepository = skuMappingRepository;
    }

    @GetMapping()
    public ResponseEntity<List<SkuMapping>> getAllSkus() {

        return ResponseEntity.ok(StreamSupport.stream(skuMappingRepository.findAll().spliterator(), false).collect(Collectors.toList()));
    }

    @GetMapping(path = "/api/v1/sku-mappings/{sku}")
    public ResponseEntity<SkuMappingView> getSku(@PathVariable("sku") Long sku) {
        return ResponseEntity.ok(skuMappingRepository.findBySku(sku));
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SkuMappingView> postSku(@RequestBody SkuMapping skuMapping) {
        Long sku = skuMappingRepository.save(skuMapping).getSku();
        return ResponseEntity.ok(skuMappingRepository.findBySku(sku));
    }

}
