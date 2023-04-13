package com.example.demo.domain.dto;


import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomersDto {

    String firstName;
    String apellido;
    String identification;
    TypeDto userType;
}
