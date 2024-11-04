package com.inditex.prices_microservice.infrastructure.adapter.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.io.Serial;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PriceException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    private HttpStatus errorCode;
    private String errorMessage;
}