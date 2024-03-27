package com.example.SpringBookExamples.Service.impl;

import com.example.SpringBookExamples.Models.Student;
import com.example.SpringBookExamples.Repository.StudentRepository;
import com.example.SpringBookExamples.Service.StudentService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService {
    private final StudentRepository reposotiry;
    @Override
    public List<Student> findAll() {
        return reposotiry.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return reposotiry.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return reposotiry.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return reposotiry.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(String email) {
        reposotiry.deleteByEmail(email);
    }
}
