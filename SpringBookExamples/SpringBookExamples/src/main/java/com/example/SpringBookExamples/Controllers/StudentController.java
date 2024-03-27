package com.example.SpringBookExamples.Controllers;

import com.example.SpringBookExamples.Models.Student;
import com.example.SpringBookExamples.Service.StudentService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.JstlUtils;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<Student> findAll(){
        return studentService.findAll();
    }
    @PostMapping("saveStudent")
    public String saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "Student succesfllt saved";
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email){
        return studentService.findByEmail(email);
    }

    @PutMapping("updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
    @DeleteMapping("deleteStudent/{email}")
    public void deleteStudent(@PathVariable String email){
        studentService.deleteStudent(email);
    }

}
