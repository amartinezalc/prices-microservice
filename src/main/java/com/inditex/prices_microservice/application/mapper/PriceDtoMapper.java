package com.inditex.prices_microservice.application.mapper;

import com.inditex.prices_microservice.domain.model.Price;
import com.inditex.prices_microservice.domain.model.dto.PriceDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceDtoMapper {
    PriceDto toDto(Price domain);
}

