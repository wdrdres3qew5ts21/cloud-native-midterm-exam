/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sit.freeelective.FreeElective.register;

import com.sit.freeelective.FreeElective.student.Student;
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
 * Class นี้คือ Class หลักสำหรับใช้รัน Controller ในการลงทะเบียนจองวิชา
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
    public ResponseEntity<Map<String, Object>> registerSubject(@RequestBody Map<String, Object> request) {
        return new ResponseEntity<Map<String, Object>>(registRegiterService.registerSubjectForStudent(request), HttpStatus.OK);
    }
}
