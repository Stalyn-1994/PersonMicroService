package com.example.demo.repository;

import com.example.demo.domain.jpa.CustomerJpa;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerJpa, Integer> {

}
