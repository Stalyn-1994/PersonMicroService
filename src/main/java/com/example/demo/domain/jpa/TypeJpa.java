package com.example.demo.domain.jpa;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="type",schema = "manage_customer")
public class TypeJpa {
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       Integer id;
       String name;
}
