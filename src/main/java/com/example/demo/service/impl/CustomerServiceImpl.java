package com.example.demo.service.impl;

import com.example.demo.domain.jpa.CustomerJpa;
import com.example.demo.domain.jpa.StatusJpa;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.StatusRepository;
import com.example.demo.service.CustomerService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Log4j2
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

  CustomerRepository customerRepository;
  StatusRepository statusRepository;

  @Override
  @Transactional
  public int save(CustomerJpa customerJpa) {
    customerRepository.save(customerJpa);
    return statusRepository.save(
        StatusJpa.builder().identification(customerJpa.getIdentification()).status(Boolean.TRUE)
            .build()).getId();
  }
}
