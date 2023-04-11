package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.domain.jpa.CustomerJpa;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class CustomerRepositoryTest {

  @Autowired
  CustomerRepository customerRepository;

  @Test
  void givenCustomerTypeShouldShouldReturnCustomerJpa() {
    List<CustomerJpa> listaMovimientos = customerRepository
        .getCustomerJpaByType("Administrador");
    assertEquals(listaMovimientos.size(), 2);
  }
}