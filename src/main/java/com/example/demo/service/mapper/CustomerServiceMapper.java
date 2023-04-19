package com.example.demo.service.mapper;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.domain.jpa.CustomerJpa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerServiceMapper {

  @Mapping(target = "lastName",source = "apellido")
  CustomerJpa toCustomerJpa(CustomerDto customerDto);
}
