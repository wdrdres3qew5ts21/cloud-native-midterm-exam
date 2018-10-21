/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.register;

import com.sit.freeelective.FreeElective.student.Student;
import com.sit.freeelective.FreeElective.student.StudentRepository;
import com.sit.freeelective.FreeElective.student.StudentService;
import com.sit.freeelective.FreeElective.subject.Subject;
import com.sit.freeelective.FreeElective.subject.SubjectRepository;
import com.sit.freeelective.FreeElective.subject.SubjectService;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin()
@RestController
public class RegisterController {

    @Autowired
    private SubjectService subjectService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private RegisterService registRegiterService;
    
    @Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping("/")
    public String helloWorld() {
        long id = 59130500097l;
        return "Hello World Son!!!" + id;
    }
    
    @GetMapping("/saveMany")
    public String testManyToMany() {
        long id = 59130500097l;
        Student student = studentRepository.findById(59130500097l).get();
        System.out.println("Work!"+student);
        Subject subject = subjectRepository.findById(1).get();
        System.out.println("Subject : "+subject);
        
        return "Hello World Son!!!" + id;
    }

    // กำลังทำ
    @PostMapping("/login")
    public ResponseEntity<HashMap> login(@RequestBody HashMap<String, Object> loginData) {
        System.out.println(loginData);
        studentService.login(loginData);
        return new ResponseEntity<HashMap>(loginData, HttpStatus.OK);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> get() {
        return new ResponseEntity<List<Student>>(studentService.getAllStudent(), HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id) {
        Student student = studentService.getStudentById(Long.parseLong(id));
        return student;
    }

    @GetMapping("/subjects")
    public Iterable<Subject> getSubect() {
        return subjectService.getAllSubjects();
    }

    @PostMapping("/register/subject")
    public ResponseEntity<Map> registerSubject(@RequestBody Map<String, Object> request) {
        registRegiterService.registerSubjectForStudent(request);
        return new ResponseEntity<Map>(request, HttpStatus.OK);
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
