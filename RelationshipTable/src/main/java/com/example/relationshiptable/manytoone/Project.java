package com.example.relationshiptable.manytoone;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int project_id;

    @Column(name = "project_name")
    private String project_name;

    //relationship 1:n
    //tham chieu toi list tasks trong 1 project
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    List<Task> taskList;

    public Project() {

    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
