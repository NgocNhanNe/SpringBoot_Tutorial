package manytoone;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int task_id;

    @Column(name = "name")
    private String name;

    //relationship n:1
    @ManyToOne
    //join theo khoa chinh cua doi tuong project, nhieu task trong 1 project
    @JoinColumn(name = "project_id", referencedColumnName = "project_id")
    private Project project;

    public Task() {

    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
