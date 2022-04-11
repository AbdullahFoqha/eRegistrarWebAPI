package edu.miu.eregistrarwebapi.controller;

import edu.miu.eregistrarwebapi.model.Student;
import edu.miu.eregistrarwebapi.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = { "api/student"})
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = {"/list"})
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

}
