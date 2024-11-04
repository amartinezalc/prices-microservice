package com.inditex.prices_microservice.infrastructure.rest.advice;

import com.inditex.prices_microservice.infrastructure.adapter.exception.PriceException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(PriceException.class)
    public ResponseEntity<String> handleEmptyInput(PriceException emptyInputException) {
        return new ResponseEntity<String>(emptyInputException.getErrorMessage(), emptyInputException.getErrorCode());
    }
}
