package com.inditex.prices_microservice.infrastructure.adapter.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PriceIdEntity implements Serializable {
    private int brandId;
    private Date startDate;
    private Date endDate;
    private int priceList;
    private Long productId;
    private int priority;
}
