package com.projectStudents.CollegeData.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String studentFName;
    private String studentLName;
    private String studentUsername;
    private String studentEmail;
    private String studentPass;
    private Long studentPhone;
    private String studentDOB;
    private String studentGender;
    private String studentAddress;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentFName() {
        return studentFName;
    }

    public void setStudentFName(String studentFName) {
        this.studentFName = studentFName;
    }

    public String getStudentLName() {
        return studentLName;
    }

    public void setStudentLName(String studentLName) {
        this.studentLName = studentLName;
    }

    public String getStudentUsername() {
        return studentUsername;
    }

    public void setStudentUsername(String studentUsername) {
        this.studentUsername = studentUsername;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPass() {
        return studentPass;
    }

    public void setStudentPass(String studentPass) {
        this.studentPass = studentPass;
    }

    public Long getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(Long studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Student(Long studentId, String studentFName, String studentLName, String studentUsername, String studentEmail, String studentPass, Long studentPhone, String studentDOB, String studentGender, String studentAddress) {
        this.studentId = studentId;
        this.studentFName = studentFName;
        this.studentLName = studentLName;
        this.studentUsername = studentUsername;
        this.studentEmail = studentEmail;
        this.studentPass = studentPass;
        this.studentPhone = studentPhone;
        this.studentDOB = studentDOB;
        this.studentGender = studentGender;
        this.studentAddress = studentAddress;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentFName='" + studentFName + '\'' +
                ", studentLName='" + studentLName + '\'' +
                ", studentUsername='" + studentUsername + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentPass='" + studentPass + '\'' +
                ", studentPhone=" + studentPhone +
                ", studentDOB='" + studentDOB + '\'' +
                ", studentGender='" + studentGender + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
