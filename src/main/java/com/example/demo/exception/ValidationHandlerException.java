package com.example.demo.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
@Log4j2
public class ValidationHandlerException {
    @ExceptionHandler(BadRequestException.class)
    ResponseEntity<Object> onBadRequestException(BadRequestException badRequestException){
        log.error("Error validate active status:{}",badRequestException.getErrorDto());
        return new ResponseEntity<Object>(badRequestException.getErrorDto(),HttpStatus.BAD_REQUEST);
    }
}
