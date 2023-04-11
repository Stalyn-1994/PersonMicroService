package com.example.demo.domain.dto;

import com.example.demo.domain.dto.validation.Identification;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.*;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {
    @Identification
    String identification;
    @NotNull
    @Size(min = 0,max=10, message = "Type Identication incorrect" )
    @JsonProperty("IdentificationType")
    String identificationType;

    @NotBlank(message= "Phone number mandatory")
    String phoneNumber;
    @Builder.Default
    boolean active =true;

    @Min(value= 0,message="Min value find")
    @Max(value= 100,message="Max value find")
    float salary;
    @Email
    String mail;

}
