package com.inditex.prices_microservice.infrastructure.adapter.mapper;

import com.inditex.prices_microservice.domain.model.Price;
import com.inditex.prices_microservice.infrastructure.adapter.entity.PriceEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceDboMapper {

    PriceEntity toDbo(Price domain);

    @InheritInverseConfiguration
    Price toDomain(PriceEntity entity);
}
