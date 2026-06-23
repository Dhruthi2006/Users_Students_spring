package com.example.usersDemo;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "*")
public class StudentController {


    private StudentService ss1;


    public StudentController(StudentService ss1) {
        this.ss1 = ss1;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Student student) {
        ss1.save(student);
    }


    @GetMapping("/{rollno}")
    public Optional<Student> find(@PathVariable int rollno) {
        return ss1.find(rollno);
    }


    @GetMapping
    public List<Student> findAll() {
        return ss1.findAll();
    }

    @PutMapping("/{rollno}")
    public Student update(@PathVariable int rollno,
                          @RequestBody Student student) {

        return ss1.updateByRollno(rollno, student);
    }

    @DeleteMapping("/{rollno}")
    public void delete(@PathVariable int rollno) {
        ss1.delete(rollno);
    }

}