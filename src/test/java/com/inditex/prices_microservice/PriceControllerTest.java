package com.inditex.prices_microservice;

import com.inditex.prices_microservice.domain.model.dto.PriceDto;
import com.inditex.prices_microservice.infrastructure.rest.controller.PriceController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PriceControllerTest {

    @Autowired
    PriceController priceController;

    private final int brandId = 1;
    private final Long productId = 35455L;
    private final DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Test
    public void test1() throws ParseException {
        String stringDate = "2020-06-14 10:00:00";

        PriceDto result = priceController.getPrice(brandId, productId, stringDate);

        Date date = formatter.parse(stringDate);

        assertNotNull(result);

        assertEquals(brandId, result.getBrandId());
        assertEquals(productId, result.getProductId());
        assertTrue(date.after(result.getStartDate()));
        assertTrue(date.before(result.getEndDate()));
    }

    @Test
    public void test2() throws ParseException {
        String stringDate = "2020-06-14 16:00:00";

        PriceDto result = priceController.getPrice(brandId, productId, stringDate);

        Date date = formatter.parse(stringDate);

        assertNotNull(result);

        assertEquals(brandId, result.getBrandId());
        assertEquals(productId, result.getProductId());
        assertTrue(date.after(result.getStartDate()));
        assertTrue(date.before(result.getEndDate()));
    }

    @Test
    public void test3() throws ParseException {
        String stringDate = "2020-06-14 21:00:00";

        PriceDto result = priceController.getPrice(brandId, productId, stringDate);

        Date date = formatter.parse(stringDate);

        assertNotNull(result);

        assertEquals(brandId, result.getBrandId());
        assertEquals(productId, result.getProductId());
        assertTrue(date.after(result.getStartDate()));
        assertTrue(date.before(result.getEndDate()));
    }

    @Test
    public void test4() throws ParseException {
        String stringDate = "2020-06-15 10:00:00";

        PriceDto result = priceController.getPrice(brandId, productId, stringDate);

        Date date = formatter.parse(stringDate);

        assertNotNull(result);

        assertEquals(brandId, result.getBrandId());
        assertEquals(productId, result.getProductId());
        assertTrue(date.after(result.getStartDate()));
        assertTrue(date.before(result.getEndDate()));
    }

    @Test
    public void test5() throws ParseException {
        String stringDate = "2020-06-16 21:00:00";

        PriceDto result = priceController.getPrice(brandId, productId, stringDate);

        Date date = formatter.parse(stringDate);

        assertNotNull(result);

        assertEquals(brandId, result.getBrandId());
        assertEquals(productId, result.getProductId());
        assertTrue(date.after(result.getStartDate()));
        assertTrue(date.before(result.getEndDate()));
    }
}
