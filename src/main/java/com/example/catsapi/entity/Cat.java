package com.example.catsapi.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Cat {

    @Id
    private String id;
    private String name;
    private LocalDate birth_day;
    private LocalDateTime createdAt;
}
