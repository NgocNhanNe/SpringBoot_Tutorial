package com.example.less13_springjpa.service;

import com.example.less13_springjpa.model.Student;
import com.example.less13_springjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{

    //su dung lai khong can khoi tao lai nua
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        if(null!=student){
            studentRepository.save(student);
            return student;
        }
        return null;
    }

    @Override
    public Student updateStudent(Long id, Student updateStudent) {
        Student studentCurrent = getStudentById(id);
        studentCurrent.setAge(updateStudent.getAge());
        studentCurrent.setCourse(updateStudent.getCourse());
        studentCurrent.setFirstName(updateStudent.getFirstName());
        studentCurrent.setLastName(updateStudent.getLastName());

        studentRepository.save(studentCurrent);
        return studentCurrent;
    }

    @Override
    public List<Student> getAll() {
       return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.getReferenceById(id);
    }

    @Override
    public boolean deleteStudent(Long id) {
        Student student = getStudentById(id);
        if(null != student ){
            studentRepository.delete(student);
            return true;
        }
        return false;
    }
}
