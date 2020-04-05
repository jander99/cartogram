package com.github.jander99.cartogram.controller;

import com.github.jander99.cartogram.entity.ProductCode;
import com.github.jander99.cartogram.repository.ProductCodeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@Slf4j
public class ProductCodeController {

    private ProductCodeRepository productCodeRepository;

    public ProductCodeController(ProductCodeRepository productCodeRepository) {
        this.productCodeRepository = productCodeRepository;
    }

    @GetMapping("api/v1/product-codes")
    public ResponseEntity<List<ProductCode>> getAllProductCodes() {
        return ResponseEntity.ok(StreamSupport.stream(productCodeRepository.findAll().spliterator(), false).collect(Collectors.toList()));
    }

}
