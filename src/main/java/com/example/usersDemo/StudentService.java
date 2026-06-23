package com.example.usersDemo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository ss;

    public StudentService(StudentRepository ss) {
        this.ss = ss;
    }


    public void save(Student s) {
        ss.save(s);
    }


    public List<Student> findAll() {
        return ss.findAll();
    }


    public Optional<Student> find(int id) {
        return ss.findById(id);
    }


    public Student updateByRollno(int rollno, Student newStudent) {

        Optional<Student> oldStudent = ss.findByRollno(rollno);

        if(oldStudent.isPresent()) {

            Student s = oldStudent.get();

            s.setName(newStudent.getName());
            s.setRollno(newStudent.getRollno());
            s.setBranch(newStudent.getBranch());
            s.setCgpa(newStudent.getCgpa());

            return ss.save(s);
        }

        return null;
    }


    public void delete(int id) {
        ss.deleteById(id);
    }

}