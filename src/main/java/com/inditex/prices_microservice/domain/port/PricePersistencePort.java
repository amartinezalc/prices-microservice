package com.inditex.prices_microservice.domain.port;

import com.inditex.prices_microservice.domain.model.Price;

public interface PricePersistencePort {
    Price getPrice(int brandId, Long productId, String date);
}
