package edu.miu.eregistrarwebapi.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false)
    private Long studentId;

    @NotEmpty
    @NotBlank(message = "Student Number Must Not Be Empty Or Blank")
    @Column(nullable = false, unique = true)
    private String studentNumber;

    @NotEmpty
    @NotBlank(message = "Student First Name Must Not Be Empty Or Blank")
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = true)
    private String middleName;

    @NotEmpty
    @NotBlank(message = "Student Last Name Must Not Be Empty Or Blank")
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = true)
    private String cgpa;

    @NotEmpty
    @NotBlank(message = "Enrollment Date Must Not Be Empty Or Blank")
    @Column(nullable = false)
    private LocalDate enrollmentDate;

    @NotEmpty
    @NotBlank(message = "Is International Must Not Be Empty Or Blank")
    @Column(nullable = false)
    private String isInternational;

    public Student() {
    }

    public Student(Long studentId, String studentNumber, String firstName, String middleName, String lastName, String cgpa, LocalDate enrollmentDate, String isInternational) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(String isInternational) {
        this.isInternational = isInternational;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
