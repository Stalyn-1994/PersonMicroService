package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.domain.jpa.CustomerJpa;
import com.example.demo.domain.jpa.StatusJpa;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.StatusRepository;
import com.example.demo.service.impl.CustomerServiceImpl;
import com.example.demo.service.mapper.CustomerServiceMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

  public static final String IDENTIFICATION = "1111111";
  public static final String FIRST_NAME = "Izack";
  public static final CustomerDto CUSTOMER_DTO = CustomerDto.builder()
      .identification(IDENTIFICATION)
      .firstName(FIRST_NAME)
      .apellido("Guairacaja")
      .build();
  public static final CustomerJpa CUSTOMER_JPA = CustomerJpa.builder()
      .identification(IDENTIFICATION)
      .firstName(FIRST_NAME)
      .build();

  @InjectMocks
  CustomerServiceImpl customerService;
  @Mock
  CustomerRepository customerRepository;
  @Mock
  StatusRepository statusRepository;
  @Mock
  CustomerServiceMapper customerServiceMapper;

  @Test
  void givenCustomerDtoWhenSaveItThenReturnId() {
    when(customerServiceMapper.toCustomerJpa(CUSTOMER_DTO)).thenReturn(CUSTOMER_JPA);
    when(statusRepository.save(StatusJpa.builder()
            .identification(IDENTIFICATION)
            .status(Boolean.TRUE)
        .build())).thenReturn(StatusJpa
        .builder()
            .id(1)
        .build());
    assertEquals(1, customerService.save(CUSTOMER_DTO));
  }


}
