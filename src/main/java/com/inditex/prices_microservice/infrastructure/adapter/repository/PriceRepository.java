package com.inditex.prices_microservice.infrastructure.adapter.repository;

import com.inditex.prices_microservice.infrastructure.adapter.entity.PriceEntity;
import com.inditex.prices_microservice.infrastructure.adapter.entity.PriceIdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, PriceIdEntity> {

    @Query(value = """
            SELECT *
            FROM (
                SELECT *
                FROM PRICE_ENTITY
                WHERE BRAND_ID = :brandId AND PRODUCT_ID = :productId
                  AND :date BETWEEN START_DATE AND END_DATE
                ORDER BY PRIORITY DESC
            )
            LIMIT 1;
            """, nativeQuery = true)
    Optional<PriceEntity> findByBrandIdProductIdAndDate(@Param("brandId") int brandId, @Param("productId") Long productId, @Param("date") String date);
}
