/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author wdrdr
 */
@RestController
public class RegisterController {

    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping("/")
    public String helloWorld() {
        long id = 59130500097l;
        return "Hello World Son!!!" + id;
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> get() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(59130500097l, "Supakorn", "Trakulmaiphol", "IT", "SIT", 3));
        students.add(new Student(59130500097l, "Supakorn", "Trakulmaiphol", "IT", "SIT", 3));
        students.add(new Student(59130500097l, "Supakorn", "Trakulmaiphol", "IT", "SIT", 3));
        students.add(new Student(59130500097l, "Supakorn", "Trakulmaiphol", "IT", "SIT", 3));
        return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id) {
        System.out.println("Student ID : " + id);
        Student student = new Student(59130500097l, "Supakorn", "Trakulmaiphol", "IT", "SIT", 3);
        return student;
    }

    @GetMapping("/subjects")
    public List<Subject> getSubect() {
//        List<Subject> subjectList = new ArrayList<>();
//        subjectList.add(subjectRepository.save(new Subject(1, "INT492", "Big Data Analytic", "Dr.Prisan Pradungwiang", 30)));
//        subjectList.add(subjectRepository.save(new Subject(2, "INT491", "Cloud-native application development", "Mr.Natthawat", 30)));
//        subjectList.add(subjectRepository.save(new Subject(3, "INT491", "Management Information System", "Dr.Nipon", 30)));
//        subjectList.add(subjectRepository.save(new Subject(4, "INT492", "Data Center System Design", "Dr.Prisan Pradungwiang", 30)));
        //List<Subject> subjectList = subjectRepository.findAll().
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody Object input) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }

}
