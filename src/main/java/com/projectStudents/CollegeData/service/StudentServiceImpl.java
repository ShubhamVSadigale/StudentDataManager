package com.projectStudents.CollegeData.service;

import com.projectStudents.CollegeData.entity.Student;
import com.projectStudents.CollegeData.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> fetchStudentList() {
        return studentRepository.findAll();
    }

    @Override
    public Student fetchStudentById(Long studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public void deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Student updateStudent(Long studentId, Student student) {
        Student stDB = studentRepository.findById(studentId).get();

        if(Objects.nonNull(student.getStudentFName()) &&
        !"".equalsIgnoreCase(student.getStudentFName())){
            stDB.setStudentFName(student.getStudentFName());
        }

        if(Objects.nonNull(student.getStudentLName()) &&
                !"".equalsIgnoreCase(student.getStudentLName())){
            stDB.setStudentLName(student.getStudentLName());
        }

        if(Objects.nonNull(student.getStudentUsername()) &&
                !"".equalsIgnoreCase(student.getStudentUsername())){
            stDB.setStudentUsername(student.getStudentUsername());
        }

        if(Objects.nonNull(student.getStudentEmail()) &&
                !"".equalsIgnoreCase(student.getStudentEmail())){
            stDB.setStudentEmail(student.getStudentEmail());
        }

        if(Objects.nonNull(student.getStudentPass()) &&
                !"".equalsIgnoreCase(student.getStudentPass())){
            stDB.setStudentPass(student.getStudentPass());
        }

        if(Objects.nonNull(student.getStudentPhone()) &&
                !"".equalsIgnoreCase(student.getStudentPhone().toString())){
            stDB.setStudentPhone(Long.valueOf(student.getStudentPhone().toString()));
        }

        if(Objects.nonNull(student.getStudentDOB()) &&
                !"".equalsIgnoreCase(student.getStudentDOB())){
            stDB.setStudentDOB(student.getStudentDOB());
        }

        if(Objects.nonNull(student.getStudentGender()) &&
                !"".equalsIgnoreCase(student.getStudentGender())){
            stDB.setStudentGender(student.getStudentGender());
        }

        if(Objects.nonNull(student.getStudentAddress()) &&
                !"".equalsIgnoreCase(student.getStudentAddress())){
            stDB.setStudentAddress(student.getStudentAddress());
        }

        return  studentRepository.save(stDB);
    }
}
