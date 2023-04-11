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
@Table(name="customer",schema = "manage_customer")
public class CustomerJpa {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @Column(name="first_name")
    String firstName;
    @Column(name="last_name")
    String lastName;
    String identification;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_type")
    TypeJpa userType;
}
