package com.example.demo.repository;

import com.example.demo.domain.jpa.CustomerJpa;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<CustomerJpa, Integer> {

  @Query("SELECT customer from CustomerJpa customer where customer.type.name = :name")
  List<CustomerJpa> getCustomerJpaByType(@Param("name") String name);
}
