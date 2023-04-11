package com.example.demo.repository;

import com.example.demo.domain.jpa.StatusJpa;
import org.springframework.data.repository.CrudRepository;

public interface StatusRepository extends CrudRepository<StatusJpa,Integer> {
}
