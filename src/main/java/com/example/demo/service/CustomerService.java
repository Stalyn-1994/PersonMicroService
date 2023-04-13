package com.example.demo.service;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.domain.dto.CustomersDto;
import com.example.demo.domain.jpa.CustomerJpa;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface CustomerService {

    String validateIdentification(CustomerDto customerDto,String channel) throws JsonProcessingException;
    Integer saveCustomer(CustomersDto customersDto);

    int saveStatus(String identification);

    List<CustomerJpa> findCustomerJpaByType(String type);
}
