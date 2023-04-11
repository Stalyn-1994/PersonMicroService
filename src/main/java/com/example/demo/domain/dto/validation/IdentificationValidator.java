package com.example.demo.domain.dto.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class IdentificationValidator implements ConstraintValidator<Identification,String>{
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return !Objects.isNull(value)  && value.length()==10 && value.matches("^[0-9]+$");
    }
}
