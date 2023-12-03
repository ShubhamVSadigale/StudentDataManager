package com.projectStudents.CollegeData.controller;

import com.projectStudents.CollegeData.entity.Student;
import com.projectStudents.CollegeData.service.StudentService;
import com.projectStudents.CollegeData.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){

        return studentService.saveStudent(student);
    }

    @GetMapping("/students")
    public List<Student> fetchStudentList(){
        return studentService.fetchStudentList();
    }

    @GetMapping("/students/{id}")
    public Student fetchStudentById(@PathVariable("id") Long studentId){
        return studentService.fetchStudentById(studentId);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable("id") Long studentId){
        studentService.deleteStudentById(studentId);
        return "Student record deleted Successfully !!";
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable("id") Long studentId,
                                 @RequestBody Student student){
        return studentService.updateStudent(studentId, student);

    }
}

