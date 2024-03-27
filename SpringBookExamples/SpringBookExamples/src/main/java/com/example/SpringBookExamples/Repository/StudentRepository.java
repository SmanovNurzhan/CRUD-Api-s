package com.example.SpringBookExamples.Repository;

import com.example.SpringBookExamples.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
        void deleteByEmail(String email);
        Student findByEmail(String email);
}
