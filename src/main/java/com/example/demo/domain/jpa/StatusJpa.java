package com.example.demo.domain.jpa;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="status",schema = "manage_customer")
public class StatusJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String identification;
    boolean status;
}
