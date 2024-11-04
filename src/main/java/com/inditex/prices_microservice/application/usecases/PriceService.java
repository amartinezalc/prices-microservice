package com.inditex.prices_microservice.application.usecases;

import com.inditex.prices_microservice.domain.model.dto.PriceDto;

public interface PriceService {
    PriceDto getPrice(int brandId, Long productId, String date);
}
