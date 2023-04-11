package com.example.demo.exception;

import com.example.demo.domain.dto.errorDto.ErrorDto;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;

@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class BadRequestException extends RuntimeException {
      @Getter
      ErrorDto errorDto;

      public BadRequestException(ErrorDto errorDto){
          this.errorDto =errorDto;
      }


}
