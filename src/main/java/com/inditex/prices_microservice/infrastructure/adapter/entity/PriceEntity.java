package com.inditex.prices_microservice.infrastructure.adapter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@IdClass(PriceIdEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PriceEntity {
    @Id
    private int brandId;
    @Id
    private Date startDate;
    @Id
    private Date endDate;
    @Id
    private int priceList;
    @Id
    private Long productId;
    @Id
    private int priority;
    private Double price;
    private String curr;
}
