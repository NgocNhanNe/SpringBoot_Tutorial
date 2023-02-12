package com.example.less13_springjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Entity
@Table(name = "student_tb")
public class Student implements Serializable {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName", nullable = false,length = 255)
    private String firstName;


    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private String age;

    @Column(name = "course")
    private String course;

    public Student() {
        super();
    }

    public Student(Long id, String firstName, String lastName, String age, String course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
