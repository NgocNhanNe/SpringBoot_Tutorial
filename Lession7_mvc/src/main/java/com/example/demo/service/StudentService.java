package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    //get student
    public Student getStudent(){
        Student student = new Student();
        student.setId(1);
        student.setName("nhan");
        student.setAddress("cm");

        return student;
    }
}
