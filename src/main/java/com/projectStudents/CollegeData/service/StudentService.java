package com.projectStudents.CollegeData.service;

import com.projectStudents.CollegeData.entity.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> fetchStudentList();


    public Student fetchStudentById(Long studentId);

    public void deleteStudentById(Long studentId);

    public Student updateStudent(Long studentId, Student student);
}
