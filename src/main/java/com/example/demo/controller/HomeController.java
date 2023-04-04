package com.example.demo.controller;

import com.example.demo.domain.jpa.CustomerJpa;
import com.example.demo.domain.jpa.TypeJpa;
import com.example.demo.repository.CustomerRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class HomeController {

  CustomerRepository customerRepository;

  @GetMapping("/user")
  public ResponseEntity<?> createUser() {
    return new ResponseEntity<>(customerRepository.save(CustomerJpa.builder()
        .firstName("Izack")
        .lastName("Guairacaja")
        .type(TypeJpa.builder()
            .name("Arquitecto de datos")
            .build())
        .build()), HttpStatus.OK);
  }

}