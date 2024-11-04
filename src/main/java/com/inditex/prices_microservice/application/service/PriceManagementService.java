package com.inditex.prices_microservice.application.service;

import com.inditex.prices_microservice.application.mapper.PriceDtoMapper;
import com.inditex.prices_microservice.application.usecases.PriceService;
import com.inditex.prices_microservice.domain.model.dto.PriceDto;
import com.inditex.prices_microservice.domain.port.PricePersistencePort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PriceManagementService implements PriceService {

    private final PricePersistencePort pricePersistencePort;
    private final PriceDtoMapper priceDtoMapper;

    @Override
    public PriceDto getPrice(int brandId, Long productId, String date) {
        var price = pricePersistencePort.getPrice(brandId, productId, date);

        return priceDtoMapper.toDto(price);
    }
}
