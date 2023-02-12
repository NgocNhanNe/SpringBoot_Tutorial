package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class GreetingController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public  String getHome(Model model) {
        model.addAttribute("smg","hi");
        Student student = studentService.getStudent();
        model.addAttribute("student", student);
        return "greeting";
    }
}
