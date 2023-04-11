package com.example.demo.service;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.domain.jpa.CustomerJpa;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface CustomerService {

    String validateIdentification(CustomerDto customerDto,String channel) throws JsonProcessingException;
    Integer saveCustomer(CustomerJpa customerJpa);
}
