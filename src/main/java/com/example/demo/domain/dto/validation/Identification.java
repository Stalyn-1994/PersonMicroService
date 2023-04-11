package com.example.demo.domain.dto.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = IdentificationValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Identification {
    String message() default "Invalid Ecuadorian identification";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
