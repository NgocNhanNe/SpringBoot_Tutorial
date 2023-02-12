package com.example.less13_springjpa.service;

import com.example.less13_springjpa.model.Student;
import com.example.less13_springjpa.repository.StudentRepository;

import java.util.List;

public interface IStudentService {

    public Student createStudent(Student student);

    public Student updateStudent(Long id, Student updateStudent);

    public List<Student> getAll();

    public Student getStudentById(Long id);

    public boolean deleteStudent(Long id);
}
