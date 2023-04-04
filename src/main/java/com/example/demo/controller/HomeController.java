package com.example.demo.controller;

import com.example.demo.controller.dto.MedicDto;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HomeController {


  @GetMapping("/hateos/user")
  public EntityModel<MedicDto> findByIdHatea(@PathVariable("id") Integer id) {

    return
        null;
  }

}