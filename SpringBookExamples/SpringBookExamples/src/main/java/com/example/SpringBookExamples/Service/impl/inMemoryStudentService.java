package com.example.SpringBookExamples.Service.impl;

import com.example.SpringBookExamples.Models.Student;
import com.example.SpringBookExamples.Repository.inMemoryStudentsDAO;
import com.example.SpringBookExamples.Service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class inMemoryStudentService implements StudentService {
    private final inMemoryStudentsDAO repository;
    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
