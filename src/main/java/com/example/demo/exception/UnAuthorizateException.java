package com.example.demo.exception;

import com.example.demo.domain.dto.errorDto.ErrorDto;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class UnAuthorizateException extends RuntimeException{

    @Getter
    ErrorDto errorDto;

    public UnAuthorizateException(ErrorDto errorDto){
        this.errorDto =errorDto;
    }
}
