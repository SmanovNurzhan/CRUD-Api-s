package com.example.SpringBookExamples.Service;

import com.example.SpringBookExamples.Models.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
