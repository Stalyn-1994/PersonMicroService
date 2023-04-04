package com.example.demo.service;

import com.example.demo.domain.jpa.CustomerJpa;

public interface CustomerService {

  int save(CustomerJpa customerJpa);
}
