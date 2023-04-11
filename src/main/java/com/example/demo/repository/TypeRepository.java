package com.example.demo.repository;

import com.example.demo.domain.jpa.TypeJpa;
import org.springframework.data.repository.CrudRepository;

public interface TypeRepository extends CrudRepository<TypeJpa,Integer> {
}
