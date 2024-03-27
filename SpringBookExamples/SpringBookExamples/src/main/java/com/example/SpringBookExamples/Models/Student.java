package com.example.SpringBookExamples.Models;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    private String first_name;
    private String last_name;
    private LocalDate birthday;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;

    public int getAge() {
        return Period.between(birthday,LocalDate.now()).getYears();
    }
}
