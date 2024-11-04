package com.inditex.prices_microservice.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PriceDto {
    private int brandId;
    private Date startDate;
    private Date endDate;
    private int priceList;
    private Long productId;
    private Double price;
    private String curr;
}