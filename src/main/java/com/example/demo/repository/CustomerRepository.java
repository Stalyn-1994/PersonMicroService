package com.example.demo.repository;

import com.example.demo.domain.jpa.CustomerJpa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerJpa,Integer> {
    @Query(value="SELECT customer from CustomerJpa customer where customer.userType.name =:name")
    Collection<CustomerJpa> findAllCustomer(@Param("name") String name);
}
