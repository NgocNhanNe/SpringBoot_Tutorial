package com.example.less13_springjpa.controller;

import com.example.less13_springjpa.model.Student;
import com.example.less13_springjpa.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    //api test
    @GetMapping("/hello")
    public String test() {
        return "hello";
    }

    //api create new student
    @PostMapping("/add")
    public Student createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return student;
    }

    //api get all
    @GetMapping("/getAll")
    public List<Student> getAll() {
        return studentService.getAll();
    }

    //api getbyId
    @GetMapping("getById")
    public Student getById(@RequestParam("id") Long id) {
        return  studentService.getStudentById(id);
    }

    //api update by id
    @PutMapping("updateById")
    public Student updateById(@RequestParam("id") Long id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

    //api delete by id
    @DeleteMapping("/deleteId")
    public boolean deleteStudentById(@RequestParam("id") Long id){
        return studentService.deleteStudent(id);
    }
}
