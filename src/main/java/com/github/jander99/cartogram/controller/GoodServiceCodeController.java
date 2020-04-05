package com.github.jander99.cartogram.controller;

import com.github.jander99.cartogram.entity.GoodsServiceCode;
import com.github.jander99.cartogram.entity.ProductCode;
import com.github.jander99.cartogram.repository.GoodsServiceCodeRepository;
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
public class GoodServiceCodeController {

    private GoodsServiceCodeRepository goodsServiceCodeRepository;

    public GoodServiceCodeController(GoodsServiceCodeRepository goodsServiceCodeRepository) {
        this.goodsServiceCodeRepository = goodsServiceCodeRepository;
    }

    @GetMapping("api/v1/goods-service-codes")
    public ResponseEntity<List<GoodsServiceCode>> getAllProductCodes() {
        return ResponseEntity.ok(StreamSupport.stream(goodsServiceCodeRepository.findAll().spliterator(), false).collect(Collectors.toList()));
    }

}
