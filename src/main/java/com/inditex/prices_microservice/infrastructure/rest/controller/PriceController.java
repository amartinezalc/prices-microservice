package com.inditex.prices_microservice.infrastructure.rest.controller;

import com.inditex.prices_microservice.application.usecases.PriceService;
import com.inditex.prices_microservice.domain.model.dto.PriceDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/prices")
public class PriceController {

    private final PriceService priceService;

    @GetMapping
    public PriceDto getPrice(@RequestHeader int brandId,
                             @RequestHeader Long productId,
                             @RequestHeader String date) {
        return priceService.getPrice(brandId, productId, date);

    }
}
