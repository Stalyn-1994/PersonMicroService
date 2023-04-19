package com.example.demo.controller;

import com.example.demo.domain.dto.CustomerDto;
import com.example.demo.domain.jpa.CustomerJpa;
import com.example.demo.service.CustomerService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class HomeController {

  CustomerService customerService;

  @GetMapping("/user")
  public ResponseEntity<?> createUser(@RequestBody CustomerDto customerDto) {
    return new ResponseEntity<>(customerService.save(customerDto), HttpStatus.OK);
  }

}