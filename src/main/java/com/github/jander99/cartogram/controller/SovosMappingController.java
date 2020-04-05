package com.github.jander99.cartogram.controller;

import com.github.jander99.cartogram.entity.SovosCodeMapping;
import com.github.jander99.cartogram.repository.SovosCodeMappingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@Slf4j
public class SovosMappingController {

    private SovosCodeMappingRepository sovosCodeMappingRepository;

    public SovosMappingController(SovosCodeMappingRepository sovosCodeMappingRepository) {
        this.sovosCodeMappingRepository = sovosCodeMappingRepository;
    }

    @GetMapping("api/v1/sovos-mappings")
    public ResponseEntity<List<SovosCodeMapping>> getAllSovosMappings() {
        return ResponseEntity.ok(StreamSupport.stream(sovosCodeMappingRepository.findAll().spliterator(), false).collect(Collectors.toList()));
    }
}
