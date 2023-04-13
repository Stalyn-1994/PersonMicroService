package com.example.demo.service.impl;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.domain.dto.CustomersDto;
import com.example.demo.domain.dto.errorDto.ErrorDto;
import com.example.demo.domain.jpa.CustomerJpa;
import com.example.demo.domain.jpa.StatusJpa;
import com.example.demo.exception.BadRequestException;
import com.example.demo.exception.UnAuthorizateException;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.StatusRepository;
import com.example.demo.service.CustomerService;
import com.example.demo.service.mapper.CustomerServiceMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
@Log4j2
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CustomerServiceImpl implements CustomerService{
    ObjectMapper objectMapper = new ObjectMapper();
    CustomerRepository customerRepository;
    StatusRepository statusRepository;
    CustomerServiceMapper customerServiceMapper;

    @Override
    public String validateIdentification(CustomerDto customerDto,String channel) throws JsonProcessingException {
        log.info("channel send:{} toBodyRequest:{}",channel,objectMapper.writeValueAsString(customerDto) );
        if(customerDto.isActive()){
            return "OK";
        }
        // ErrorDto dto = new ErrorDto();
        // dto.setMessage(channel);
        //dto.setStatus(400);
        //throw new BadRequestException(dto);
        throw new BadRequestException(ErrorDto.builder().status(400).message("Customer is inactive").build());
        //return customerDto.getIdentification().length()==10?"ok":"error";
    }

    @Override
    @Transactional
    public Integer saveCustomer(CustomersDto customersDto) {
       CustomerJpa customerJpa = customerServiceMapper.toCustomerJpa(customersDto);
         customerRepository.save(customerJpa).getId();
        return saveStatus(customerJpa.getIdentification());
    }


    public int saveStatus(String identificacion){
        if(!identificacion.isEmpty()){
            return statusRepository.save(StatusJpa.builder().identification(identificacion).status(Boolean.TRUE).build()).getId();
        }
        throw new UnAuthorizateException(ErrorDto.builder().status(401).message("Customer not authorizate").build());
    }

    @Override
    public List<CustomerJpa> findCustomerJpaByType(String type) {
        return (List<CustomerJpa>)  customerRepository.findAllCustomer(type);
    }
}
