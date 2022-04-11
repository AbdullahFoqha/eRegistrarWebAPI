package edu.miu.eregistrarwebapi.service;

import edu.miu.eregistrarwebapi.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student SaveUpdateStudent(Student student);

    Student getStudentById(Long studentId);

    void deleteStudent(Long studentId);
}
