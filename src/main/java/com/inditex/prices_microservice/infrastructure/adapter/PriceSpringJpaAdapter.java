package com.inditex.prices_microservice.infrastructure.adapter;

import com.inditex.prices_microservice.domain.model.Price;
import com.inditex.prices_microservice.domain.model.constant.PriceConstant;
import com.inditex.prices_microservice.domain.port.PricePersistencePort;
import com.inditex.prices_microservice.infrastructure.adapter.exception.PriceException;
import com.inditex.prices_microservice.infrastructure.adapter.mapper.PriceDboMapper;
import com.inditex.prices_microservice.infrastructure.adapter.repository.PriceRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Transactional
public class PriceSpringJpaAdapter implements PricePersistencePort {

    private final PriceRepository priceRepository;
    private final PriceDboMapper priceDboMapper;

    @Override
    public Price getPrice(int brandId, Long productId, String date) {
        var optionalPrice = priceRepository.findByBrandIdProductIdAndDate(brandId, productId, date);

        if (optionalPrice.isEmpty()) {
            throw new PriceException(HttpStatus.NOT_FOUND, String.format(PriceConstant.PRODUCT_NOT_FOUND_MESSAGE_ERROR, productId));
        }

        return priceDboMapper.toDomain(optionalPrice.get());
    }
}
